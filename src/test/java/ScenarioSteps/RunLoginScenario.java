package ScenarioSteps;

import LoginPage.LoginElements;
import TestRunner.Runner;
import com.ahmed.excelizer.ExcelReader;
import io.Ahmed.Gen.Gen;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Epic("ADMIN MODULE")
@Feature("LOGIN FEATURE")
public class RunLoginScenario extends Runner {

    LoginElements loginElements = new LoginElements();

    @DataProvider(name = "datareader")
    public Object[][] readExcel() {

        return ExcelReader.loadTabularData("src\\main\\resources\\loginData.xlsx", "Sheet1");
    }

    @Test(priority = 1, groups = "login", description = "invalid case ", dataProvider = "datareader")
    @Severity(SeverityLevel.CRITICAL)
    public void invalidLogin(String username, String password, String errorMessage) {

        loginElements.loginForm(username, password);

        Gen.assertEqual(loginElements.getLoginError(), errorMessage);
    }

    @Test(priority = 2, groups = "login")
    @Severity(SeverityLevel.NORMAL)
    public void validLogin() {

        loginElements.loginForm("qcscout2020@gmail.com", "Ahmed123");

    }

}



