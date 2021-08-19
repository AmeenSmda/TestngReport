package org.task;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.PojoClassFb;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample extends BaseClass{

	@Test
	private void tc1() {
	chromeBrowserLaunch();
	urlLaunch("https://parabank.parasoft.com/parabank/register.htm");
    maxWindow();
    }
	@Test(priority=1)
	public void tc2() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getFname1(), readExcel("DataDrivF", "Read", 0, 0));
	}
	@Test(priority=3)
	public void tc3() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getAddress3(), readExcel("DataDrivF", "Read", 2, 0));
	}
	@Test(priority=2)
	public void tc4() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getLname2(), readExcel("DataDrivF", "Read", 1, 0));
	}
	@Test(priority=4)
	public void tc5() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getCity4(), readExcel("DataDrivF", "Read", 3, 0));
	}
	@Test(priority=11)
	public void tc6() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getConPswd11(), readExcel("DataDrivF", "Read", 10, 0));
	}
	@Test(priority=5)
	public void tc7() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getState5(), readExcel("DataDrivF", "Read", 4, 0));
	}
	@Test(priority=7)
	public void tc8() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getPhone7(), readExcel("DataDrivF", "Read", 6, 0));
	}
	@Test(priority=6)
	public void tc9() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getZipcode6(), readExcel("DataDrivF", "Read", 5, 0));
	}
	@Test(priority=8)
	public void tc10() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getSsN8(), readExcel("DataDrivF", "Read", 7, 0));
	}
	@Test(priority=10)
	public void tc11() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getPswd10(), readExcel("DataDrivF", "Read", 9, 0));
	}
	@Test(priority=9)
	public void tc12() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getUname9(), readExcel("DataDrivF", "Read", 8, 0));
	}
	@Test(priority=11)
	public void tc13() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	fillTxt(pf.getConPswd11(), readExcel("DataDrivF", "Read", 10, 0));
	}
	
	@Test(priority=12)
	public void tc14() throws IOException {
	PojoClassFb pf = new PojoClassFb(); 
	btnClick(pf.getSubmit());
	TakesScreenShot("Soft");
	}
	
    
}
