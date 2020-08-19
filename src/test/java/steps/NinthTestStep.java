package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class NinthTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Условия продажи")
    public void пользовательНажимаетНаКнопкуУсловияПродажи() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnTerms();
    }
    @Тогда("^пользователь переходит на страницу Условия продажи")
    public void пользовательПереходитНаСтраницуУсловияПродажи() {
        tsumMainPage.checkPageName("Условия продажи");
    }
}

