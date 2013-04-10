package fsmbuilder;

import javax.swing.table.AbstractTableModel;

/**
 * Custom table model that represents finite-state machine's state transitions
 * @author Zaurbek Gasanov
 */
public class FSMTableModel extends AbstractTableModel {
    private String[] columnNames;
    private char[][] data;

    public FSMTableModel(FiniteStateMachine machine) {
        columnNames = new String[machine.getStates().length + 1];
        for (int col = 1; col < columnNames.length; col++) {
            columnNames[col] = "" + machine.getStates()[col - 1];
        }
        data = new char[machine.getInputSymbols().length]
                [machine.getStates().length + 1];
        for (int row = 0; row < machine.getInputSymbols().length; row++) {
            data[row][0] = machine.getInputSymbols()[row];
        }
        for (int row = 0; row < machine.getInputSymbols().length; row++) {
            for (int col = 1; col < machine.getStates().length + 1; col++) {
                char transition = machine.getStateTransitions()[row][col - 1];
                if (transition == RegularGrammar.EMPTY_TRANSITION) {
                    transition = ' ';
                }
                data[row][col] = transition;
            }
        }
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return data[0].length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col]; 
    }
}
