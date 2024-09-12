package org.tecnocomfe.views;

import org.tecnocomfe.views.reportes.panelReportesView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainView extends JFrame {
    public JPanel panel1;
    private JPanel panelContainer;
    private JButton BtnReportes;
    private JButton BtnMovimientos;
    private JButton BtnProductos;
    private JButton BtnCategorias;
    private JButton BtnUsuarios;
    private JButton BtnRoles;
    private JButton BtnLogout;
    private JButton BtnDashboard;
    private JPanel PanelDashboard;
    private CardLayout cardLayout;

    public MainView() {
        setTitle("Gaia Inventory");
        setVisible(true);
        setContentPane(panel1);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        PanelDashboard.setLayout(cardLayout);
        panelReportesView panelReportesView = new panelReportesView();

        setResizable(false);


        // Crear los paneles individuales que se mostrarán en el Dashboard
        JPanel panelDashboard = new JPanel();
        panelDashboard.add(new JLabel("Dashboard"));

        JPanel panelReportes = panelReportesView.PanelReportes;

        JPanel panelMovimientos = new JPanel();
        panelMovimientos.add(new JLabel("Movimientos"));

        JPanel panelProductos = new JPanel();
        panelProductos.add(new JLabel("Productos"));

        JPanel panelCategorias = new JPanel();
        panelCategorias.add(new JLabel("Categorias"));

        JPanel panelUsuarios = new JPanel();
        panelUsuarios.add(new JLabel("Usuarios"));

        JPanel panelRoles = new JPanel();
        panelRoles.add(new JLabel("Roles"));

        // Agregar los paneles al PanelDashboard
        PanelDashboard.add(panelDashboard, "dashboard");
        PanelDashboard.add(panelReportes, "reportes");
        PanelDashboard.add(panelMovimientos, "movimientos");
        PanelDashboard.add(panelProductos, "productos");
        PanelDashboard.add(panelCategorias, "categorias");
        PanelDashboard.add(panelUsuarios, "usuarios");
        PanelDashboard.add(panelRoles, "roles");


        // Listeners para los botones
        BtnDashboard.addActionListener(e -> {
            cardLayout.show(PanelDashboard, "dashboard");
        });
        BtnReportes.addActionListener(e -> {
            cardLayout.show(PanelDashboard, "reportes");
        });
        BtnMovimientos.addActionListener(e -> {
            cardLayout.show(PanelDashboard, "movimientos");
        });
        BtnProductos.addActionListener(e -> {
            cardLayout.show(PanelDashboard, "productos");
        });
        BtnCategorias.addActionListener(e -> {
            cardLayout.show(PanelDashboard, "categorias");
        });
        BtnUsuarios.addActionListener(e -> {
            cardLayout.show(PanelDashboard, "usuarios");
        });
        BtnRoles.addActionListener(e -> {
            cardLayout.show(PanelDashboard, "roles");
        });


        BtnLogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AuthView authView = new AuthView();
                dispose();
            }
        });
    }
}
