/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gulam
 */
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class TableStyler {
    public static void applyStyle(JTable table) {
        // Header styling
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(10, 46, 161)); // Dark Blue
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Apply header styling to all columns
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        // Custom cell renderer for alternating row colors
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (!isSelected) {
                    cell.setBackground(row % 2 == 0 ? new Color(220, 220, 255) : Color.WHITE);
                    cell.setForeground(Color.BLACK);
                } else {
                    cell.setBackground(new Color(10, 46, 161)); // Selection color
                    cell.setForeground(Color.WHITE);
                }

                return cell;
            }
        });
    }
}
