package firstpkg;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling_Excel 
{

	public static void read_excel_data() throws Exception
	{
		FileInputStream fis = new FileInputStream("./testdata/credential.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheet("login");
		
		int nr = sheet1.getPhysicalNumberOfRows();  //4
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = sheet1.getRow(i);  //i=0;
			
			int nc = row.getPhysicalNumberOfCells();  //i=0, nc=2, i=1, nc=3
			
			for(int j=0; j<nc; j++)
			{
				XSSFCell col = row.getCell(j);  //j=0, j=1
				
				if(col.getCellType() == CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "    ");
				}
				
				else if(col.getCellType() == CellType.BOOLEAN)
				{
					System.out.print(col.getBooleanCellValue() + "    ");
				}
				
				else if(col.getCellType() == CellType.NUMERIC)
				{
					
					if(DateUtil.isCellDateFormatted(col))
					{
						SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
						System.out.print(sdf.format(col.getDateCellValue()) + "     ");
					}
					
					else 
					{
						System.out.print(col.getNumericCellValue() + "    ");
					}
					
					
				}
				
				
				
				
				
				
			}
			
			System.out.println();
			
		}
		
		
		/*
		//first row
		XSSFRow row1 = sheet1.getRow(0);  
		
		XSSFCell col1 = row1.getCell(0);  //first column
		
		System.out.println(col1.getStringCellValue());
		
		XSSFCell col2 = row1.getCell(1);  //second column
		
		System.out.println(col2.getStringCellValue());
		
		//second row
				XSSFRow row2 = sheet1.getRow(1);  
				
				XSSFCell col21 = row2.getCell(0);  //first column
				
				System.out.println(col21.getStringCellValue());
				
				XSSFCell col22 = row2.getCell(1);  //second column
				
				System.out.println(col22.getStringCellValue());
				
				XSSFCell col23 = row2.getCell(2);  //third column
				
				System.out.println(col23.getStringCellValue());
				
				
				
				//third row
				XSSFRow row3 = sheet1.getRow(2);  
				
				XSSFCell col31 = row3.getCell(0);  //first column
				
				System.out.println(col31.getStringCellValue());
				
				XSSFCell col32 = row3.getCell(1);  //second column
				
				System.out.println(col32.getNumericCellValue());
				
				XSSFCell col33 = row3.getCell(2);  //third column
				
				System.out.println(col33.getDateCellValue());
				
				*/
		
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		read_excel_data();
	}
}
