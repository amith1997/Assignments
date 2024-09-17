package excelegnew;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
public class ExcelWrite {
	public static void main(String[] args) throws Exception {
	Workbook wbook = new XSSFWorkbook();
	Sheet st = wbook.createSheet("First Sheet");
	Row row = st.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("Hello");
	FileOutputStream fos = new FileOutputStream("firstexecl.xlsx");
	wbook.write(fos);
	wbook.close();
	fos.close();
	}
	
}
