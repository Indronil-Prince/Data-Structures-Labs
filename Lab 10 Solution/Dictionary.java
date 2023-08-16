import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Dictionary {
	private HashMap<String,String> hashMap;

	public Dictionary(){
		this.hashMap = new HashMap<>();
	}
	public void buildDictionary(String filename) {
	    try {
			Scanner fileScanner = new Scanner(new File(filename));
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				hashMap.put(line.split("\t")[0],line.split("\t")[1]);
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void search(String word){
		if(hashMap.containsKey(word)){
	    	System.out.println(word + ": " + hashMap.get(word));
		} 
		else{
			System.out.println(word + " not found in the dictionary!");
		}
	}
}
