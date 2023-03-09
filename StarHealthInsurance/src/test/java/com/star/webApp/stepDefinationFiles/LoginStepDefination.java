package com.star.webApp.stepDefinationFiles;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	@Given("he mouse over on sign in")
	public void he_mouse_over_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("he mouse over on sign in");
	}

	@Given("click on Retail customer")
	public void click_on_retail_customer() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("click on Retail customer");
	}

	@When("he enters the email Id and passwords as")
	public void he_enters_the_email_id_and_passwords_as(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	 List<Map<String,String>> data=dataTable.asMaps();
	 Iterator<Map<String,String>> col=data.iterator();
	 while(col.hasNext())
	 {
		 Map<String,String> eachKey=col.next();
		 Set<String> keys=eachKey.keySet();
		 for(String k:keys)
		 {
			 System.out.println(eachKey.get(k));
		 }
	 }
	}

	@When("click on continue")
	public void click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("click on continue");
	}

	@Then("he can log in to his account")
	public void he_can_log_in_to_his_account() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("he can log in to his account");
	}

}
