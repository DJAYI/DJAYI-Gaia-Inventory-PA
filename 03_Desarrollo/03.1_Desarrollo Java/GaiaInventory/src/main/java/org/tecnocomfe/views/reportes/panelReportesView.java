package org.tecnocomfe.views.reportes;

import org.tecnocomfe.views.reportes.dialogs.DialogGenerateReporte;

import javax.swing.*;
import java.awt.*;

public class panelReportesView {

    private JButton ReportesDeProductosButton;
    public JPanel PanelReportes = new JPanel();
    public JTable TableDeseados;
    public JTable TableComprados;
    private JLabel LabelDeseados;
    private JLabel LabelComprados;
    private JPanel panelContenedor;

    String[] columnNames = {"Nombre Deseados", "Cantidad", "Precio", "Total"};
    Object[][] data = {
            {"Camisa", 5, 100.0, 500.0},
            {"Pantalon", 10, 200.0, 2000.0},
            {"Zapatos", 15, 300.0, 4500.0}
    };

    String[] columnNames2 = {"NombreComprados", "Cantidad", "Precio", "Total"};
    Object[][] data2 = {
            {"Camisa", 5, 100.0, 500.0},
            {"Pantalon", 10, 200.0, 2000.0},
            {"Zapatos", 15, 300.0, 4500.0}
    };

    public panelReportesView() {
        PanelReportes.setLayout(new GridLayout(1, 2));


        LabelDeseados = new JLabel("Productos Deseados");
        LabelDeseados.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        TableDeseados = new JTable(data, columnNames);
        TableDeseados.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        LabelComprados = new JLabel("Productos Comprados");
        LabelDeseados.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        TableComprados = new JTable(data2, columnNames2);
        TableComprados.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelContenedor = CrearPanelContenedor();

        JPanel PanelBotones = new JPanel();

        ReportesDeProductosButton = new JButton("Generar Reporte de Productos");
        ReportesDeProductosButton.setPreferredSize(new Dimension(250, 250));

        PanelReportes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        PanelBotones.add(ReportesDeProductosButton);

        ReportesDeProductosButton.addActionListener(e -> {
            DialogGenerateReporte dialogGenerateReporte = new DialogGenerateReporte();
            dialogGenerateReporte.pack();
            dialogGenerateReporte.setVisible(true);
        });


        PanelReportes.add(panelContenedor);
        PanelReportes.add(PanelBotones);
    }

    public JPanel CrearPanelContenedor() {
        panelContenedor = new JPanel();
        panelContenedor.add(new JLabel("Reportes de Productos"));

        panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS));

        panelContenedor.add(LabelDeseados, BorderLayout.CENTER);
        panelContenedor.add(new JScrollPane(TableDeseados), BorderLayout.CENTER);

        panelContenedor.add(Box.createRigidArea(new Dimension(0, 10)));
        panelContenedor.add(LabelComprados, BorderLayout.CENTER);
        panelContenedor.add(new JScrollPane(TableComprados), BorderLayout.CENTER);

        return panelContenedor;
    }
}
