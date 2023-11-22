package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.FrmFacturacion;

public class VentaPDF {
   
    private String nombreCliente;
    private String dniCliente;
    private String telefonoCliente;
    private String direccionCliente;
    
    private String fechaActual = "";
    private String nombreArchivoPDFVenta = "";
    
    public void DatosCliente(int idCliente){
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_cliente where idCliente = '" + idCliente + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
                    
            while(rs.next()){
               nombreCliente = rs.getString("nombre") + " " + rs.getString("apellido");
               dniCliente = rs.getString("dni");
               telefonoCliente = rs.getString("telefono");
               direccionCliente = rs.getString("direccion");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del cliente: " +e);
        }
    }
    
    public void generaFacturaPDF(){
        try {
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            String fechaNueva  = "";
            for (int i = 0; i < fechaActual.length(); i++) {
                if (fechaActual.charAt(i) == '/') {
                    fechaNueva = fechaActual.replace("/", "_");
                }
            }
            nombreArchivoPDFVenta = "Venta_" + nombreCliente + "_" + fechaNueva + ".pdf";
            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombreArchivoPDFVenta);
            archivo = new FileOutputStream(file);
            
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            Image img = Image.getInstance("src/img/shoppinglist.png");
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            fecha.add("Factura: 001" + "\nFecha: " + fechaActual + "\n\n");
            
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            Encabezado.addCell(img);
            
            String ruc = "001061396059";
            String nombre = "ZERO COOPORATION";
            String telefono = "968737788";
            String direccion = "san juan bautista";
            String razon = "El trabajo duro supera al talento";
            
            Encabezado.addCell("");
            Encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre + "\nTELEFONO: " + telefono + "\nDIRECCION: " + direccion + "\nRAZON SOCIAL: " + razon);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);
            cliente.add("Datos del cliente: " + "\n\n");
            doc.add(cliente);
            
            PdfPTable tableClient  = new PdfPTable(4);
            tableClient.setWidthPercentage(100);
            tableClient.getDefaultCell().setBorder(0);
            float[] ColumnaCliente = new float[]{25f, 48f, 35f, 40f};
            tableClient.setWidths(ColumnaCliente);
            tableClient.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cliente1 = new PdfPCell(new Phrase("DNI/RUC: ", negrita));
            PdfPCell cliente2 = new PdfPCell(new Phrase("Nombre: ", negrita));
            PdfPCell cliente3 = new PdfPCell(new Phrase("Telefono: ", negrita));
            PdfPCell cliente4 = new PdfPCell(new Phrase("Direccion: ", negrita));
            
            cliente1.setBorder(0);
            cliente2.setBorder(0);
            cliente3.setBorder(0);
            cliente4.setBorder(0);
            
            tableClient.addCell(cliente1);
            tableClient.addCell(cliente2);
            tableClient.addCell(cliente3);
            tableClient.addCell(cliente4);
            
            tableClient.addCell(dniCliente);
            tableClient.addCell(nombreCliente);
            tableClient.addCell(telefonoCliente);
            tableClient.addCell(direccionCliente);
            
            doc.add(tableClient);
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);
            float[] ColumnaProducto = new float[]{15f, 50f, 25f, 20f};//45:50 video 20
            tablaProducto.setWidths(ColumnaProducto);
            tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell producto1 = new PdfPCell(new Phrase("Cantidad: ", negrita));
            PdfPCell producto2 = new PdfPCell(new Phrase("Descripcion: ", negrita));
            PdfPCell producto3 = new PdfPCell(new Phrase("Precio Unitario: ", negrita));
            PdfPCell producto4 = new PdfPCell(new Phrase("Precio Total: ", negrita));
            
            producto1.setBorder(0);
            producto2.setBorder(0);
            producto3.setBorder(0);
            producto4.setBorder(0);
            
            producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            tablaProducto.addCell(producto1);
            tablaProducto.addCell(producto2);
            tablaProducto.addCell(producto3);
            tablaProducto.addCell(producto4);
            
            for (int i = 0; i < FrmFacturacion.jTable_productos.getRowCount(); i++) {
                String producto = FrmFacturacion.jTable_productos.getValueAt(i, 1).toString();
                String cantidad = FrmFacturacion.jTable_productos.getValueAt(i, 2).toString();
                String precio = FrmFacturacion.jTable_productos.getValueAt(i, 3).toString();
                String total = FrmFacturacion.jTable_productos.getValueAt(i, 7).toString();
                
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(producto);
                tablaProducto.addCell(precio);
                tablaProducto.addCell(total);
            }
            
            doc.add(tablaProducto);
            
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a Pagar: " + FrmFacturacion.txt_total_pagar.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Cancelacion y Firma\n\n");
            firma.add("________________________");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("¡GRACIAS POR SU COMPRA!");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            doc.close();
            archivo.close();
            
            Desktop.getDesktop().open(file);
            
        } catch (DocumentException | IOException e) {
            System.out.println("Error en: " + e);
        }
    }
    
}
