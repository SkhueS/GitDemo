package co.za.ssquared.stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import io.cucumber.datatable.DataTable;

import java.util.List;


public class stepDefinition {

    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("\n navigated to login url.....");
        System.out.println("\n navigated to login url1.....");
        System.out.println("\n navigated to login url2.....");
    }

    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("log in successful....");
    }

    @Then("Home page is populated")
    public void home_page_is_populated() throws Throwable {
        System.out.println("validate home page.....");
    }

    @And("Cards are displayed")
    public void cards_are_displayed() throws Throwable {
        System.out.println("validate cards.....");
    }

    @When("User login into application with \"([^\"]*)\" and password \"([^\"]*)\"")
    public void userLoginIntoApplicationWithAndPassword(String arg0, String arg1) {

        System.out.println("Welcome to the system " + arg0 + " " + arg1);
    }

    @And("Cards are not displayed")
    public void cardsAreNotDisplayed() {
        System.out.println("Sorry cards are not displayed for you!!");
    }

    @When("User login into application with \"([^\"]*)\" and \"([^\"]*)\"")
    public void userLoginIntoApplicationWithAnd(String arg0, String arg1) {
        System.out.println("Disabled user " + arg0 + " " + arg1);

    }

    @When("User sign up with following details")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> myInfo = data.asLists(String.class);

        System.out.println("Signing up....");

        System.out.println(" " + myInfo.get(0).get(0));
        System.out.println(" " + myInfo.get(0).get(1));
        System.out.println(" " + myInfo.get(0).get(2));
        System.out.println(" " + myInfo.get(0).get(3));
        System.out.println(" " + myInfo.get(0).get(4));
    }



    @When("User login in to application with {string} and {string}")
    public void userLoginInToApplicationWithAnd(String username, String password) throws Throwable {
        System.out.println("Welcome to the system " + username + " " + password);
    }


    @When("Browser is triggered")
    public void browserIsTriggered() {
        System.out.println("Browser is triggered");
    }

    @Then("check if browser is started")
    public void checkIfBrowserIsStarted() {

        System.out.println("Browser is started");
    }

    @Given("Validate the browser")
    public void validateTheBrowser() {
        System.out.println("Browser is open");
    }
}