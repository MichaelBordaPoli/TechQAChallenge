package com.userinyerface.userregister.test.steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.userinyerface.userregister.test.pageobject.UserRegistrationPOM;

import net.thucydides.core.annotations.Step;

public class UserRegistrationSteps {
	
	UserRegistrationPOM userRegistrationPOM = new UserRegistrationPOM();
	
	/**Steps case 1**/
	@Step
	public void openPage() {
		userRegistrationPOM.open();
	}
	
	@Step
	public void clickHere() {
		userRegistrationPOM.clickHere();
	}
	
	@Step
	public void closeSpan() {
		userRegistrationPOM.closeSpan();
	}
	
	@Step
	public void sendToBottom() {
		userRegistrationPOM.sendToBottom();
	}
	
	@Step
	public void writePassword(String password) {
		userRegistrationPOM.writePassword(password);
	}
	
	@Step
	public void writeEmail(String email) {
		userRegistrationPOM.writeEmail(email);
	}
	
	@Step
	public void writeDomain(String domain) {
		userRegistrationPOM.writeDomain(domain);
	}
	
	@Step
	public void selectExt (String ext) {
		userRegistrationPOM.selectExt(ext);
	}
	
	@Step
	public void uncheckTerms() {
		userRegistrationPOM.uncheckTerms();
	}
	
	@Step
	public void clickBtnNext() {
		userRegistrationPOM.clickBtnNext();
	}
	
	@Step
	public String verifyTextPresent() {
		return userRegistrationPOM.verifyTextPresent();
	}
	
	/**Steps case 2**/
	@Step
	public void uploadImage(String path) throws Exception {
		userRegistrationPOM.uploadImage(path);
	}
	
	@Step
	public void unSelectInterests() {
		userRegistrationPOM.unSelectInterests();
	}
	
	@Step
	public void selectInterests() {
		userRegistrationPOM.selectInterests();
	}
	
	@Step
	public void clickBtnNextPage2() {
		userRegistrationPOM.clickBtnNextPage2();
	}
	
	@Step
	public String verifyTextPresentPage3() {
		return userRegistrationPOM.verifyTextPresentPage3();
		
	} 

	/**Steps case 3**/
	
	@Step
	public void writeFirstName(String firstName) {
		userRegistrationPOM.writeFirstName(firstName);
	}
	
	@Step
	public void writeZip (String zip) {
		userRegistrationPOM.writeZip(zip);
	}
	
	@Step
	public void selectTitle(String title) {
		userRegistrationPOM.selectTitle(title);
		
	}
	
	@Step
	public void writeCity (String city) {
		userRegistrationPOM.writeCity(city);
	}
	
	@Step
	public void writeSurName(String surName) {
		userRegistrationPOM.writeSurName(surName);
	}
	
	@Step
	public void selectCountry() {
		userRegistrationPOM.selectCountry();
	}
	
	@Step
	public void writeStreet(String street) {
		userRegistrationPOM.writeStreet(street);
	}
	
	@Step
	public void selectBox(String box) {
		userRegistrationPOM.selectBox(box);
	}
	
	@Step
	public void selectNumber(String number) {
		userRegistrationPOM.selectNumber(number);
	}
	
	@Step
	public void selectBDay(String day) {
		userRegistrationPOM.selectBDay(day);
	}
	
	@Step
	public void selectBMonth(String month) {
		userRegistrationPOM.selectBMonth(month);
	}
	
	@Step
	public void selectYear(String year) {
		userRegistrationPOM.selectYear(year);
	}

	@Step
	public void sliderAge(String Age) {
		userRegistrationPOM.sliderAge(Age);
	}

	@Step
	public void selectGender(String gender) {
		userRegistrationPOM.selectGender(gender);
	}
	
	@Step
	public void clickBtnNextPage3() {
		userRegistrationPOM.clickBtnNextPage3();
	}
	
	@Step
	public String verifyTextPresentPage4() {
		return userRegistrationPOM.verifyTextPresentPage4();
	}
	
	/**Steps case 4**/
	
	@Step
	public void checkImg() {
		userRegistrationPOM.checkImg();
	}
	
	@Step
	public void clickBtnNextPage4() {
		userRegistrationPOM.clickBtnNextPage4();
	}
	
	@Step
	public String verifyTextPresentPage5() {
		return userRegistrationPOM.verifyTextPresentPage5();
	}
	
	
}
