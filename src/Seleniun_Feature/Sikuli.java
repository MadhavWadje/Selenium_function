package Seleniun_Feature;

import org.sikuli.script.Screen;

public class Sikuli {
public static void main(String[] args) throws Exception {
	Screen sc = new Screen();
	
	sc.doubleClick("C:\\Users\\dell\\Pictures\\Capture2.PNG");
	Thread.sleep(3000);
	
	//sc.click("C:\\Users\\dell\\Pictures\\Capture1.PNG");
	//Thread.sleep(3000);

	sc.click("C:\\Users\\dell\\Pictures\\Capture3.PNG");
	Thread.sleep(3000);

}
}
