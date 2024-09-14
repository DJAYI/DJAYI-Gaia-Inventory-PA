package org.tecnocomfe.views.reportes.dialogs;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DialogGenerateReporte extends JDialog {
    private JPanel contentPane;
    private JTable TableReporte;
    private JComboBox ComboBoxTipoReporte;
    private JButton BtnFilterReporte;
    private JButton BtnImprimirReporte;
    private JButton BtnSalir;
    private JPanel PanelTablaReportes;

    public DialogGenerateReporte() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setResizable(false);

        BtnSalir.addActionListener(e -> {
            dispose();
        });
        Object[][] data = {
                {"Camisa", 5, 100.0, 500.0},
                {"Pantalon", 10, 200.0, 2000.0},
                {"Zapatos", 15, 300.0, 4500.0}
        };

        String[] tiposReporte = {"Productos", "Movimientos", "Usuarios", "Roles"};
        TableReporte.setModel(new DefaultTableModel(data, tiposReporte));

        String tipoReporte = ComboBoxTipoReporte.getSelectedItem().toString();
        BtnFilterReporte.addActionListener(e -> {
            switch (tipoReporte) {
                case "Productos":
                    data[0] = new Object[][]{
                            {"Camisa", 5, 100.0, 500.0},
                            {"Pantalon", 10, 200.0, 2000.0},
                            {"Zapatos", 15, 300.0, 4500.0}
                    };
                    break;
                case "Movimientos":
                    data[0] = new Object[][]{
                            {"Entrada", "Camisa", 5, 100.0, 500.0},
                            {"Salida", "Pantalon", 10, 200.0, 2000.0},
                            {"Entrada", "Zapatos", 15, 300.0, 4500.0}
                    };
                    break;
                case "Usuarios":
                    data[0] = new Object[][]{
                            {"Admin", "admin", "admin"},
                            {"User", "user", "user"}
                    };
                    break;
                case "Roles":
                    data[0] = new Object[][]{
                            {"Admin", "admin"},
                            {"User", "user"}
                    };
                    break;
            }
        });


    }
}
