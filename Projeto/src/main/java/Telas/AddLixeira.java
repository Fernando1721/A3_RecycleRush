package Telas;

import Model.ConnectionFactory;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author é o r's
 */
public class AddLixeira extends javax.swing.JFrame {

    static String login;
    static int scoreArmazenado;
    
    /**
     * Creates new form AddLixeira
     */
    public AddLixeira(String login, int score) {
        super("ADICIONAR LIXEIRA");
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.login = login;
        this.scoreArmazenado = score;  
        
        btnAdicionarLixeira.setEnabled(false);
        btnAlterarLixeira.setEnabled(false);
        btnExcluirLixeira.setEnabled(false);
        btnCarregarFoto.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtCor = new javax.swing.JTextField();
        cboTipo = new javax.swing.JComboBox<>();
        btnAdicionarLixeira = new javax.swing.JButton();
        btnAlterarLixeira = new javax.swing.JButton();
        btnExcluirLixeira = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnCarregarFoto = new javax.swing.JButton();
        txtCaminhoImg = new javax.swing.JTextField();
        btnPesquisarLixeira = new javax.swing.JButton();
        txtIdLixeira = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtCor.setBorder(javax.swing.BorderFactory.createTitledBorder("COR DA LIXEIRA"));
        txtCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorKeyTyped(evt);
            }
        });

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo da lixeira:", "Metal", "Vidro", "Papel", "Orgânico", "Plástico" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        btnAdicionarLixeira.setBackground(new java.awt.Color(0, 106, 67));
        btnAdicionarLixeira.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarLixeira.setText("Adicionar");
        btnAdicionarLixeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarLixeira.setEnabled(false);
        btnAdicionarLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarLixeiraActionPerformed(evt);
            }
        });

        btnAlterarLixeira.setBackground(new java.awt.Color(0, 106, 67));
        btnAlterarLixeira.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarLixeira.setText("Alterar");
        btnAlterarLixeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarLixeira.setEnabled(false);
        btnAlterarLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarLixeiraActionPerformed(evt);
            }
        });

        btnExcluirLixeira.setBackground(new java.awt.Color(0, 106, 67));
        btnExcluirLixeira.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirLixeira.setText("Excluir");
        btnExcluirLixeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirLixeira.setEnabled(false);
        btnExcluirLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLixeiraActionPerformed(evt);
            }
        });

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblImagem.setPreferredSize(new java.awt.Dimension(120, 120));

        btnCarregarFoto.setBackground(new java.awt.Color(0, 106, 67));
        btnCarregarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregarFoto.setText("Carregar foto");
        btnCarregarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarregarFoto.setEnabled(false);
        btnCarregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarFotoActionPerformed(evt);
            }
        });

        txtCaminhoImg.setBorder(javax.swing.BorderFactory.createTitledBorder("CAMINHO DA IMAGEM"));

        btnPesquisarLixeira.setBackground(new java.awt.Color(0, 106, 67));
        btnPesquisarLixeira.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarLixeira.setText("Pesquisar");
        btnPesquisarLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLixeiraActionPerformed(evt);
            }
        });

        txtIdLixeira.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        txtIdLixeira.setEnabled(false);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miranda\\Pictures\\setaVoltar.png")); // NOI18N
        jButton2.setToolTipText("Voltar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCaminhoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdicionarLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnAlterarLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluirLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCarregarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234)
                                .addComponent(txtIdLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnPesquisarLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton2)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnPesquisarLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtCaminhoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionarLixeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarLixeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirLixeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarregarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
         if(cboTipo.getSelectedItem().equals("Metal")){
            txtCor.setText("Amarela");
        } else if(cboTipo.getSelectedItem().equals("Vidro")){
            txtCor.setText("Verde");
        } else if(cboTipo.getSelectedItem().equals("Papel")){
            txtCor.setText("Azul");
        } else if(cboTipo.getSelectedItem().equals("Orgânico")){
            txtCor.setText("Marrom");
        } else if(cboTipo.getSelectedItem().equals("Plástico")){
            txtCor.setText("Vermelho");
        }
    }//GEN-LAST:event_cboTipoActionPerformed

    private void btnAdicionarLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarLixeiraActionPerformed
        // TODO add your handling code here:
        adicionarLixeira();
    }//GEN-LAST:event_btnAdicionarLixeiraActionPerformed

    private void btnAlterarLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarLixeiraActionPerformed
        // TODO add your handling code here:
        alterarLixeira();
    }//GEN-LAST:event_btnAlterarLixeiraActionPerformed

    private void btnExcluirLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLixeiraActionPerformed
        // TODO add your handling code here:
        excluirLixeira();
    }//GEN-LAST:event_btnExcluirLixeiraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCarregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarFotoActionPerformed
        // TODO add your handling code here:
        carregarFoto();
    }//GEN-LAST:event_btnCarregarFotoActionPerformed

    private void btnPesquisarLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLixeiraActionPerformed
        // TODO add your handling code here:
        pesquisarLixeira();
    }//GEN-LAST:event_btnPesquisarLixeiraActionPerformed

    private void txtCorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLixeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLixeira(login, scoreArmazenado).setVisible(true);
            }
        });
    }
    
    ConnectionFactory cf = new ConnectionFactory();
    private FileInputStream fis;
    private File icon;
    private int tamanho;
    private BufferedImage bfi;
    
    private void pesquisarLixeira() {
        if (txtCor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite a cor da lixeira");
            txtCor.requestFocus();
        } else {
            String read = "select * from tb_lixeira where tipoLixeira = ?";
                try {
                    Connection con = cf.conectar();
                    PreparedStatement pst = con.prepareStatement(read);
                    pst.setString(1, cboTipo.getSelectedItem().toString());
                    ResultSet rs = pst.executeQuery();
                    limparCampos();
                    txtIdLixeira.setText(null);
                    if (rs.next()) {
                        txtIdLixeira.setText(rs.getString("idLixeira"));
                        cboTipo.setSelectedItem(rs.getString("tipoLixeira"));
                        txtCaminhoImg.setText(rs.getString("imglixeira"));
                        File imgsave = new File(rs.getString("imglixeira"));
                        tamanho = (int)  imgsave.length();
                        Image foto = ImageIO.read(imgsave).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(),Image.SCALE_SMOOTH);
                        lblImagem.setIcon(new ImageIcon(foto));
                        lblImagem.updateUI();
                        btnCarregarFoto.setEnabled(true);
                        btnAlterarLixeira.setEnabled(true);
                        btnExcluirLixeira.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lixeira não cadastrada");
                        limparCampos();
                        btnAdicionarLixeira.setEnabled(true);
                        btnCarregarFoto.setEnabled(true);
                    }
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
            }
        }
    }
    
    private void adicionarLixeira() {

        if (cboTipo.getSelectedItem().equals("Selecione o tipo da lixeira")) {
                JOptionPane.showMessageDialog(null, "Informe o tipo da lixeira");
                cboTipo.requestFocus();
        } else if (txtCor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a cor da lixeira");
                txtCor.requestFocus();
        } else if (txtCaminhoImg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o caminho da imagem da lixeira");
                txtCaminhoImg.requestFocus();
        } else {
            String create = "insert into tb_lixeira(tipoLixeira, corLixeira, imglixeira) values (?,?,?)";
            try {
                bfi = ImageIO.read(icon);
                URL url = getClass().getResource("../");
                String pathIcon = url.getPath().substring(1) + "img/" + icon.getName();
                File imgsave = new File(pathIcon);
                ImageIO.write(bfi, "png" , imgsave);
                Connection con = cf.conectar();
                PreparedStatement pst = con.prepareStatement(create);
                pst.setString(1, cboTipo.getSelectedItem().toString());
                pst.setString(2, txtCor.getText());
                pst.setString(3, txtCaminhoImg.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Lixeira adicionada com sucesso");
                limparCampos();
                txtIdLixeira.setText(null);
                cboTipo.setSelectedItem("Selecione o tipo da lixeira");
                txtCor.setText(null);
                con.close();       
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void alterarLixeira() {
		
        if (txtCor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a cor da lixeira");
                txtCor.requestFocus();
        } else if (cboTipo.getSelectedItem().equals("Selecione o tipo da lixeira")) {
                JOptionPane.showMessageDialog(null, "Informe o tipo da lixeira");
                cboTipo.requestFocus();
        } else if (txtCaminhoImg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o caminho da imagem da lixeira");
                txtCaminhoImg.requestFocus();
        } else {
            String update = "update tb_lixeira set corLixeira=?, tipoLixeira=?, imglixeira=? where idLixeira=?";
            try {
                Connection con = cf.conectar();
                PreparedStatement pst = con.prepareStatement(update);
                pst.setString(1, txtCor.getText());
                pst.setString(2, cboTipo.getSelectedItem().toString());
                pst.setString(3, txtCaminhoImg.getText());
                pst.setString(4, txtIdLixeira.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Lixeira alterada com sucesso");
                limparCampos();
                txtIdLixeira.setText(null);
                cboTipo.setSelectedItem(null);   
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    private void excluirLixeira() {
        if (txtIdLixeira.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Id da lixeira");
            txtIdLixeira.requestFocus();
        } else{
                int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exclusão da lixeira", "Atenção!", JOptionPane.YES_NO_OPTION);
                if (confirma == JOptionPane.YES_OPTION) {
                        String delete = "delete from tb_lixeira where idLixeira=?";
                try {
                    Connection con = cf.conectar();
                    PreparedStatement pst = con.prepareStatement(delete);
                    pst.setString(1, txtIdLixeira.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Lixeira excluida com sucesso");
                    limparCampos();
                    txtIdLixeira.setText(null);
                    cboTipo.setSelectedItem("Selecione o tipo da lixeira");
                    txtCor.setText(null);
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    
    private void carregarFoto(){
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("Selecionar arquivo");
            jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens(*.PNG,*.JPG,*.JPEG)","png","jpg","jpeg"));
            int resultado = jfc.showOpenDialog(this);
            if(resultado == JFileChooser.APPROVE_OPTION);
            try{
                icon = jfc.getSelectedFile();
                URL url = getClass().getResource("../");
                String path = url.getPath().substring(1) + "img/";
                File directory = new File(path);
      
                if (!directory.exists()){
                    directory.mkdir();
                }
                String pathIcon = path + icon.getName();
                txtCaminhoImg.setText(pathIcon);
                //fis = new FileInputStream(jfc.getSelectedFile());
                tamanho = (int) jfc.getSelectedFile().length();
                Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(),Image.SCALE_SMOOTH);
                lblImagem.setIcon(new ImageIcon(foto));
                lblImagem.updateUI();
            }catch (Exception e){
                e.printStackTrace();
        }
    }
    
    private void limparCampos() {  
        txtCor.setText(null);
        txtCaminhoImg.setText(null);
        lblImagem.setIcon(null);
        btnCarregarFoto.setEnabled(false);
        btnAdicionarLixeira.setEnabled(false);
        btnAlterarLixeira.setEnabled(false);
        btnExcluirLixeira.setEnabled(false);	
    }
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarLixeira;
    private javax.swing.JButton btnAlterarLixeira;
    private javax.swing.JButton btnCarregarFoto;
    private javax.swing.JButton btnExcluirLixeira;
    private javax.swing.JButton btnPesquisarLixeira;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtCaminhoImg;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtIdLixeira;
    // End of variables declaration//GEN-END:variables
}