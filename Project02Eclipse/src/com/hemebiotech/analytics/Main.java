import java.util.List;
import java.util.Map;

/**
 * The main class that performs symptom analytics.
 */

	public class Main {

			public static void main(String[] args) {
					ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
					ISymptomWriter writer = new WriteSymptomDataToFile();
					AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);
					List<String> symptomList = analyticsCounter.getSymptoms();
					Map<String, Integer> result = analyticsCounter.countSymptoms(symptomList);
					Map<String, Integer>sortedSymptoms = analyticsCounter.sortSymptoms(result);
			 		analyticsCounter.writeSymptoms(sortedSymptoms);
			}

	}
