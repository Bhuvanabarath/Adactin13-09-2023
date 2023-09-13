package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
	public static List<WebElement> elements;

	public static void browserLaunch(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {

			System.out.println("Invalid BrowserName");
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void closeCurrecnBrowser() {
		driver.quit();
	}

	public static String getTittle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getTextValue(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public static String getAttributeValue(WebElement ele) {

		String attribute = ele.getAttribute("value");
		return attribute;

	}

	public static WebElement LocatingElement(String locator, String data) {
		if (locator.equals("id")) {
			element = driver.findElement(By.id(data));
			
		} else if (locator.equals("name")) {
			element = driver.findElement(By.name(data));
			
		} else if (locator.equals("class")) {
			element = driver.findElement(By.className(data));
			
		} else if (locator.equals("xpath")) {
			element = driver.findElement(By.xpath(data));
			
		} else if (locator.equals("tagmame")) {
			element = driver.findElement(By.tagName(data));
			
		} 
		return element;
	}
	
	public static List<WebElement> LocatingElements(String locator, String value) {
		if (locator.equals("id")) {
			List<WebElement> elements = driver.findElements(By.id(value));
			
		} else if (locator.equals("name")) {
			List<WebElement> elements = driver.findElements(By.name(value));
			
		} else if (locator.equals("class")) {
			List<WebElement> elements = driver.findElements(By.className(value));
			
		} else if (locator.equals("xpath")) {
			List<WebElement> elements = driver.findElements(By.xpath(value));
			
		} else if (locator.equals("tagmame")) {
			List<WebElement> elements = driver.findElements(By.tagName(value));
		}
		
		return elements; 
	}

	public static void enterText(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void btnClick(WebElement ele) {
		ele.click();
	}

	public static void mouseOverAction(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src, des).perform();
	}

	public static void doubleClick(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.doubleClick(ele).perform();
	}

	public static void rightClick(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.contextClick(ele).perform();
	}

	public static void navigateTO(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void alertOk() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void alertCancel() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void alertTextbox(String value) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(value);
	}

	public static String alertGetText() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		return text;
	}

	public static void screnshot(String path) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File srcFile = tc.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		FileUtils.copyFile(srcFile, destFile);

	}

	public static void enterTextByJS(WebElement ele, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', ' " + data + " ')", ele);
	}

	public static void btnClickByJS(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

	}

	public static void scrollByJS(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);

	}

	public static void frameByEle(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public static void frameByIdOrName(String frameIdOrName) {
		driver.switchTo().frame(frameIdOrName);
	}

	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void returnFromFrame() {
		driver.switchTo().defaultContent();
	}

	public static void returnToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void selectByIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public static void selectByText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public static void deselectByIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.deselectByIndex(index);
	}

	public static void deselectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.deselectByValue(value);
	}

	public static void deselectByText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.deselectByVisibleText(text);
	}

	public static void deselectAll(WebElement ele) {
		Select s = new Select(ele);
		s.deselectAll();
	}

	public static void getOptions(WebElement ele) {
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
		}
	}

	public static List<WebElement> getAllSelectedOption(WebElement ele) {
		Select s = new Select(ele);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		for (WebElement element : allSelectedOptions) {
//			String text = element.getText();
//			System.out.println(text);
//		}
		return allSelectedOptions ;
	}

	public static String getFirstSelectedOption(WebElement ele) {
		Select s = new Select(ele);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}

	public static boolean muliSelectDw(WebElement ele) {
		Select s = new Select(ele);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public static String getWindoeHaldle() {
		String prtWindow = driver.getWindowHandle();
		return prtWindow;
	}
	public static Set<String> getWindoeHaldles() {
		Set<String> allWin = driver.getWindowHandles();
		return allWin;
		
	}

	public static void windowHandleByID(String id) {
		driver.switchTo().window(id);

	}

	public static void windowHandleByUrl(String url) {
		driver.switchTo().window(url);
	}

	public static void windowHandleByTile(String title) {
		driver.switchTo().window(title);
	}
	
	public static String getDateFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {
		File file = new File("C:\\MyWorkSpace\\MavenProject\\src\\test\\resources\\SampleData1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNo);
		XSSFCell cell = row.getCell(cellNo);

		DataFormatter formatter = new DataFormatter();
		String formatCellValue = formatter.formatCellValue(cell);
		book.close();

		return formatCellValue;

	}
	
	public static boolean isEnabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		return enabled;
	}
	
	public static boolean isDisabled(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		return displayed;
	}
	
	public static boolean isSelecte(WebElement ele) {
		boolean selected = ele.isSelected();
		return selected;
	}
	
	public static void generateJVMReport(String name,String json) {
		File file=new File("C:\\MyWorkSpace\\MavenCucumber\\target");
		Configuration configuration=new Configuration(file, name);
		
		configuration.addClassifications("Platform", "Win-10");
		configuration.addClassifications("Browser", "Chrome 116");
		configuration.addClassifications("Sprint", "5");
		configuration.addClassifications("Author", "BhuvanaBarath");
		
		List<String> l=new ArrayList();
		l.add(json);
		
		ReportBuilder builder =new ReportBuilder(l, configuration);
		builder.generateReports();
		
		
	}
	
}
