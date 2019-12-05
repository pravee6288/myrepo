
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomPageTest {
	HomePage hp;
	DressPageObject dp;
	
public HomPageTest(){
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
