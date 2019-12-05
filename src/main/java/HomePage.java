
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dressbtn;
	@FindBy(xpath="//*[@id=\'categories_block_left\']/div/ul/li[1]/a")
	private WebElement Casualdressbtn;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
		
	}
	public void Dressclk(){
		Dressbtn.click();
	}
	
		public void CasualDressclk()
		{
			
			Casualdressbtn.click();	
	
	}

public void CasualDressclk()
		{
			
			Casualdressbtn.click();	
	
	}
}
