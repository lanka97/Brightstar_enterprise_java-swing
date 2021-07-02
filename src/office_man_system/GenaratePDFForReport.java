/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_man_system;

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
 * @author Pasindu Senarathne
 */
public class GenaratePDFForReport {
    
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD);
    private static Font catFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD);
    private static Font catFont3 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.ITALIC);
    
    
    public static void createPDF(String month,String numOfRentedMachines,String numOfPendingPayments, String profit,
                String mostRentedBrand, String newMachines, String usedMachines, String colorMachines,String blackMachines,String mostIssuedCus,
                String mostIssuedMachine,String mostUsedMethod,String mostRentDay)
     {
         try{
             
             
             Document document = new Document();
            Paragraph paragraph;
            
        
            
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\pasan\\Desktop\\Invoice\\" + "Analysis Report ("+month+").pdf"));   
            document.open();
            
            paragraph = new Paragraph("BRIGHTSTAR OFFICE AUTOMATION\n\n", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
             
             paragraph = new Paragraph("Analysis Report For: "+ month +"\n"
                    +"\nNumber Of Rented Machines:  "+ numOfRentedMachines
                    +"\nNumber Of Pending Payments:  "+ numOfPendingPayments
                    +"\nTotal Rent Profits:  Rs."+profit 
                    +"\nMost Rented Machine Brand:  "+ mostRentedBrand
                    +"\n\nNumber Of Brand New Machines Rented:  "+newMachines 
                    +"\nNumber Of Used Machines Rented:  "+ usedMachines
                    +"\nMost Rented Machine Type:  "+mostIssuedMachine
                    +"\nNumber Of Color Machine Rented:  "+ colorMachines
                    +"\nNumber Of Black Machine Rented:  "+ blackMachines
                    +"\nMost Machine Rented Customer:  "+ mostIssuedCus
                    +"\nMost Used Payment Method:  "+ mostUsedMethod
                    +"\nDay Of Most Machine Rented:  "+ mostRentDay
   
                    +"\n\n\n", catFont2);
             
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
             
            paragraph = new Paragraph("\n___________________", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("Report Genarated Person", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("\n___________________", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("Owner's Signature", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            document.close();
             
         }catch (DocumentException ex) {
            ex.printStackTrace();
            
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }
    
    
}
}
