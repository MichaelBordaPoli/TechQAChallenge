package com.userinyerface.userregister.test.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://userinyerface.com")

public class UserRegistrationPOM  extends PageObject  {
	
	/**Case 1 Elements**/
	By lnkHere = By.xpath("//a[@class='start__link']");
	By txtPassword = By.xpath("//input[@placeholder='Choose Password']");
	By txtEmail = By.xpath("//input[@placeholder='Your email']");
	By txtDomain = By.xpath("//input[@placeholder='Domain']");
	By cBoxExt = By.xpath("//div[@class='dropdown__opener']");
	By cBoxExtElements = By.xpath("//div[@class='dropdown__list-item']");
	By ckTerms = By.xpath("//span[@class='icon icon-check checkbox__check']");
	By btnNext = By.xpath("//a[@class='button--secondary']");
	By btnSendToBottom = By.xpath("//button[@class='button button--solid button--blue help-form__send-to-bottom-button']");
	By btnCloseSpan = By.xpath("//span[contains(text(),'©lose')]");
	By txtElementPresent = By.xpath("(//h2[@class='avatar-and-interests__title'])[1]");
	
	/**Case 2 Elements**/
	By btnUploadImage = By.xpath("//a[@class='avatar-and-interests__upload-button']");
	By ckUnselectInterests =By.xpath("//label[@for='interest_unselectall']");
	By ckInterests = By.xpath("//span[@class='checkbox__box']");
	By btnNext2Page = By.xpath("//button[@name='button' and contains(text(),'Next')]"); 
	By txtElementPresentPage3 = By.xpath("//h3");
	
	/**Case 3 Elements**/
	By txtFirstName = By.xpath("(//input[@placeholder='Placeholder...'])[1]");
	By txtZip = By.xpath("(//input[@placeholder='Placeholder...'])[2]");
	By cBoxTitle = By.xpath("(//div[@class='dropdown__opener'])[1]");
	By cBoxTitleOptions = By.xpath("//div[@class='dropdown__list-item']");
	By cBoxCountry = By.xpath("(//div[@class='dropdown__opener'])[2]");
	By cBoxCountryColombia = By.xpath("//div[@class='flag flag-co country-dropdown__flag-item']");		
	By txtCity = By.xpath("(//input[@placeholder='Placeholder...'])[3]");
	By txtSurName = By.xpath("(//input[@placeholder='Placeholder...'])[4]");
	By txtStreet = By.xpath("(//input[@placeholder='Placeholder...'])[5]");
	By btnUpBox = By.xpath("(//span[@class='icon icon-chevron-up'])[1]");
	By txtBox = By.xpath("(//div[@class='numeric-stepper'])[1]");
	By btnUpNumber= By.xpath("(//span[@class='icon icon-chevron-up'])[2]");
	By txtNumber = By.xpath("(//div[@class='numeric-stepper'])[2]");
	By cBoxBDay = By.xpath("(//div[@class='dropdown__opener'])[3]");
	By cBoxBDayOptions= By.xpath("//div[@class='date-dropdown__container date-dropdown__container--day']//div[@class='dropdown__list-item']");
	By cBoxBMonth = By.xpath("(//div[@class='dropdown__opener'])[4]");
	By cBoxBMonthOptions = By.xpath("//div[@class='date-dropdown__container date-dropdown__container--month']//div[@class='dropdown__list-item']");
	By cBoxYear = By.xpath("(//div[@class='dropdown__opener'])[5]");
	By cBoxYearOptions = By.xpath("//div[@class='date-dropdown__container date-dropdown__container--year']//div[@class='dropdown__list-item']");
	By sliderAge = By.xpath("//div[@class='slider__handle']");
	By btnGender = By.xpath("//div[contains(text(),'Male')]");
	By btnNext3Page = By.xpath("//button[@name='button' and contains(text(),'Next')]");
	By txtElementPresentPage4 = By.xpath("(//h2)[1]");
	
	/**Case 4 Elements**/
	By ckImg = By.xpath("//span[@class='checkbox']");
	By btnFinishRegister = By.xpath("//button[contains(text(),'Validate')]");
	By txtElementPresentPage5 = By.xpath("//h1");
	
	/**Case 1 methods**/
	public void clickHere() {
		getDriver().findElement(lnkHere).click();
	}
	
	public void closeSpan() {
		if(getDriver().findElement(btnCloseSpan).isDisplayed()) {
			getDriver().findElement(btnCloseSpan).click();
		}
	}
	
	public void sendToBottom() {
		if(getDriver().findElement(btnSendToBottom).isDisplayed()) {
			getDriver().findElement(btnSendToBottom).click();
		}
	}
	
	public void writePassword(String password) {
		getDriver().findElement(txtPassword).clear();
		getDriver().findElement(txtPassword).sendKeys(password);
	}
	
	public void writeEmail(String email) {
		getDriver().findElement(txtEmail).clear();
		getDriver().findElement(txtEmail).sendKeys(email);
	}
	
	public void writeDomain(String domain) {
		getDriver().findElement(txtDomain).clear();
		getDriver().findElement(txtDomain).sendKeys(domain);
	}
	
	public void selectExt (String ext) {
		List<WebElement> listOfExt = getDriver().findElements(cBoxExtElements);
		getDriver().findElement(cBoxExt).click();
		
		for(WebElement webElement: listOfExt) {
			if(webElement.getText().trim().equals(ext)) {
				webElement.click();
				break;
			}
			
		}
		
		
	}
	
	public void uncheckTerms() {
		getDriver().findElement(ckTerms).click();
	}
	
	public void clickBtnNext() {
		getDriver().findElement(btnNext).click();
	}
	
	public String verifyTextPresent() {
		return getDriver().findElement(txtElementPresent).getText();
		
	}
	
	/**Case 2 methods**/
	public void uploadImage(String path)  {
		/**No logre realizar el copy de la ruta, se presenta el mensaje de error:
		 * java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 1888
		 * **/
		/*String projectPath = System.getProperty("user.dir");
		StringSelection copy = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy, null);
		*/
		
		getDriver().findElement(btnUploadImage).click();
		
        
        Robot robot;
		try {
			robot = new Robot();
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			e.printStackTrace();
		}

		
	}
	
	public void unSelectInterests() {
		
		getDriver().findElement(ckUnselectInterests).click();
		
	}
	
	public void selectInterests() {
		
		List<WebElement> listOfInterst = getDriver().findElements(ckInterests);
		int count=0;
		for(WebElement webElement: listOfInterst) {
			if(count < 3) {
				webElement.click();
			}else {
				break;
			}
			count++;
				
			
		}
	}
	
	public void clickBtnNextPage2() {
		getDriver().findElement(btnNext2Page).click();;
	}


	public String verifyTextPresentPage3() {
		return getDriver().findElement(txtElementPresentPage3).getText();
		
	} 
	
	/**Case 3 methods**/
	
	public void writeFirstName(String firstName) {
		getDriver().findElement(txtFirstName).clear();
		getDriver().findElement(txtFirstName).sendKeys(firstName);
	}
	
	public void writeZip (String zip) {
		getDriver().findElement(txtZip).clear();
		getDriver().findElement(txtZip).sendKeys(zip);
	}
	
	public void selectTitle(String title) {
		
		getDriver().findElement(cBoxExt).click();
		List<WebElement> listOfExt = getDriver().findElements(cBoxTitleOptions);
		
		for(WebElement webElement: listOfExt) {
			if(webElement.getText().trim().equals(title)) {
				webElement.click();
				break;
			}
			
		}
	}
	
	public void writeCity (String city) {
		getDriver().findElement(txtCity).clear();
		getDriver().findElement(txtCity).sendKeys(city);
	}
	
	public void writeSurName(String surName) {
		getDriver().findElement(txtSurName).clear();
		getDriver().findElement(txtSurName).sendKeys(surName);
	}
	
	public void selectCountry() {
		getDriver().findElement(cBoxCountry).click();
		getDriver().findElement(cBoxCountryColombia).click();
	}
	
	public void writeStreet(String street) {
		getDriver().findElement(txtStreet).clear();
		getDriver().findElement(txtStreet).sendKeys(street);
	}
	
	public void selectBox(String box) {
		while(!getDriver().findElement(txtBox).getText().trim().equals(box)) {
			
			getDriver().findElement(btnUpBox).click();
		}
	}
	
	public void selectNumber(String number) {
		while(!getDriver().findElement(txtNumber).getText().trim().equals(number)) {
			getDriver().findElement(btnUpNumber).click();
		}
	}
	
	public void selectBDay(String day) {
		
		try {
			Thread.sleep(2000);
			List<WebElement> listObj = getDriver().findElements(cBoxBDayOptions);
			getDriver().findElement(cBoxBDay).click();
			for(WebElement webElement: listObj) {
				if(webElement.getText().trim().equals(day)) {
					webElement.click();
					System.out.println("day OK: " + webElement.getText() );
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
			 
	}
	
	public void selectBMonth(String month) {
		
		try {
			Thread.sleep(2000);
			List<WebElement> listObj = getDriver().findElements(cBoxBMonthOptions);
			getDriver().findElement(cBoxBMonth).click();
			for(WebElement webElement : listObj) {
				System.out.println("Month: " + webElement.getText());
				if(webElement.getText().trim().equals(month)) {
					webElement.click();
					System.out.println("month OK: " + webElement.getText() );
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void selectYear(String year) {
		
			try {
				Thread.sleep(2000);
				List<WebElement> listObj = getDriver().findElements(cBoxYearOptions);
				getDriver().findElement(cBoxYear).click();
				for(WebElement webElement : listObj) {
					if(webElement.getText().trim().equals(year)) {
						webElement.click();
						System.out.println("year OK: " + webElement.getText() );
						break;
					}
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	public void sliderAge(String age) {
		WebElement slider = getDriver().findElement(sliderAge);
		Actions move = new Actions(getDriver());
		int count=0;
		while(!slider.getText().trim().equals(age)){
			
			for(int i = 0; i<Math.pow(count, count);i++) {
				Action action = (Action) move.dragAndDropBy(slider, count, 0).build();
				action.perform();
				
				if(slider.getText().trim().equals(age)) {
					break;
				}
			}
	        
	        count++;
		}
        
	}
	
	public void selectGender(String gender) {
		if(gender.equals("Male")) {
		getDriver().findElement(btnGender).click();
		}
	}
	
	public void clickBtnNextPage3() {
		JavascriptExecutor js=(JavascriptExecutor)getDriver();
		WebElement btn=getDriver().findElement(btnNext3Page);
		js.executeScript("arguments[0].scrollIntoView();", btn);
		getDriver().findElement(btnNext3Page).click();;
	}
	
	public String verifyTextPresentPage4() {
		return getDriver().findElement(txtElementPresentPage4).getText();
	}
	
	/**Case 4 methods**/
	
	public void checkImg() {
		List<WebElement> listObj = getDriver().findElements(ckImg);
		for(WebElement webElement : listObj) {
			webElement.click();
		}
	}
	
	public void clickBtnNextPage4() {
		getDriver().findElement(btnFinishRegister).click();
	}
	
	public String verifyTextPresentPage5() {
		return getDriver().findElement(txtElementPresentPage5).getText();
	}
}
