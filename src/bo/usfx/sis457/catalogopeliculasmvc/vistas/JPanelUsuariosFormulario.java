/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.catalogopeliculasmvc.vistas;

/**
 *
 * @author marcelo
 */
public class JPanelUsuariosFormulario extends javax.swing.JPanel {

    /**
     * Creates new form JPanelCategoriasNuevo
     */
    public JPanelUsuariosFormulario() {
        initComponents();
        jTextFieldId = new javax.swing.JTextField("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasenia = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelRol = new javax.swing.JLabel();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jLabelHabilitado = new javax.swing.JLabel();
        jCheckBoxHabilitado = new javax.swing.JCheckBox();

        jLabelUsuario.setText("Usuario:");

        jLabelContrasenia.setText("Contrasenia:");

        jButtonGuardar.setText("Guardar");

        jButtonCancelar.setText("Cancelar");

        jLabelNombre.setText("Nombre:");

        jLabelRol.setText("Rol:");

        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "operador", "administrador" }));

        jLabelHabilitado.setText("Contrasenia:");

        jCheckBoxHabilitado.setSelected(true);
        jCheckBoxHabilitado.setText("Si");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar)
                .addGap(46, 46, 46)
                .addComponent(jButtonCancelar)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelContrasenia)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPasswordFieldContrasenia)))
                    .addComponent(jTextFieldNombre)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelRol, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jComboBoxRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHabilitado)
                            .addComponent(jCheckBoxHabilitado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabilitado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxHabilitado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JCheckBox jCheckBoxHabilitado;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JLabel jLabelContrasenia;
    private javax.swing.JLabel jLabelHabilitado;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JTextField jTextFieldId;
    
    public javax.swing.JButton getJButtonGuardar() {
        return jButtonGuardar;
    }
    
    public javax.swing.JButton getJButtonCancelar () {
        return jButtonCancelar;
    }
    
    public javax.swing.JTextField getJTextFieldId() {
        return jTextFieldId;
    }
    
    public javax.swing.JTextField getJTextFieldUsuario() {
        return jTextFieldUsuario;
    }
    
    public javax.swing.JPasswordField getJPasswordFieldContrasenia() {
        return jPasswordFieldContrasenia;
    }
    
    public javax.swing.JTextField getJTextFieldNombre() {
        return jTextFieldNombre;
    }
    
    public javax.swing.JComboBox getJComboBoxRol() {
        return jComboBoxRol;
    }
    
    public javax.swing.JCheckBox getJCheckBoxHabilitado() {
        return jCheckBoxHabilitado;
    }
    
}
