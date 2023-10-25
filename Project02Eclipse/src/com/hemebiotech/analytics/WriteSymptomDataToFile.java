import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The class WriteSymptomDataToFile  implements the  interface ISymptomWriter 
 * and writes symptoms and their occurrences to a file.
 */

public class WriteSymptomDataToFile implements ISymptomWriter{
	
	/**
	 * Writes symptoms along with their occurrences to a file named "result.out".
     *
     * @param symptoms A map of symptoms and their occurrences to write.
	 */
		
	@Override	
	public void writeSymptoms(Map<String,Integer>symptoms){
				
		try {	
		
			FileWriter	writer = new FileWriter("result.out");
			for (Map.Entry<String, Integer> symptom : symptoms.entrySet()) {
				
				writer.write(symptom.getKey() + " : " + symptom.getValue() + "\n");
			}
				writer.close();
		} catch (IOException e) {
				e.printStackTrace();
	    }
	}
}


