package android.pages;

import com.peoplentech.mobileautomation.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountsBtn;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMoneyBtn;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payABillBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Manage Transfers']")
    private WebElement manageTransfersBt;

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement productsBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Contact us']")
    private WebElement clickOnContactUs;

    @FindBy(xpath = "//android.widget.TextView[@text='TD ASAPTM']")
    private WebElement clickOnTDASAPTM;

    @FindBy(xpath = "//android.widget.Button[@text='Continue call']")
    private WebElement clickOnContinueCall;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Call button']")
    private WebElement clickCallButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Locations']")
    private WebElement clickOnLocation;

    @FindBy(xpath = "//android.widget.Button[@text='Allow only while using the app']")
    private WebElement clickAllowApp;

    @FindBy(xpath = "//android.widget.EditText[@text='Enter zip or city/state']")
    private WebElement clickZipCodeButton;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc='Checking Accounts']")
    private WebElement checkingAccountBtn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Show Menu']")
    private WebElement menuBtn;


    public void userOnProductPage() {
        Assert.assertTrue(checkingAccountBtn.isDisplayed());
        ExtentTestManager.log("user is on the product page");
    }


    public void clickOnProducts() {
        productsBtn.click();
        ExtentTestManager.log("clicked on product");
    }


    public void clickOnAccountsButton() {
        accountsBtn.click();
        ExtentTestManager.log("Clicked on Account button");
    }

    public void clickOnPayABillButton() {
        payABillBtn.click();
        ExtentTestManager.log("Clicked on Pay A Bill button");
    }

    public void clickOnDepositButton() {
        depositBtn.click();
        ExtentTestManager.log("Clicked on Deposit button");
    }

    public void clickOnTransferButton() {
        transferBtn.click();
        ExtentTestManager.log("Clicked on Transfers button");
    }

    public void clickOnSendMoneyButton() {
        sendMoneyBtn.click();
    }

    public void userAbleToContactTDBank() {
        clickOnContactUs.click();
        ExtentTestManager.log("Clicked on Contact us");
        clickOnTDASAPTM.click();
        ExtentTestManager.log("Clicked on TD ASAPTM");
        clickOnContinueCall.click();
        ExtentTestManager.log("Clicked on Continue call");
        clickCallButton.click();
        ExtentTestManager.log("Clicked Call button");
    }

    public void userAbleToCheckLocation() {
        clickOnLocation.click();
        ExtentTestManager.log("Clicked on Locations");
        clickAllowApp.click();
        ExtentTestManager.log("Clicked Allow only while using the app");
        clickZipCodeButton.sendKeys("11694", Keys.RETURN);
        ExtentTestManager.log("Entered ZipCode");
    }

    public void clickOnMenuBtn() {
        menuBtn.click();
        ExtentTestManager.log("Scrolled the menu");
    }
}
