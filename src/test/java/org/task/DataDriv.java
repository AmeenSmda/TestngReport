package org.task;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.pojo.PojoClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DataDriv extends BaseClass{
 
	@Test
	private void tc1() {
	chromeBrowserLaunch();
	urlLaunch("https://formy-project.herokuapp.com/form");
	}
	@Test(groups={"Personal"})
	private void tc2() throws IOException {
		maxWindow();
		 PojoClass pj = new PojoClass();
		fillTxt(pj.getFirstname1(), readExcel("DataDrivF", "Read", 0, 0));
		fillTxt(pj.getLastname2(), readExcel("DataDrivF", "Read", 1, 0));
		fillTxt(pj.getJobtitle3(), readExcel("DataDrivF", "Read", 2, 0));
		TakesScreenShot("13Aug2021a");
	}
    
	@Test(groups={"Personal"})
  private void tc3() throws IOException {
	  PojoClass pj = new PojoClass();
		btnClick(pj.getEducation4());
		btnClick(pj.getGender5());
		btnClick(pj.getYearsExp6());
		TakesScreenShot("13Aug2021b"); 
	}
      
      @Test(groups={"Official"})
      private void tc4()throws IOException{
    	  PojoClass pj = new PojoClass();
          toType(pj.getDate7(), "12/08/2021"); 
          TakesScreenShot("13Aug2021c");
    	  }
          
      @Test(groups={"Official"})
          private void tc5() throws IOException {
        	  PojoClass pj = new PojoClass();{
              btnClick(pj.getSubmit8());
        	TakesScreenShot("13Aug2021final");
        	  time();
        	  }
          
}
}
