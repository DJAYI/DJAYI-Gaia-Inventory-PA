package org.tecnocomfe.views.categorias;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GestionCategoriaView {
    public JPanel panelCategorias;
    private JTable TableCategorias;
    private JButton BtnCrearCategoria;
    private JButton BtnEliminarCategoria;
    private JButton BtnEditarCategoria;

    public GestionCategoriaView() {

        String[] columnNames = {"Nombre", "Descripcion"};
        Object[][] data = {
                {"Camisa", "Ropa de vestir"},
                {"Pantalon", "Ropa de vestir"},
                {"Zapatos", "Calzado"}
        };

        TableCategorias.setModel(new DefaultTableModel(data, columnNames));

        BtnCrearCategoria.addActionListener(e -> {
            // JDialog dialog = Dialogo crear categoria;

        });

        BtnEliminarCategoria.addActionListener(e -> {
            // JDialog dialog = Dialogo eliminar categoria;
        });

        BtnEditarCategoria.addActionListener(e -> {
            // JDialog dialog = Dialogo editar categoria;
        });
    }
}
