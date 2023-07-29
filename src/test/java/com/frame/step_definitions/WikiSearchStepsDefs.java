package com.frame.step_definitions;

import com.frame.utilities.ConfigurationReader;
import com.frame.utilities.Driver;
import io.cucumber.java.en.*;
import com.frame.pages.WikiSearchPage;
import org.junit.Assert;

public class WikiSearchStepsDefs {

   WikiSearchPage wikiSearchPage= new WikiSearchPage();
   @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia.home"));
   }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchWord) {

        wikiSearchPage.searchBox.sendKeys(searchWord);
    }
    @When(value = "User clicks wiki search button")

    public void user_clicks_wiki_search_button() {

        wikiSearchPage.submitButton.click();


    }
    @Then("User sees {string} is in the wiki {string}")
    public void user_sees_is_in_the_wiki(String searchWord, String verificationText) {

        switch (verificationText) {
            case "wiki title":
                Assert.assertEquals(Driver.getDriver().getTitle(), (searchWord + " - Wikipedia"));
                break;
            case "main header":
                Assert.assertEquals(wikiSearchPage.mainHeader.getText(), searchWord);
                break;
            case "img header":
                Assert.assertEquals(wikiSearchPage.imgHeader.getText(), searchWord);
                break;
            default:

        }










//        if(verificationText.equals("wiki title")){
//            Assert.assertEquals(Driver.getDriver().getTitle(), (searchWord+ " - Wikipedia"));
//        } else if (verificationText.equals("main header")) {
//            Assert.assertEquals(wikiSearchPage.mainHeader.getText(),searchWord);
//        } else if (verificationText.equals("img header")) {
//            Assert.assertEquals(wikiSearchPage.imgHeader.getText(),searchWord);
//
//        }


    }

}
