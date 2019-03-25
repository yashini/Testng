package accessexcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class accessprptyexcel {
	
			
		public static String[][] getDataFromExcel(String FileName, String SheetName) throws IOException{
			File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\testData\\"+FileName);
			FileInputStream ips = new FileInputStream(file);
			HSSFWorkbook wb = new HSSFWorkbook(ips);
			Sheet sh = wb.getSheet(SheetName);
			int rownum = sh.getLastRowNum()+1;
			int colnum = sh.getRow(0).getLastCellNum();
			String[][] data =  new String[rownum][colnum];
			String value="";
			for(int i=0;i<rownum;i++){
				Row row = sh.getRow(i);
				for(int j=0;j<colnum;j++){
					System.out.println(j);
					try{
					if(row.getCell(j).getCellType()==HSSFCell.CELL_TYPE_STRING)
					{
					value= row.getCell(j).getStringCellValue();
					}
					else
					{
						value= ""+row.getCell(j).getNumericCellValue();
					}
					}
					catch(NullPointerException e)
					{
						
					}
					data[i][j]=value;	
					System.out.println(value);
				}
			}
			return data;
		}


	}


