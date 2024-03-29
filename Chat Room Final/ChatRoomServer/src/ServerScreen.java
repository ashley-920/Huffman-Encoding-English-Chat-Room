
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ashley
 */
public class ServerScreen extends javax.swing.JFrame {

    /**
     * Creates new form ServerScreen
     */
    static Server server;
    static CodeBook codebook;
    static CodeBookManager cbm;
    public static JTextArea serverStatus;
    static LogManager logManager;
    static boolean isFrist = true;
    static JTextArea _codebookArea;
    static HuffmanEncoder encoder;
    static HuffmanDecoder decoder;
    static ArrayList<ClientUser> clientList;
    static Broadcaster broadcaster;
    static WordFreqManager wfm;
    static JTextArea wordcountArea;

    public ServerScreen() {
        initComponents();
        _codebookArea = this.codebookArea;
        serverStatus = this.serverStatusArea;
        wordcountArea=this.wordCountArea;
        serverStatus.setEditable(false);
        logManager = new LogManager();
        codebook = new CodeBook();        
        cbm = new CodeBookManager(codebook);
        cbm.initCodebook();                     //generate codebook or read codebook
        clientList=new ArrayList<ClientUser>();
        broadcaster=new Broadcaster(clientList);
        encoder=new HuffmanEncoder();
        decoder=new HuffmanDecoder();
        updateCodebookArea();
        this.updateWordCountArea();
        server = new Server();
        server.start();      
        logManager.doLog("Server is ON!");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage("logo.gif");        
        this.setIconImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateBut = new javax.swing.JButton();
        openLogBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        serverStatusArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        codebookArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        wordCountArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Message Encoding Chat Room v.1.0");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Chat Room Server");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Server Status");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("codebook Status");

        updateBut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        updateBut.setText("Update Codebook");
        updateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButActionPerformed(evt);
            }
        });

        openLogBut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        openLogBut.setText("Open Log File");
        openLogBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openLogButActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        serverStatusArea.setColumns(20);
        serverStatusArea.setLineWrap(true);
        serverStatusArea.setRows(5);
        jScrollPane1.setViewportView(serverStatusArea);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Word Count");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        codebookArea.setColumns(20);
        codebookArea.setLineWrap(true);
        codebookArea.setRows(5);
        jScrollPane3.setViewportView(codebookArea);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        wordCountArea.setColumns(20);
        wordCountArea.setRows(5);
        jScrollPane4.setViewportView(wordCountArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(updateBut)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openLogBut)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBut, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(openLogBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateCodebookArea() {
        StringBuffer buffer = new StringBuffer();
        for (Map.Entry<String, String> entry : cbm.getContent().getEntrySet()) {
            buffer.append(entry.getKey() + "\t=>" + entry.getValue() + "\n");
        }
        ServerScreen._codebookArea.setText(buffer.toString());
    }
    public static void updateWordCountArea(){
        wfm=new WordFreqManager();
        StringBuffer buffer = new StringBuffer();
        for (Map.Entry<String, Integer> entry : wfm.getFrquency().entrySet()) {
            buffer.append(entry.getKey() + "\t=>" + entry.getValue() + "\n");
        }
        wordcountArea.setText(buffer.toString());
    }
    
    private void updateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButActionPerformed
        // TODO add your handling code here:
        cbm.updateCodeBook();  
        this.updateCodebookArea();
    }//GEN-LAST:event_updateButActionPerformed

    private void openLogButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLogButActionPerformed
        try {
            // TODO add your handling code here:
            File log = new File("log.txt");
            if (log.exists()) {
                Runtime.getRuntime().exec(
                        "cmd.exe /c start rundll32 url.dll,FileProtocolHandler "
                        + "log.txt");
            }

        } catch (Exception ex) {
            Logger.getLogger(ServerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openLogButActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    //com.jtattoo.plaf.acryl.AcrylLookAndFeel
                    //com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerScreen().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea codebookArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton openLogBut;
    private javax.swing.JTextArea serverStatusArea;
    private javax.swing.JButton updateBut;
    private javax.swing.JTextArea wordCountArea;
    // End of variables declaration//GEN-END:variables
}
