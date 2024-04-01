package StepDefinitions;

import EndPoints.URLs;
import TestRequest.RequestSpec;
import TokenRetreiver.Authorization;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lmsApiConstants.LMSConstants;

public class DeleteOperationSD {
	
	public String programId;
	public String programName;
	public String batchId;
	public String batchName;
  Response response;
	
    RequestSpec RS = new RequestSpec();
    Authorization auth = new Authorization();
    String userID;
	
	
	@Given("Admin sets Authorization Token for Delete Batch")
	public void admin_sets_authorization_token_for_delete_batch() {
		auth.getAuthorisation();
	}
	
	@Given("Admin creates delete Request with valid BatchId")
	public void admin_creates_delete_request_with_valid_batch_id() {
	   
	}

	@When("Admin sends deletebatch HTTPS Request with endpoint")
	public void admin_sends_deletebatch_https_request_with_endpoint() {
	 
	}

	@Then("Admin receives {int} Ok status with message {string}")
	public void admin_receives_ok_status_with_message(Integer int1, String string) {
	  
	}

	@Given("Admin creates DELETE batch Request with valid BatchId")
	public void admin_creates_delete_batch_request_with_valid_batch_id() {
	    
	}

	@When("Admin sends delete HTTPS Request  with invalid endpoint")
	public void admin_sends_delete_https_request_with_invalid_endpoint() {
	 
	}

	@When("Admin sends HTTPS Request  with endpoint")
	public void admin_sends_https_request_with_endpoint() {
	   	}

	@Then("Admin receives {int} Ok status with message")
	public void admin_receives_ok_status_with_message(Integer int1) {
	    
	}

	@Given("Admin creates DELETE Request with invalid BatchId")
	public void admin_creates_delete_request_with_invalid_batch_id() {
	   
	}

	@Then("Admin receives {int} Not Found Status with message and boolean success details")
	public void admin_receives_not_found_status_with_message_and_boolean_success_details(Integer int1) {
	 
	}
	@Given("Admin creates GET Request with batch Name after deletion of batchID")
	public void admin_creates_get_request_with_batch_name_after_deletion_of_batch_id() {
	    
	}

	@When("Admin sends delete HTTPS Request with endpoint after deletion of batchID")
	public void admin_sends_delete_https_request_with_endpoint_after_deletion_of_batch_id() {
	
	}

	@When("Admin sends HTTPS DELETE Request  with endpoint after deletion of programID")
	public void admin_sends_https_delete_request_with_endpoint_after_deletion_of_program_id() {
	
	}

	@Then("Admin receives {int} unauthorized after deletion of programID")
	public void admin_receives_unauthorized_after_deletion_of_program_id(Integer int1) {
	   
	}

	@Given("Admin creates PUT Request with Valid batch Id after deletion of programID")
	public void admin_creates_put_request_with_valid_batch_id_after_deletion_of_program_id() {
	  
	}

	@When("Admin sends HTTPS Request  with endpoint after deletion of programID")
	public void admin_sends_https_request_with_endpoint_after_deletion_of_program_id() {
	  
	}

	@Then("Admin receives {int} Bad Request Status with message and boolean success details after deletion of programID")
	public void admin_receives_bad_request_status_with_message_and_boolean_success_details_after_deletion_of_program_id(Integer int1) {
	 
	}

	@Given("Admin creates PUT Request with Valid batch Id after deletion of batchID")
	public void admin_creates_put_request_with_valid_batch_id_after_deletion_of_batch_id() {
	   
	}

	@When("Admin sends HTTPS Request  with endpoint after deletion of batchID")
	public void admin_sends_https_request_with_endpoint_after_deletion_of_batch_id() {
	
	}

	@Then("Admin receives {int} Ok status with message after deletion of batchID")
	public void admin_receives_ok_status_with_message_after_deletion_of_batch_id(Integer int1) {
	   
  }	
  
	@Given("Admin creates DELETE Request to delete Admin details")
	public void admin_creates_delete_request_to_delete_admin_details() {
		userID = auth.setUserID();
	}

	@When("Admin sends HTTPS request with endpoiint to delete Admin details forUserModule")
	public void admin_sends_https_request_with_endpoiint_to_delete_admin_details_forUserModule() {
		response = RestAssured
		 		   .given()
		 		   .spec(RS.createReq(URLs.DeleteUser))
		 		   .pathParam("userID",Authorization.scenarioContext.getContext(LMSConstants.USERID_KEY))
		 		   .when().delete();
		response.then().log().all();
	}

	@Then("Admin receives {int} Ok status with message forUserModule")
	public void admin_receives_ok_status_with_message_forUserModule(Integer int1) {
	    response.then().statusCode(200);
	}

	@When("Admin sends HTTPS request with endpoiint to delete Admin details with Inv AdminID forUserModule")
	public void admin_sends_https_request_with_endpoiint_to_delete_admin_details_with_inv_admin_id_forUserModule() {
		response = RestAssured
		 		   .given()
		 		   .spec(RS.createReq(URLs.DeleteUser))
		 		   .pathParam("userID","Abc")
		 		   .when().delete();
		response.then().log().all();
	}
}