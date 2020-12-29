package android.tests;

import android.pages.HomePage;
import android.pages.LoginPage;
import com.peoplentech.mobileautomation.ExtentTestManager;
import com.peoplentech.mobileautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegressionTests extends TestBase {

    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeMethod
    public void pageFactorySetup() {

        homePage = PageFactory.initElements(getDriver(), HomePage.class);
        loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnTransferButton() {

        homePage.clickOnTransferButton();
        sleepFor(5);
        loginPage.clickOnBackButton();
        sleepFor(5);
    }

    @Test
    public void validateUserUnableToLogInWithInvalidCredentials() {
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
        loginPage.userUnableToLoginWithInvalidCredentials();
        sleepFor(2);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSendMoneyBtn() {
        homePage.clickOnSendMoneyButton();
        sleepFor(5);
        loginPage.clickOnBackButton();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToCheckLocation() {
        homePage.userAbleToCheckLocation();
        sleepFor(2);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnAccountsButton() {

        homePage.clickOnAccountsButton();
        sleepFor(4);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToContactTDBank() {
        homePage.userAbleToContactTDBank();
        sleepFor(2);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToScrollOnProductPage() {

        homePage.clickOnProducts();
        homePage.userOnProductPage();
        functionSwipe("up", 200, 500);
        ExtentTestManager.log("swiped down");
        sleepFor(5);
        functionSwipe("up", 200, 500);
        sleepFor(5);
        ExtentTestManager.captureScreenshot(getDriver(), "validateUserBeingAbleToScrollOnProductPage.png");
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnAccounts() {

        homePage.clickOnAccountsButton();
        loginPage.clickOnBackButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickBetweenButtons() {
        homePage.clickOnDepositButton();
        loginPage.clickOnBackButton();
        homePage.clickOnPayABillButton();
        loginPage.clickOnBackButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToViewTheFullMenu() {
        homePage.clickOnMenuBtn();
        sleepFor(4);
    }

}
