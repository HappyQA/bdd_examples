package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class EighthTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Обмен и возврат")
    public void пользовательНажимаетНаКнопкуОбменИВозврат() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnReturns();
    }
    @Тогда("^пользователь переходит на страницу Обмен и возврат")
    public void пользовательПереходитНаСтраницуОбменИВозврат() {
        tsumMainPage.checkPageName("Обмен и возврат");
    }
}

