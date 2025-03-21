import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.ComboBoxUI;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gulam
 */
public class Costom_ComboBox extends BasicComboBoxUI {
    private final Color selectionColor = new Color(10, 46, 161); // blue selection
    private final Color backgroundColor = new Color(213, 213, 245); // pur blue
    private final Color foregroundColor = Color.black; // black text

    public static ComboBoxUI createUI(JComponent com) {
        return new Costom_ComboBox();
    }

    @Override
    protected JButton createArrowButton() {
        JButton button = new JButton();
        button.setBackground(backgroundColor);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setFocusPainted(false);
        return button;
    }

    @Override
    protected ListCellRenderer createRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                list.setSelectionBackground(selectionColor);
                list.setBackground(backgroundColor);
                list.setForeground(foregroundColor);

                if (isSelected) {
                    setBackground(selectionColor);
                    setForeground(Color.BLACK);
                } else {
                    setBackground(backgroundColor);
                    setForeground(foregroundColor);
                }

                setFont(new Font("Arial", Font.BOLD, 14));
                setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

                return this;
            }
        };
    }

}
