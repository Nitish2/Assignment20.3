package hashMapFuntions;

/**
 * Creating a HashMap object in the Java Program and perform the following functionalities:
     Adding key-value pairs to the HashMap object.
       Adding a key-value pair to the HashMap object if the key-value pair doesn’t exist already.
         Retrieving a value associated with a given key from the HashMap.
            Clearing all the key-value pair present in the HashMap.
 */
import java.util.HashMap;
import java.util.Map;

public class CricketIndia {  //Creates class 
	public static void main(String[] args) { //Main class
        
		//Creating HashMap object 
		HashMap<String, String> hashObj = new HashMap<String, String>();
		
		//Adding Key Value into the hashMap . 
		hashObj.put("Player", "Virat Kohli");
		hashObj.put("Age", "28");
		
		for (Map.Entry<String, String> hash1 : hashObj.entrySet()) { // Prints all key-value pairs in the hashMap table 
			System.out.println(hash1.getKey() + " " + hash1.getValue());
		}
		
		String key = "Name"; // Declaring variables 
		String value = "31";
         
		// Checks weather a key-value pair exists or not ?
		String resultKey = hashObj.containsKey(key) ? (hashObj.get(key)) : ("\nKey (" + key + ") doesn't exist.");
		log(resultKey); //Calling Log method 
		String resultValue = hashObj.containsValue(value) ? ("Value (" + value + ") exist.")
				: ("Value (" + value + ") doesn't exist.\n");
		log(resultValue);

		// Getting the value associated with the given key .
		System.out.println("Value associated with a given key is: " + hashObj.get("Player"));

		// Deleting all the key-value pair from the HashMap.
		hashObj.clear();
		System.out.println("\nAll the key-value pairs are removed from the HashMap.");

	}

	private static void log(Object object) {  //Creates method 
		// TODO Auto-generated method stub
		System.out.println(object);

	}

}
