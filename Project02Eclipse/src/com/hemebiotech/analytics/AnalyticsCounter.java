
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * The class AnalyticsCounter performs analytics on a list of symptoms.
 * 
 * @author Hobiniaina.
 */

public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;
	
	/**
	 * This constructs an AnalyticsCounter with the specified interface IsymptomReader and IsymptomWriter.
	 *
	 * @param reader The interface to read symptoms from.
	 * @param writer The interface to write analytics results to.
	 */
    public AnalyticsCounter(ISymptomReader reader,ISymptomWriter writer){	
    	  this.reader = reader;
    	  this.writer = writer;
    }
    
    /**
     * Retrieves a raw listing of all Symptoms obtained from a data source.
     *
     * @return the list of symptoms.
     */
    
    public List<String> getSymptoms(){
    	  return reader. getSymptoms();
    }
    
    /**
     * Counts the occurrences of each symptom in the given list.
     * 
     * @param symptoms The listing of all Symptoms to analyze.
     * @return a Map containing each unique symptom and its occurrence count.
     */
    public Map <String,Integer> countSymptoms (List <String>symptoms){
    	   Map<String,Integer> result = new HashMap<String,Integer>();
    	   for(String symptom : symptoms) {
    		   if(result.containsKey(symptom)) 
    			   result.put(symptom,result.get(symptom)+1);
    		   else
    			   result.put(symptom,1);
    	   }
    	   return result;
    }
    
    /**
     * Sorts the symptoms in alphabetical order using a TreeMap.
     * 
     * @param symptoms The Map of symptoms to sort.
     * @return a TreeMap containing the list of symptoms sorted in alphabetical order.
     */
    public Map <String,Integer> sortSymptoms (Map<String, Integer> symptoms){ 
    	   TreeMap<String,Integer>sortedSymptoms = new TreeMap<>(symptoms);
    	   return sortedSymptoms;
    }
    
    /**
     * Writes the list of symptoms sorted and their number of occurrences using the object writer .
     *
     * @param symptoms A Map of symptoms and their occurrences counts.
     */
    public void writeSymptoms(Map<String, Integer> symptoms) {
    	   writer.writeSymptoms(symptoms);
    }
    
}
	

