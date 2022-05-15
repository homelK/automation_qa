import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadExcel {
    public void readFile(String filePath, String fileName, String sheetName) throws IOException {
        File file = new File(filePath + "\\" + fileName);

        Workbook workbook = null;
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        FileInputStream inputStream = new FileInputStream(file);

        try {
            if (fileExtensionName.equals(".xlsx")) {
                workbook = new XSSFWorkbook(inputStream);
            } else if (fileExtensionName.equals(".xls")) {
                workbook = new HSSFWorkbook(inputStream);
            }
        } catch (NoSuchFieldError e) {
            e.printStackTrace();
        }

        if (workbook == null) {
            throw new IOException("Excel file expected");
        }

        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        // todo check with empty first strings
        for (int i = 0; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                System.out.print(row.getCell(j).getStringCellValue() + "|| ");
            }
            System.out.println();
        }
    }

    public static void main(String[] strings) throws IOException {
        ReadExcel reader = new ReadExcel();
        reader.readFile("F:", "DataTestLogIn.xlsx", "Test");
    }
}