package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {


    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        System.out.println("user enters valid username and password");
    }

    @Given("user landed on login page")
    public void userLandedOnLoginPage() {
        System.out.println("user landed on login page");
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("clicks on login button");
    }

    @Then("user landed on user's home page")
    public void userLandedOnUserSHomePage() {
        System.out.println("user landed on user's home page");
    }
}
