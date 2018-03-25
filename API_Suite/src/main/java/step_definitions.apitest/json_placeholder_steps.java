package step_definitions.apitest;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBodyData;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class json_placeholder_steps {

    private RequestSpecification requestSpecification;
    private ValidatableResponse validatableResponse;
    private Response response;

    @Before
    public void beforeScenario() throws Exception{
        requestSpecification = RestAssured.with();
    }


    @Given("^I am using the json placeholder typicode env$")
    public void iAmUsingTheJsonPlaceholderTypicodeEnv() throws Throwable {
        requestSpecification.given()
                .contentType(ContentType.JSON)
                .baseUri("https://jsonplaceholder.typicode.com");
    }

    @When("^I make the get request to \"([^\"]*)\" endpoint$")
    public void iMakeTheGetRequestToEndpoint(String endpoint) throws Throwable {
       response = requestSpecification.get(endpoint);
    }


    @Then("^I get a response with id = (\\d+)$")
    public void iGetAResponseWithId(int id) throws Throwable {
        System.out.println(response.prettyPrint());
        Assert.assertEquals(id, response.getBody().jsonPath().getInt("id"));

    }
}
