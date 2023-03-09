package com.star.webApp.stepDefinationFiles;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefination {

//	@Before
//	public static void beforeOfJunit()
//	{
//		System.out.println("Before of Junit");
//	}
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	  System.out.println("user is on homepage");
	  //Assert.assertTrue(false);
	}

	@When("he mouse over service providers")
	public void he_mouse_over_service_providers() {
	   System.out.println("he mouse over service providers");
	}
	
	@Then("He can see list of options")
	public void he_can_see_list_of_options(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   List<List<String>> data=dataTable.asLists();
	   Iterator<List<String>> row=data.iterator();
	   while(row.hasNext())
	   {
		   List<String> eachRow=row.next();
		   for(String i:eachRow)
		   {
			   System.out.println(i);
		   }
	   }
	}

	@Then("he can see {string} option")
	public void he_can_see_option(String string) {
	   System.out.println("he can see {string} option");
	
	}
}
