
package reports;

import db.dbconnect;
import java.awt.Container;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;


public class reportGen extends JFrame {

    public reportGen(String filename) throws ClassNotFoundException {
        try {
            Connection con = dbconnect.connect();
            JasperPrint print = JasperFillManager.fillReport(filename, null, con);
            JRViewer jr = new JRViewer(print);
            Container contain = getContentPane();
            contain.add(jr);
            setVisible(true);
            setBounds(10, 10, 800, 660);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(this, "JRE Error");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(reportGen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public reportGen(String filename, HashMap hash) throws ClassNotFoundException {
        try {
            Connection con = dbconnect.connect();
            JasperPrint print = JasperFillManager.fillReport(filename, hash, con);
            JRViewer jr = new JRViewer(print);
            Container contain = getContentPane();
            contain.add(jr);
            setVisible(true);
            setBounds(10, 10, 800, 660);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(this, "JRE Error");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(reportGen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
