package fsmbuilder;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Custom table cell renderer that colors cells in the first column and in the
 * first row
 * @author Zaurbek Gasanov
 */
public class ColorRenderer extends DefaultTableCellRenderer {
    Color color;    // цвет, в который окрашиваются заголовочные ячейки

    /**
     * Конструктор, инициализирующий цвет заголовочных ячеек
     * @param color Цвет заголовочных ячеек
     */
    public ColorRenderer(Color color) {
        this.color = color;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent
                          (table, value, isSelected, hasFocus, row, column);
        setBackground((column == 0) ? color : Color.WHITE);
        return component;
    }
}
