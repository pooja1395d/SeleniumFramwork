package util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) {
		getRowCount();
		

	}

	
	public static void getRowCount() {
		
		try {
			XSSFWorkbook book= new XSSFWorkbook("./Excel/SeleniumExcel2.xlsx");
			XSSFSheet sheet=book.getSheet("SeleniumExcel2.xlsx");
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("number of rows:"+rowCount);
		}catch(Exception exp) {
			System.out.println("messgse:"+exp.getMessage());
			System.out.println("cause"+exp.getCause());
			exp.printStackTrace();
		}
		
	}
}
