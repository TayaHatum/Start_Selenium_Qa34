import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartCss {
    WebDriver wd;

    @Test
    public void startCssLocators(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement el1 =wd.findElement(By.id("root"));
        WebElement el2 =wd.findElement(By.tagName("a"));
        List<WebElement> list =wd.findElements(By.tagName("a"));// ---> 3 a
        wd.findElement(By.className("container"));
       // wd.findElement(By.name("name"));

        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.partialLinkText("LOG"));

        //////////////CSS////////////////////////

// tagname
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("button"));
 // id ----> #
        wd.findElement(By.cssSelector("#root"));
// class ---> .class
wd.findElement(By.cssSelector(".container"));
wd.findElement(By.cssSelector("[href='/home']"));


    }
}
