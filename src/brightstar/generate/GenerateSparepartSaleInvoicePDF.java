/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brightstar.generate;

import brightstar.model.SparepartBuyer;
import brightstar.model.SparepartStock;
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
public class GenerateSparepartSaleInvoicePDF {

    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
    private static Font catFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static Font catFont3 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.ITALIC);

    public static void createPDF(String invoiceID, ArrayList<SparepartStock> itemList, SparepartBuyer buyer, String date,
            String paymentMethod, String bank, String chequeNo, String totalPrice) {

        if (paymentMethod.equals("Cash")) {

            bank = "-";
            chequeNo = "-";
        }

        try {

            Document document = new Document();
            Paragraph paragraph;

            PdfWriter.getInstance(document, new FileOutputStream("D:\\PROJECTS\\NetBeans\\BrightStar\\invoices\\" + "Invoice" + invoiceID + ".pdf"));
            document.open();

            paragraph = new Paragraph("BRIGHTSTAR OFFICE AUTOMATION\n\n", catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);

            paragraph = new Paragraph("Spareparts Sale Invoice on: " + date + "\n"
                    + "\nInvoice No: " + invoiceID
                    + "\nCustomer Name: " + buyer.getName()
                    + "\nCustomer NIC: " + buyer.getNIC()
                    + "\nAddress: " + buyer.getAddress()
                    + "\nTel: " + buyer.getPhone()
                    + "\n\nPayment: " + paymentMethod
                    + "\nBank: " + bank
                    + "\nCheque No: " + chequeNo
                    + "\n\n", catFont2);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);

            PdfPTable table = new PdfPTable(7);

            table.addCell("Brand");
            table.addCell("Model");
            table.addCell("Part Name");
            table.addCell("Part Number");
            table.addCell("Quantity");
            table.addCell("Unit Price");
            table.addCell("Total");

            for (SparepartStock item : itemList) {

                table.addCell(item.getBrand());
                table.addCell(item.getModel());
                table.addCell(item.getPartname());
                table.addCell(item.getPartNumber());
                table.addCell(String.valueOf(item.getQuantity()));
                table.addCell(String.valueOf(item.getUnitPrice()));
                table.addCell(String.valueOf(item.getTotal()));

            }

            document.add(table);

            paragraph = new Paragraph("\nTotal Price: Rs. " + totalPrice, catFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);

            paragraph = new Paragraph("\nThank you!", catFont2);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);

            document.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateSparepartSaleInvoicePDF.class.getName()).log(Level.SEVERE, null, ex);

        } catch (DocumentException ex) {
            Logger.getLogger(GenerateSparepartSaleInvoicePDF.class.getName()).log(Level.SEVERE, null, ex);

        }

        //GenerateEmail.create_sendEmail("invoice", "pasan.godamune@gmail.com");
    }

}
