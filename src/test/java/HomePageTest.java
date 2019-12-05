
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
	HomePage hp;
	DressPageObject dp;
	
public HomePageTest(){
	hp=new HomePage();
	dp=new DressPageObject();

public HomePageTest(){
	hp=new HomePage();
	dp=new DressPageObject();
	
}
@Test
public void vrifyProductHeaderCounter(){
	hp.Dressclk();
	hp.CasualDressclk();
	Assert.assertTrue(dp.getProductFromHeader()==dp.getproductcount(), "Failed:Count mismatched");
	}
}
