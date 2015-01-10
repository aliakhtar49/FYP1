import java.io.File;


public class Driver {

	public static void main(String[] args) {
		File file = new File("D:\\Directory1");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
			
		}
		else
			
		{
			System.out.println("Directory ALready Created ");
		}
		File files = new File("D:\\Directory2\\Sub2\\Sub-Sub2");
		/*if (!files.exists()) {
			if (files.mkdirs()) {
				System.out.println("Multiple directories are created!");
			} else {
				System.out.println("Failed to create multiple directories!");
			}
		}
		else
		{
			System.out.println("Multiple Directories  ALready Created ");
		}*/

	}

}
