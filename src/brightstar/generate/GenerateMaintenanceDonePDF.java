/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.generate;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author pasan
 */
public class GenerateMaintenanceDonePDF {
    
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD);
    private static Font catFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD);
    private static Font catFont3 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.ITALIC);
    
    public static void createPDF(String ComplainId, String MaintenanceStatus , String Completeddate){
    
        try {
            
            Document document = new Document();
            Paragraph paragraph;
            
        
            
            PdfWriter.getInstance(document, new FileOutputStream("D:\\PROJECTS\\NetBeans\\BrightStar\\maintain\\" + "ComplainId" + ComplainId + ".pdf"));   
            document.open();
            
            paragraph = new Paragraph("BRIGHTSTAR OFFICE AUTOMATION\n\n", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("Maintenance Complete on: "+ Completeddate +"\n"
                    +"\nComplainId : "+ ComplainId
                    
                    +"\nMaintenance Status: "+ MaintenanceStatus
                    +"\n\n", catFont2);
            
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
            paragraph = new Paragraph("\n", catFont);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
            paragraph = new Paragraph("\nYour maintaince has been completed,If you have any complain please contact Us"
                    , catFont2);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("\nThank you!", catFont2);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
            document.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateMaintenanceDonePDF.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (DocumentException ex) {
            Logger.getLogger(GenerateMaintenanceDonePDF.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        
        //GenerateEmail.create_sendEmail("invoice", "pasan.godamune@gmail.com");
        
        
        
        //GenerateEmail.create_sendEmail("invoice", "pasan.godamune@gmail.com");
        
    }
    
}
