package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class SixthTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Оплата")
    public void пользовательНажимаетНаКнопкуОплата() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnPayments();
    }
    @Тогда("^пользователь переходит на страницу Оплата")
    public void пользовательПереходитНаСтраницуОплата() {
        tsumMainPage.checkPageName("Оплата");
    }
}

