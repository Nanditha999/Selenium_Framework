package resuablecomponents;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloperations {
	
	//location of excel file
	//open file--workbook
	//read data row by row and put in map
String filepath;
Sheet sh;
	public Exceloperations(String str)  {
		try {
			filepath=System.getProperty("user.dir")+propertiesoperation.getpropertyvalue("testDataLocation");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//keeping this piece in constructor so when the object is created it getinitiated and sheet obj gets created
		File fis=new File(filepath);
		Workbook wb;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//getting from constructor, so whenever we create obj we mention from which sheet we need
		 sh=wb.getSheet(str);
	}
	//get test data from excel in hashmap based on rownum
	public HashMap<String, String> gettestdatainmap(int rownum) throws IOException {
		
		sh.getRow(0).getCell(1).toString();
		
		HashMap<String,String> hm=new HashMap<String,String>();
			
			for(int i=0;i<sh.getRow(0).getLastCellNum();i++) {
				sh.getRow(rownum).getCell(i).setCellType(CellType.STRING);
				hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rownum).getCell(i).toString());
			
		}
		return hm;
	}
	
	
	public int getrowcount() {
		
		return sh.getLastRowNum();	
		}
	

	public int getcolcount() {
		return sh.getRow(0).getLastCellNum();
	}
}

