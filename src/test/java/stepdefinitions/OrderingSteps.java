package stepdefinitions;

import io.cucumber.java.en.*;

public class OrderingSteps {

    @Given("the user is on the restaurant homepage")
    public void userIsOnHomepage() {
        System.out.println("Navigating to homepage...");
    }

    @When("the user navigates to the menu page")
    public void userNavigatesToMenu() {
        System.out.println("Clicking menu link...");
    }

    @Then("the menu items should be displayed")
    public void menuItemsDisplayed() {
        System.out.println("Menu items are visible!");
    }

    @Given("the user is on the menu page")
    public void userIsOnMenuPage() {
        System.out.println("User is on menu page...");
    }

    @When("the user clicks {string} on a menu item")
    public void userClicksAddToCart(String buttonText) {
        System.out.println("Clicking: " + buttonText);
    }

    @Then("the cart count should increase by {int}")
    public void cartCountIncreases(int count) {
        System.out.println("Cart count increased by: " + count);
    }

    @Given("the user has items in the cart")
    public void userHasItemsInCart() {
        System.out.println("Cart has items...");
    }

    @When("the user proceeds to checkout")
    public void userProceedsToCheckout() {
        System.out.println("Proceeding to checkout...");
    }

    @When("the user fills in their delivery details")
    public void userFillsDeliveryDetails() {
        System.out.println("Filling delivery details...");
    }

    @Then("the order confirmation should be displayed")
    public void orderConfirmationDisplayed() {
        System.out.println("Order confirmed!");
    }
}