package com.ucreativa.vacunacion.ui;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo) {
        super(titulo);
    }

    public void build() {
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5, 2));
    }

    private void agregarComponente(Component componente) {
        super.getContentPane().add(componente);

    }

    private void crearComponentes() {
        JLabel lblNombre = new JLabel(("Nombre Completo"));
        JLabel lblcedula = new JLabel(("Documento de Identidad"));
        JLabel Lbledad = new JLabel("Edad");
        JLabel lblriesgo = new JLabel("Posee algun Factor de riesgo");
        JLabel lblisAmigo = new JLabel("Es amigo o conocido");
        JLabel lblrelacion = new JLabel("cual es larelacion");
        JLabel lblfacebook = new JLabel("tiene facebook");
        JLabel lblparentesco = new JLabel("cual es el parentesco");
        JLabel lblmarca = new JLabel("marca de vacuna suministrada");

        JTextField txtNombre = new JTextField();
        JTextField txtcedula = new JTextField();
        JTextField txtedad = new JTextField();
        JTextField txtrelacion = new JTextField();
        JTextField txtfacebook = new JTextField();
        JTextField txtparentesco = new JTextField();
        JTextField txtmarca = new JTextField();

        JCheckBox txtriesgo = new JCheckBox();
        JCheckBox txtisAmigo = new JCheckBox();
        txtisAmigo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblparentesco.setVisible(!txtisAmigo.isSelected());
                txtparentesco.setVisible(!txtisAmigo.isSelected());
                lblrelacion.setVisible(txtisAmigo.isSelected());
                txtrelacion.setVisible(txtisAmigo.isSelected());
                lblfacebook.setVisible(txtisAmigo.isSelected());
                txtfacebook.setVisible(txtisAmigo.isSelected());
            }
        });


        JButton guardar = new JButton("Guardar");
        guardar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                service.save(txtNombre.getText(),
                        txtcedula.getText(),
                        txtedad.getText(),
                        txtriesgo.isSelected(),
                        txtisAmigo.isSelected(),
                        txtrelacion.getText(),
                        txtfacebook.getText(),
                        txtparentesco.getText(),
                        txtmarca.getText());

                txtNombre.setText("");
                txtcedula.setText("");
                txtedad.setText("");
                txtriesgo.setText("");
                txtisAmigo.setText("");
                txtrelacion.setText("");
                txtfacebook.setText("");
                txtparentesco.setText("");
                txtmarca.setText("");

                String reporte = null;
                try {
                    reporte = String.join("\n", service.get());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);
            }

        });


        this.agregarComponente(lblNombre);
        this.agregarComponente((txtNombre));
        this.agregarComponente(lblcedula);
        this.agregarComponente((txtcedula));
        this.agregarComponente(Lbledad);
        this.agregarComponente((txtedad));
        this.agregarComponente(lblriesgo);
        this.agregarComponente((txtriesgo));
        this.agregarComponente(lblisAmigo);
        this.agregarComponente((txtisAmigo));
        this.agregarComponente(lblrelacion);
        this.agregarComponente((txtrelacion));
        this.agregarComponente(lblfacebook);
        this.agregarComponente((txtfacebook));
        this.agregarComponente(lblparentesco);
        this.agregarComponente((txtparentesco));
        this.agregarComponente(lblmarca);
        this.agregarComponente((txtmarca));
        this.agregarComponente(guardar);


    }
}
