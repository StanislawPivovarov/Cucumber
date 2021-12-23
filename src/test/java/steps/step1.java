package steps;

import org.junit.runner.RunWith;

import static com.codeborne.selenide.Screenshots.takeScreenShot;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@RunWith(io.cucumber.junit.Cucumber.class)
public class step1 {
    @io.cucumber.java.en.Given("^i am on \"([^\"]*)\"$")
    public void iAmOn(String arg0) {
        open("https://kpfu.ru");
    }

    @io.cucumber.java.en.When("^press button with text \"([^\"]*)\"$")
    public void pressButtonWithText(String arg0) {
        $(byText(arg0)).click();
    }

    @io.cucumber.java.en.When("type text: {string} to input")
    public void type_text_to_input(String string) {
        $(byXpath("//*[@id=\"eu_enter\"]/input[1]")).setValue(string);
    }

    @io.cucumber.java.en.When("type text: {string} to input two")
    public void type_text_to_input_two(String string) {
        $(byXpath("//*[@id=\"eu_enter\"]/input[2]")).setValue(string).pressEnter();
    }

    @io.cucumber.java.en.Then("^i am on ProfilePage$")
    public void iAmOnProfilePage() {
        //takeScreenShot("complex-form.png");
    }
}