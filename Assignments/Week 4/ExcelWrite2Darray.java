package excelegnew;




import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class ExcelWrite2Darray {
    public static void main(String[] args) throws Exception {
       
        int[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        
        Workbook wbook = new XSSFWorkbook();
        Sheet sheet = wbook.createSheet("First Sheet");

       
        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
           
            Row row = sheet.createRow(rowIndex);
            for (int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
                
                Cell cell = row.createCell(colIndex);
                cell.setCellValue(data[rowIndex][colIndex]); 
            }
        }

        // Write the workbook to a file
        try (FileOutputStream fos = new FileOutputStream("firstexecl.xlsx")) {
            wbook.write(fos);
        }
        
        // Close the workbook
        wbook.close();

        System.out.println("Excel file with int array written successfully.");
    }
}
