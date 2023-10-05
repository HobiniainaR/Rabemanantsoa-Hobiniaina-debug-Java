package com.hemebiotech.analytics;

	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Map;
	import java.util.Map.Entry;


	/**
	 * 
	 * Create a new file and write in this
	 *
	 */


	public class WriteSymptomDataToFile implements IwriteSymptom{

		
		public void writeSymptoms(Map<String, Integer> mapSymptoms, String filename) {
		
			FileWriter newSymptomFile;
			try {
				
				newSymptomFile = new FileWriter(filename, false);
				
				for(Entry<String, Integer> symptom : mapSymptoms.entrySet()) {
					newSymptomFile.write(symptom.getKey() + " : " + symptom.getValue() + "\n");
				}
				newSymptomFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}

}
