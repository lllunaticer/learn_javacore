import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.json.*;
import org.apache.commons.text.StringEscapeUtils;

import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    private static String[] columns = {"Number", "FilePath", "InventionTitle", "Abstract","FileName","id"};
    public static void main(String[] args) throws IOException, InvalidFormatException{

        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat,
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

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




        //handle the JSON message:
        String str1 ="{\"0\":{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"},\"1\":{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"}}";
        //反转义，去除json中的反斜杠
        String tmp = StringEscapeUtils.unescapeJava(str1);
        //将第一层json读入JSONObeject对象
        JSONObject jsResult = new JSONObject(tmp);

        for(int i=0;i<=1;i++) {
            String s = i+"";
            //依次读取第二层JSON
            JSONObject jsAttrib = (JSONObject) jsResult.get(s);
            Row row = sheet.createRow(i+1);
            row.createCell(0)
                    .setCellValue(i);
            row.createCell(1)
                    .setCellValue(jsAttrib.getString("FilePath"));
            row.createCell(2)
                    .setCellValue(jsAttrib.getString("InventionTitle"));
            row.createCell(3)
                    .setCellValue(jsAttrib.getString("Abstract"));
            row.createCell(4)
                    .setCellValue(jsAttrib.getString("FileName"));
            row.createCell(5)
                    .setCellValue(jsAttrib.getString("id"));

            System.out.println("FilePath:" + jsAttrib.getString("FilePath"));
        }


            // Resize all columns to fit the content size
            for(int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream("test.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            // Closing the workbook
            workbook.close();


    }
}
