package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.searchPage;

public class searchPriceFilterSteps {

    searchPage searchPage = new searchPage();

    @And("^click on price filter fifty to hundred Eur$")
    public void click_on_price_filter_seventy_five_to_hundred() {
        searchPage.clickOnRadioButton50to100();
    }

    @Then("^Verify all prices are between fifty and hundred Eur$")
    public void verify_all_prices_are_between_seventy_five_and_hundred_Eur() {
        searchPage.verifyBetween();
    }

}
