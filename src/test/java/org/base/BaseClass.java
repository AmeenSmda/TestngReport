package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;

public class BaseClass  {
	
    public static WebDriver driver; 
    public static JavascriptExecutor js;
    public static Select s;
	public static Actions a;
	public static Alert al;
	public static Robot r;
	public static TakesScreenshot tk;
	//public static FileInputStream fis;
	//public static Workbook workbook;
    
    public static void chromeBrowserLaunch() {
   WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    	}
    public static void FirefoxBrowserLaunch() {
    	   WebDriverManager.firefoxdriver().setup();
    	    driver = new FirefoxDriver();
    	    	}

    public static void InternetExplorerLaunch () {
    	   WebDriverManager.iedriver().setup();
    	    driver = new InternetExplorerDriver();
    	    	}
    		
    
	public static void urlLaunch(String url) {
	driver.get(url);
	}
	
	public static void maxWindow() {
	driver.manage().window().maximize();
	}
	
	public static void CloseWindow() {
		driver.close();;
		}
		
	
	public static void driverImpWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void fillTxt(WebElement e,String text) {
		e.sendKeys(text);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void clickBtnJava(WebElement e) {
 js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", e);
   }
	public static void fillTxtJava(String text, WebElement e) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')", e);
	}
	
	public static void toAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public static void toScrollDownView(WebElement e) {
		js.executeScript("arguments[0].scrollintoView('true'),", e);
	
	}
	public static void toScrollUpView(WebElement e) {
		js.executeScript("arguments[0].scrollintoView('false'),", e);
	
	}
		
	public static void toSelectByIndex(WebElement element,int index) {
	s = new Select(element);
	s.selectByIndex(index);
	
    }
	public static void toSelectByValue(WebElement element,String name) {
		s.selectByValue(name);
	}
	public static void toType(WebElement e, String name) {
		e.sendKeys(name);
		
		}
        public static void toSelectbygetOptions(WebElement element,String value) {
	List<WebElement> options = s.getOptions();
}	
        
public static void toMoveToElement(WebElement e) {
	Actions a = new Actions(driver);
	a.moveToElement(e).perform();
}
public static void toDragAndDrop(WebElement e,WebElement n) {
	a.dragAndDrop(e,n).perform();
	}

public static void toDoubleClick(WebElement e) {
	a.doubleClick(e).perform();
}
public static void toContextRClick(WebElement e) {
	a.contextClick(e).perform();
}
public static void toKeyDown(WebElement e) {
	a.keyDown(e, Keys.SHIFT);
	a.sendKeys(e,"").perform();
	a.keyUp(e, Keys.SHIFT);
}
public static void toRobotKeyTab() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
}
public static void toRobotKeyAll() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_2);
	r.keyRelease(KeyEvent.VK_2);
}

	public static void toRobotKeyEnter() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
public static void toRobotKeyControl() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_CONTROL);
}
public static void toRobotKeyDown() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
public static void TakesScreenShot(String ImageName)throws IOException {
 tk =(TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\USER\\Desktop\\SSHOT\\ "+ImageName+".jpg");
FileUtils.copyFile(src, des);
}
public static void TimeTaken() {
	Date d = new Date();
	System.out.println(d);
}
public static void toPerformFrameId(int id) {
	 WebDriver frameId =driver.switchTo().frame(id);

}
public static void toPerformFrameName(String Name) {
	 WebDriver frameName =driver.switchTo().frame(Name);
}
public static void toPerformFrameRefName(WebElement e ) {
	 WebDriver refName =driver.switchTo().frame(e);
}
public static void WindowHandlingParent() {
	String parentId = driver.getWindowHandle();
System.out.println(parentId);
}
public static void WindowHandlingAll() {
	Set<String> allWindowsId = driver.getWindowHandles();
System.out.println(allWindowsId);
}
		
public static void ToGetText(WebElement e) {
	String text = e.getText();
	System.out.println(text);
}
public static void ToGetAttribute(WebElement e) {
	String att = e.getAttribute("Value");
	System.out.println(att);
}


public static void ThreadSleep() throws InterruptedException {
	Thread.sleep(3000);

}
public static String readExcel(String filename,String sheetname,int rownum, int cellnum) throws IOException {
	 
	FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\TestngTask\\DataDriven\\"+filename+".xlsx");
	                                                   
    Workbook workbook = new XSSFWorkbook(fis);
	
	Sheet sheet = workbook.getSheet(sheetname);
	
	Row row = sheet.getRow(rownum);
	
	Cell cell = row.getCell(cellnum);
	
	int cellType = cell.getCellType();
	
String value ="";

if(cellType==1) {
	 value = cell.getStringCellValue();
}
	else if (DateUtil.isCellDateFormatted(cell)) {
		Date d = cell.getDateCellValue();
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		 value = s.format(d);
			}
	else {
		double d = cell.getNumericCellValue();
		long l=(long)d;
		value = String.valueOf(l);
	}
    return value;

	}

	public static void excelReadAndWrite(String fileName,String SheetName,int rownum,int cellnum,String cellValue) throws IOException {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\DataDriven\\Data\\"+fileName+".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell createCell = row.createCell(cellnum);
		createCell.setCellValue(cellValue);
	     FileOutputStream fos = new FileOutputStream(f);
	     workbook.write(fos);
	}
	    
	public static void excelWrite(String fileName,String sheetName,int rownum,int cellnum,String cellValue,int cellnum1,String cellValue1) throws IOException {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\DataDriven\\Data\\"+fileName+".xlsx");

		Workbook workbook = new XSSFWorkbook();

		Sheet sheet = workbook.createSheet("sheetName");

		Row row0 = sheet.createRow(rownum);
		Cell cell0 = row0.createCell(cellnum);
		Cell cell1 = row0.createCell(cellnum1);

		cell0.setCellValue(cellValue);
		cell1.setCellValue(cellValue1);

		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);

		}

	public static void time() {
		long startTime=System.currentTimeMillis();
		long endTime=System.currentTimeMillis();
	    long totalTime=endTime-startTime;		
	}
}





