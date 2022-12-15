import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DeagAndDrop extends Base{
    @Test
    public void testDragAndDrop() {
        String url = "https://the-internet.herokuapp.com/";
        dr.get(url);
        System.out.println("Main page is opened.");
        System.out.println("Starting drag and drop test");
        dr.findElement(By.linkText("Drag and Drop")).click();
        WebElement A = dr.findElement(By.cssSelector("div#column-a"));
        WebElement B = dr.findElement(By.cssSelector("div#column-b"));
        Actions actions = new Actions(dr);
        actions.dragAndDrop(B,A).build().perform();
    }
}
