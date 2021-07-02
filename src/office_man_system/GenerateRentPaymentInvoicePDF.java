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
public class GenerateRentPaymentInvoicePDF {
    
    
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD);
    private static Font catFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD);
    private static Font catFont3 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.ITALIC);
    
     public static void createPDF(String nic, String date,
                String paymentMethod, String bank, String chequeNo, String totalPrice,String name,String serial,String brand,
                String month,String copycount)
     {
         try{
             
             
             Document document = new Document();
            Paragraph paragraph;
            
        
            
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Pasindu Senarathne\\Desktop\\Invoice\\" + "Invoice " + serial +" "+month+".pdf"));   
            document.open();
            
            paragraph = new Paragraph("BRIGHTSTAR OFFICE AUTOMATION\n\n", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
             
             paragraph = new Paragraph("Machine Rent Payment Invoice Issued On: "+ date +"\n"
                    +"\nCustomer Name: "+ name
                    +"\nCustomer NIC: "+ nic
                    +"\nMachine Serial: "+serial 
                    +"\nBrand: "+ brand
                    +"\nMonth: "+month 
                    +"\n\nPayment: "+ paymentMethod
                    +"\nBank: "+ bank
                    +"\nCheque No: "+ chequeNo
                     +"\nCurrent Copy Count: "+ copycount
                     
                     
                    +"\n\n", catFont2);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
             
            paragraph = new Paragraph("\nTotal Rent: Rs." + totalPrice, catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("\nThank you!", catFont2);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("\n___________________", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("Customer's Signature", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("\n___________________", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("Owner's Signature", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            document.close();
             
         }catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        } catch (DocumentException ex) {
            ex.printStackTrace();
            
        }
         
         
         
     }
    
}
