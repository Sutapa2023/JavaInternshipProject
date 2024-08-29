import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestPropery {
	
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileReader reader = new FileReader("C:\\Users\\Lenovo\\Desktop\\Test.properties");
		prop.load(reader);
        String name=prop.getProperty("username");
        
        System.out.println(name);
		
		
	}

}
