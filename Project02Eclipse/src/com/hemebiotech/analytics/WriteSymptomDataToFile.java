import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
public class WriteSymptomDataToFile implements ISymptomWriter{
	private String filepath;
	public WriteSymptomDataToFile(String filepath) {
		this.filepath=filepath;
	}
	@Override	
	public void writesymptoms(Map<String,Integer>symptoms){
		if (filepath!= null) {		
		try {	
		FileWriter	writer = new FileWriter(filepath);
			for (Map.Entry<String, Integer> symptom : symptoms.entrySet()) {
				
				writer.write(symptom.getKey() + " " + symptom.getValue() + "\n");
			}
				writer.close();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
}
}

