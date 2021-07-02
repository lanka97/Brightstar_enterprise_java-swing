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
public class GenerateRentInvoicePDF {
    
     
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20,Font.BOLD);
    private static Font catFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD);
    private static Font catFont3 = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.ITALIC);
    
     public static void createPDF(String name,String nic, String date,
                String address, String bank, String chequeNo, String phone,String amount,String mail,ArrayList<RentedMachines> itemList)
     {
         try{
             
             
             Document document = new Document();
            Paragraph paragraph;
            
        
            
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\pasan\\Desktop\\Invoice\\" + "Rent Invoice "+date+" "+nic+".pdf"));   
            document.open();
            
            paragraph = new Paragraph("BRIGHTSTAR OFFICE AUTOMATION\n\n", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
             
             paragraph = new Paragraph("Machine Rent Invoice Issued On: "+ date +"\n"
                    +"\nCustomer Name: "+ name
                    +"\nCustomer NIC: "+ nic
                    +"\nPhone Number: "+phone 
                    +"\nCustomer Address: "+ address
                    +"\n\nCustomer Email: "+mail 
                    +"\nDeposit Amount: "+ amount
                    +"\nBank: "+ bank
                    +"\nCheque Number: "+ chequeNo
   
                    +"\n\n\n", catFont2);
             
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
            PdfPTable table = new PdfPTable(6);  
            
            table.addCell("Brand");
            table.addCell("Type");
            table.addCell("Serial Number");
            table.addCell("Copy Count");
            table.addCell("Status");
            table.addCell("Discription");
            
             for(RentedMachines item: itemList){

                table.addCell(item.getBrand());
                table.addCell(item.getType());
                table.addCell(item.getSerial());
                table.addCell(item.getCopyCount());
                table.addCell(item.getStatus());
                table.addCell(item.getDiscription());
                
            }
              
               document.add(table);
             
            paragraph = new Paragraph("\nPay Your Rent Within 1st Week Of Every Month", catFont2);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            paragraph = new Paragraph("\nThank you!", catFont);
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
             
         }catch (DocumentException ex) {
            ex.printStackTrace();
            
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }
    
}
}
