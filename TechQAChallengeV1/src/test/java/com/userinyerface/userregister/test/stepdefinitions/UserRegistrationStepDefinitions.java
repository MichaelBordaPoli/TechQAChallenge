package com.userinyerface.userregister.test.stepdefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;
import com.userinyerface.userregister.test.model.UserRegistrationModel;
import com.userinyerface.userregister.test.steps.UserRegistrationSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserRegistrationStepDefinitions {

@Steps
UserRegistrationSteps usrRgtrSteps;

/**Case 1**/
@Given("^I want to register in userinyerface\\.com page$")
public void iWantToRegisterInUserinyerfaceComPage() {
	usrRgtrSteps.openPage();
}

@When("^I click Here to go to next page$")
public void iClickHereToGoToNextPage() {
	usrRgtrSteps.clickHere();
}

@When("^I fill out the form with$")
public void iFillOutTheFormWith(List<UserRegistrationModel> usrRgtrModel) {
	usrRgtrSteps.writePassword(usrRgtrModel.get(0).getPassword());
	usrRgtrSteps.writeEmail(usrRgtrModel.get(0).getEmail());
	usrRgtrSteps.writeDomain(usrRgtrModel.get(0).getDomain());
	usrRgtrSteps.selectExt(usrRgtrModel.get(0).getExt());

}

@When("^I accept terms and conditions$")
public void iAcceptTermsAndConditions() {
	usrRgtrSteps.uncheckTerms();
}

@When("^I click Next$")
public void iClickNext() {
	usrRgtrSteps.clickBtnNext();
}


@Then("^I will see$")
public void iWillSee(List<UserRegistrationModel> usrRgtrModel) {
    assertThat(usrRgtrSteps.verifyTextPresent(), Matchers.is(usrRgtrModel.get(0).getElementPresent()));
}

/**Case 2**/
@When("^I upload a image$")
public void iUploadAImage(List<UserRegistrationModel> usrRgtrModel) throws Exception {
	usrRgtrSteps.uploadImage(usrRgtrModel.get(0).getPath());
}


@When("^I deselect all interests$")
public void iDeselectAllInterests() {
	usrRgtrSteps.unSelectInterests();
}

@When("^I chose three interests$")
public void iChoseThreeInterests() {
	
	usrRgtrSteps.selectInterests();
}

@When("^I click button Next$")
public void iClickButtonNext() {
	usrRgtrSteps.clickBtnNextPage2();
}

@Then("^I will see the text$")
public void iWillSeeTheText(List<UserRegistrationModel> usrRgtrModel) {
    assertThat(usrRgtrSteps.verifyTextPresentPage3(), Matchers.is(usrRgtrModel.get(0).getElementPresent()));
}

/**Case 3**/

@When("^I fill out the third form with$")
public void iFillOutTheThirdFormWith(List<UserRegistrationModel> usrRgtrModel) {
	usrRgtrSteps.sendToBottom();
	usrRgtrSteps.writeFirstName(usrRgtrModel.get(0).getFirstName());
	usrRgtrSteps.writeZip(usrRgtrModel.get(0).getZip());
	usrRgtrSteps.selectTitle(usrRgtrModel.get(0).getTitle());
	usrRgtrSteps.writeCity(usrRgtrModel.get(0).getCity());
	usrRgtrSteps.writeSurName(usrRgtrModel.get(0).getSurname());
	usrRgtrSteps.selectCountry();
	usrRgtrSteps.writeStreet(usrRgtrModel.get(0).getStreet());
	usrRgtrSteps.selectBox(usrRgtrModel.get(0).getBox());
	usrRgtrSteps.selectNumber(usrRgtrModel.get(0).getNumber());
	usrRgtrSteps.sliderAge(usrRgtrModel.get(0).getAge());
	usrRgtrSteps.selectBDay(usrRgtrModel.get(0).getbDay());
	usrRgtrSteps.selectBMonth(usrRgtrModel.get(0).getbMonth());
	usrRgtrSteps.selectYear(usrRgtrModel.get(0).getbYear());
	usrRgtrSteps.selectGender(usrRgtrModel.get(0).getGender());
	usrRgtrSteps.clickBtnNextPage3();
}


@Then("^I will see the element$")
public void iWillSeeTheElement(List<UserRegistrationModel> usrRgtrModel) {
	assertThat(usrRgtrSteps.verifyTextPresentPage4(), Matchers.is(usrRgtrModel.get(0).getElementPresent()));
}

@When("^I check all checkbox$")
public void iCheckAllCheckbox() {
    usrRgtrSteps.checkImg();
}


@When("^Validate that i am not a robot$")
public void validateThatIAmNotARobot() {
	usrRgtrSteps.clickBtnNextPage4();
}

@Then("^I will see the message$")
public void iWillSeeTheMessage(List<UserRegistrationModel> usrRgtrModel) {
	assertThat(usrRgtrSteps.verifyTextPresentPage5(), Matchers.is(usrRgtrModel.get(0).getElementPresent()));
}


	
}
