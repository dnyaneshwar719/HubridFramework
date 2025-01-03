package genericUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EcelfileUtil {
public String readDatafromExcel(String sheetname,int rowNum,int cellNum) throws Throwable {
	FileInputStream fise=new FileInputStream(IconstantUtil.propth);
	 Workbook wb = WorkbookFactory.create(fise);
	return wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
}

}
