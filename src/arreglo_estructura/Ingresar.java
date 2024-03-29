
package arreglo_estructura;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Ingresar extends javax.swing.JFrame {

private Arreglo_Estructura arreglo_Estructura;
   private Arreglo_Estructura arregloEstructura;

    public Ingresar() {
        initComponents();
    }
    private String arrayToString(int[] array) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
        sb.append(array[i]);
        if (i < array.length - 1) {
            sb.append(", ");
        }
    }
    return sb.toString();
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jnumeroIngresado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jnumeroIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnumeroIngresadoActionPerformed(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese varios numeros");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Separe los numeros con una COMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jnumeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButton1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addComponent(jnumeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String numerosOrdenados = jnumeroIngresado.getText();

        String[] numerosComoString = numerosOrdenados.split(",");
        
        // Convertir los números a un array de enteros
        int[] numeros = new int[numerosComoString.length];
        for (int i = 0; i < numerosComoString.length; i++) {
            numeros[i] = Integer.parseInt(numerosComoString[i]);
        }

        // Crear una nueva instancia de Arreglo_Estructura con los números ingresados
        arregloEstructura = new Arreglo_Estructura(numeros.length);
        arregloEstructura.setNumerosAleatorios(numeros);

        // Mostrar la ventana Resultado
        Resultado resultadoForm = new Resultado(arregloEstructura);
        resultadoForm.setVisible(true);
        resultadoForm.mostrarResultados();
    }

    private void jNumeroIngresadoActionPerformed(java.awt.event.ActionEvent evt) {

    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jnumeroIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnumeroIngresadoActionPerformed
       
    }//GEN-LAST:event_jnumeroIngresadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jnumeroIngresado;
    // End of variables declaration//GEN-END:variables
}
