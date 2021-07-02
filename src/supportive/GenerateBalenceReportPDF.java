/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supportive;


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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author pasan
 */
public class GenerateBalenceReportPDF {

    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
    private static Font catFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.BOLD);
    private static Font catFont3 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.ITALIC);

    public static void createPDF(String expBill,String expSal ,String expOther, String expRent,String expSup ,String expTotal,
                                String machine, String sp , String rents, String inTotal ,String prof ) {

        

        try {

            Document document = new Document();
            Paragraph paragraph;
            
            Date date1 = new Date();

            PdfWriter.getInstance(document, new FileOutputStream("D:\\PROJECTS\\NetBeans\\BrightStar\\balanceReport\\" + "Balenced_Report" + ".pdf"));
            document.open();

            paragraph = new Paragraph("BRIGHTSTAR OFFICE AUTOMATION\n\n", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);

            paragraph = new Paragraph("Balence Report\n\n", catFont2);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
            paragraph = new Paragraph("Bills(phone,Water,Electricity)  " +expBill +"\n"
                                     +"Rents & maintenance                "+expRent+"\n"
                                     +"Empolyee Salaries                    "+expSal+"\n"
                                     +"Supplies                                    "+expSup+"\n"
                                     +"Other                                        "+expOther+"\n\n"
                                     +"Expenditure Total               "+expTotal+"\n\n"
                                     +"Machine Sales                   "+machine+"\n"
                                     +"Machine Rent                    "+rents+"\n"
                                     +"Spair Part Sales                "+sp+"\n\n"
                                     +"Total Income                    "+inTotal+"\n\n\n"
                                     +"Approximetly Profit             "+prof+"\n",catFont3);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
            document.close();
            

        

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateBalenceReportPDF.class.getName()).log(Level.SEVERE, null, ex);

        } catch (DocumentException ex) {
            Logger.getLogger(GenerateBalenceReportPDF.class.getName()).log(Level.SEVERE, null, ex);

        }

        //GenerateEmail.create_sendEmail("invoice", "pasan.godamune@gmail.com");

        //GenerateEmail.create_sendEmail("invoice", "pasan.godamune@gmail.com");
    }

   
}
