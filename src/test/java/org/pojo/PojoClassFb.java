package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassFb extends BaseClass {

	public PojoClassFb() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td//input[@id='customer.firstName']")
	private WebElement fname1;
	@FindBy(xpath="//input[@id='customer.firstName']//following::input[1]")
	private WebElement lname2;
	@FindBy(xpath="//input[@id='customer.lastName']//following::input[1]")
	private WebElement Address3;
	@FindBy(xpath="//input[@id='customer.address.street']//following::input[1]")
	private WebElement City4;
	@FindBy(xpath="//input[@id='customer.address.city']//following::input[1]")
	private WebElement State5;
	@FindBy(xpath="//input[@id='customer.address.state']//following::input[1]")
	private WebElement zipcode6;
	@FindBy(xpath="//input[@id='customer.address.zipCode']//following::input[1]")
	private WebElement Phone7;
	@FindBy(xpath="//input[@id='customer.phoneNumber']//following::input[1]")
	private WebElement ssN8;
	@FindBy(xpath="//input[@id='customer.ssn']//following::input[1]")
	private WebElement Uname9;
	@FindBy(xpath="//input[@id='customer.username']//following::input[1]")
	private WebElement Pswd10;
	@FindBy(xpath="//input[@id='customer.password']//following::input[1]")
	private WebElement ConPswd11;
	@FindBy(xpath="//input[@id='repeatedPassword']//following::input[1]")
	private WebElement submit;
	public WebElement getFname1() {
		return fname1;
	}
	public WebElement getLname2() {
		return lname2;
	}
	public WebElement getAddress3() {
		return Address3;
	}
	public WebElement getCity4() {
		return City4;
	}
	public WebElement getState5() {
		return State5;
	}
	public WebElement getZipcode6() {
		return zipcode6;
	}
	public WebElement getPhone7() {
		return Phone7;
	}
	public WebElement getSsN8() {
		return ssN8;
	}
	public WebElement getUname9() {
		return Uname9;
	}
	public WebElement getPswd10() {
		return Pswd10;
	}
	public WebElement getConPswd11() {
		return ConPswd11;
	}
	public WebElement getSubmit() {
		return submit;
	}

 }
	   

