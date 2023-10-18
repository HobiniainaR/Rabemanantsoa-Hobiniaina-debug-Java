import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
public class WriteSymptomDataToFile implements ISymptomWriter{
		
	@Override	
	public void writesymptoms(Map<String,Integer>symptoms){
				
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


