package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

public class DataTableDemoList {

    @Then("it should be entered and available for use")
    public void itShouldBeEnteredAndAvailableForUse() {
        System.out.println("it should be entered and available for use");
    }

    @Given("user is on registration page")
    public void userIsOnRegistrationPage() {
        System.out.println("user is on registration page");
    }

    @When("user enters following data")
    public void userEntersFollowingData (DataTable dataTable) {
        List<List<String>>table = dataTable.asLists();
        System.out.println(table.get(0).get(0)+" : "+table.get(0).get(1));
        System.out.println(table.get(1).get(0)+" : "+table.get(1).get(1));
    }
}
