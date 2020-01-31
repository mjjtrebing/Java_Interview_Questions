import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 * @author Matthew Trebing
 * 
 * the purpose of this program is to add two files together into an array list and then sort the contents
 *
 */
public class FileOrganizer {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> names = new ArrayList<String>();//an arraylist is used over an array because the we dont know the leng of the documents to be scanned
		
		names = demo(names);
		Collections.sort(names);
		
		System.out.print(names);
		
		
		
		
		
		
	}

	/**
	 * 
	 * @param names
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 * 
	 * This method scans the fileName string given and scans the file.
	 * all the contents of that file is added to the arrayList using a while loop
	 * the now larger arrayList is then returned
	 */
	public static ArrayList<String> dataRipper(ArrayList<String> names, String fileName ) throws FileNotFoundException
	{
		Scanner reader = new Scanner(new File(fileName));
		while(reader.hasNextLine())
		{
		    names.add(reader.nextLine());
		}
		
		return names;
	}
	
	/**
	 * @param ArrayList object
	 * @throws FileNotFoundException
	 * 
	 * this method passes two files names to the dataripper method to be added to the arraylist
	 */
	public static ArrayList<String> demo(ArrayList<String> names) throws FileNotFoundException
	{
		names = dataRipper(names, "Men.txt");
		names = dataRipper(names, "Women.txt");
		
		return names;
	}
	
	
	
	
	
	
	
	
}
