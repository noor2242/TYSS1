package DDT.practise;


import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

/**
 * This class is reading for data from JSON file
 * @author Hi
 *
 */
public class ReadTheDataFromJasonFileTest {
	@Test
	
	public void readthedatafromjasonfiletest() throws Throwable
	{
		//step-1 convert the JSON File into Json Object
		FileReader fr = new FileReader("./Data/commondata.json");
		//step-2 convert JSON Object into Java Object
		JSONParser jp = new JSONParser();
		Object jObj = jp.parse(fr);
		//step-3 Read the data using HashMap
		HashMap obj = (HashMap)jObj;
		Object value = obj.get("url");
		Object value1 = obj.get("username");
		Object value2 = obj.get("password");
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
	}

}
