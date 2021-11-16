package TestNGPractice;

import org.testng.annotations.Test;

public class DataProvider {
	@org.testng.annotations.DataProvider
public Object[][] senddata()
{
	Object[][] ob=new Object[3][2];
	
	ob[0][0]="Acc_1";
	ob[0][1]=4356.00;
	
	ob[1][0]="Acc_2";
	ob[1][1]=2345;
	
	ob[2][0]="Acc_3";
	ob[2][1]=4532.00;
	return ob;
}
	@Test(dataProvider="senddata")
	public void getdata()
	{
		
	}
}
