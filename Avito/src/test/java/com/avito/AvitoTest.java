package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class AvitoTest {
    protected WebDriver driver;

    // Метод для настройки драйвера и открытия сайта
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/Ivanlv/Downloads/geckodriver-v0.35.0-win64");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Тест для открытия и закрытия страницы с подсчетом времени выполнения
    public void testOpenAndClosePage() {
        long startTime = System.currentTimeMillis(); // Засекаем время начала

        // Открываем страницу
        driver.get("https://www.avito.ru");

        // Печатаем время выполнения теста
        long endTime = System.currentTimeMillis(); // Засекаем время окончания
        System.out.println("Время выполнения теста testOpenAndClosePage: " + (endTime - startTime) + " миллисекунд");

        // Закрываем браузер
        driver.quit();
    }

    // Метод для завершения работы с браузером
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
