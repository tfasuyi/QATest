package StepDefinitions;

import com.exercise.CountResult;
import com.exercise.VowelCounter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class Steps {

    String letters ;
    List<CountResult> words;
    List<CountResult> var;
    String results;
    VowelCounter counter = new VowelCounter();

    @Given("I enter a string above four")
    public void i_enter_a_string_above_four() {
        letters = "rrjfk";

    }
    @When("I execute the tests")
    public void i_execute_the_tests() {
        results = counter.getVowelAndConsonantListWithCount(letters);
    }
    @Then("i should get an error message")
    public void i_should_get_an_error_message() {
        System.out.println(results);
        Assert.assertNull(results);
    }


    @Given("I enter a string")
    public void iEnterAString() {
        letters ="heol";

    }

    @When("I execute the testss")
    public void iExecuteTheTestss() {
        results = counter.getVowelAndConsonantListWithCount(letters);
    }

    @Then("i should get the total number of both vowels and consonant")
    public void iShouldGetTheTotalNumberOfBothVowelsAndConsonant() {
        System.out.println(results);

    }

    @Given("I enter the exact list of strings")
    public void iEnterTheExactListOfStrings() {
        words = counter.getVowelListWithCount(new String[]{"do", "s","hello"});

    }

    @When("I execute the test")
    public void iExecuteTheTest() {
       words = counter.getVowelListWithCount(new String[]{"do", "s","hello"});

    }


    @Then("i should be able to see the total number of vowels")
    public void iShouldBeAbleToSeeTheTotalNumberOfVowels() {
        System.out.println(words);
    }

    @When("I execute test related")
    public void iExecuteTestRelated() {
        results = counter.getConsonantListWithCount("helo");

    }

    @Then("i should be able to see the total number of consonant")
    public void iShouldBeAbleToSeeTheTotalNumberOfConsonant() {
        System.out.println(results);
    }
}
