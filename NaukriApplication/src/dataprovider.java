import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class dataprovider {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fs=new FileInputStream("C:\\Users\\Administrator\\Documents\\Selenium Project\\Learnings Docs\\ExcelData\\TestData.xls");
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet1=wb.getSheetAt(0);
		int lastrow=sheet1.getLastRowNum();
		int lastcolumn=2;
		String[][] data=new String[lastrow-1][lastcolumn];
		
		for(int i=1;i<=lastrow-1;i++) {
			for(int j=0;j<=lastcolumn;j++) {
				String ot=sheet1.getRow(i).getCell(i).getStringCellValue();
				System.out.println(ot);
			}
			
		
		
		}}
	}


