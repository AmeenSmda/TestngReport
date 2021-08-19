package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{

	public PojoClass() {
	
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@id='last-name']//preceding::input")
private WebElement Firstname1;
	
@FindBy(xpath="//input[@id='first-name']//following::input")
private WebElement Lastname2;

@FindBy(xpath="//input[@id='last-name']//following::input")
private WebElement Jobtitle3;

@FindBy(xpath="//input[@id='job-title']//following::input[3]")
private WebElement Education4;

@FindBy(xpath="//input[@id='radio-button-3']//following::input[1]")
private WebElement Gender5;


@FindBy(xpath="//input[@id='radio-button-3']//following::option[4]")
private WebElement YearsExp6;

public WebElement getFirstname1() {
	return Firstname1;
}

public WebElement getLastname2() {
	return Lastname2;
}

public WebElement getJobtitle3() {
	return Jobtitle3;
}

public WebElement getEducation4() {
	return Education4;
}

public WebElement getGender5() {
	return Gender5;
}

public WebElement getYearsExp6() {
	return YearsExp6;
}

public WebElement getDate7() {
	return Date7;
}

public WebElement getSubmit8() {
	return Submit8;
}

@FindBy(xpath="//input[@id='checkbox-1']//following::input[3]")
private WebElement Date7;

@FindBy(xpath="//input[@id='datepicker']//following::a")
private WebElement Submit8;

}
