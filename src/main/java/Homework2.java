import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamara\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://www.stealmylogin.com/demo.html");
        driver.findElement(By.name("username")).sendKeys("test");

        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("123456");
        inputPassword.sendKeys(Keys.ENTER);

        if (driver.getTitle().equals("Example Domain")){
            System.out.println("Nice");
        }else {
            System.out.println("Not nice");
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();


    }
}
