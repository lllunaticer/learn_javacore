import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileOutputStream;
import java.io.IOException;

public class App_v2 {
    private static String[] columns = {"Number", "FilePath", "InventionTitle", "Abstract","FileName","id"};
    public static void main(String[] args) throws IOException{

        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat,
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        //CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Sheet
        Sheet sheet = workbook.createSheet("test");

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        Gson gson = new Gson();
        String txt ="{\"0\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"}\",\n" +
                "\n" +
                "\"1\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"}\",\n" +
                "\n" +
                "\"2\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:full_text_for_invention_publication15_1423117\\\"}\"}";
        Type type = new TypeToken<Map<Integer, String>>() {}.getType();
        Type type1 = new TypeToken<Map<String, String>>() {}.getType();
        Map<Integer, String> map_outter = gson.fromJson(txt, type);
        int rowNum = 1;
        for(int key1:map_outter.keySet()) {
            Map<String,String> map_inner = gson.fromJson(map_outter.get(key1), type1);
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(key1);
            int colNum = 1;
            for(String key:map_inner.keySet()) {
                row.createCell(colNum++)
                        .setCellValue(map_inner.get(key));
                System.out.println("key:"+key+" "+"value:"+map_inner.get(key));
            }
        }


        // Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("result.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();


    }
}
