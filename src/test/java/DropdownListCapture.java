
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

    public class DropdownListCapture {

        public static void main(String[] args) {
            // Set up WebDriver (assumes ChromeDriver is in your system PATH)
            WebDriver driver = new ChromeDriver();

            // Navigate to the webpage with the dropdown
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewJobDetails/empNumber/91021");

            // Replace "yourDropDownLocator" with the actual locator of your dropdown
            WebElement dropdown = driver.findElement(By.id("job_emp_status"));

            // Click on the dropdown to open options
            dropdown.click();

            // Replace "yourOptionLocator" with the actual locator of the dropdown options
            List<WebElement> dropdownOptions = driver.findElements(By.xpath("//li[@id='yourOptionLocator']"));

            // Print the text of each option
            for (WebElement option : dropdownOptions) {
                System.out.println(option.getText());
            }

            // Close the WebDriver
            driver.quit();
        }
    }

}
