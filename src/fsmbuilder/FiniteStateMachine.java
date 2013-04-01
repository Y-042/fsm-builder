package fsmbuilder;

/**
 * Finite-state machine encapsulation
 * @author Zaurbek Gasanov
 */
public class FiniteStateMachine {
    private char[] inputSymbols;    // входные символы
    private char[] states;  // состояния
    private char initialState;  // начальное состояние
    private char[][] stateTransitions;  // функция переходов
    private char[] finalStates; // заключительные состояния

    public char[] getInputSymbols() {
        return inputSymbols;
    }

    public char[] getStates() {
        return states;
    }

    public char getInitialState() {
        return initialState;
    }

    public char[][] getStateTransitions() {
        return stateTransitions;
    }

    public char[] getFinalStates() {
        return finalStates;
    }
}
