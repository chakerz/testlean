package com.company;

import com.hp.lft.sdk.web.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.*;

import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

@ExtendWith(UnitTestClassBase.class)
public class UFTDeveloperTest {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        //Launch Chrome
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        //Navigate to "Advantage Online Shopping"
        browser.navigate("http://www.advantageonlineshopping.com");

        browser.describe(Link.class, new LinkDescription.Builder()
                .tagName("A")
                .id("menuUserLink").build()).click();

        browser.describe(Link.class, new LinkDescription.Builder()
                .tagName("A")
                .innerText("CREATE NEW ACCOUNT").build()).click();

        //Fill in the user details and create the account
        ApplicationModel1 appModel = new ApplicationModel1(browser);
        appModel.AdvantageShoppingPage().UsernameRegisterPageEditField().setValue("HakimUser202020");
        appModel.AdvantageShoppingPage().PasswordRegisterPageEditField().setSecure("596f1409b156a60dc50592de897863e8d552");
        appModel.AdvantageShoppingPage().ConfirmPasswordRegisterPageEditField().setSecure("596f1409b156a60dc50592de897863e8d552");
        appModel.AdvantageShoppingPage().EmailRegisterPageEditField().setValue("demoUser@default.com");
        appModel.AdvantageShoppingPage().IAgreeCheckBox().set(true);
        appModel.AdvantageShoppingPage().RegisterBtnundefinedButton().click();
    }

}