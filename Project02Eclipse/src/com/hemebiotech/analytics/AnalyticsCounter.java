
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;


public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;
	
    public AnalyticsCounter(ISymptomReader reader,ISymptomWriter writer){	
    	  this.reader = reader;
    	  this.writer = writer;
    }
    
    public List<String> getSymptoms(){
    	  return reader. GetSymptoms();
    }
    
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
    
    public Map <String,Integer> sortSymptoms (Map<String, Integer> symptoms){ 
    	   TreeMap<String,Integer>sortedSymptoms = new TreeMap<>(symptoms);
    	   return sortedSymptoms;
    }
    
    public void writeSymptoms(Map<String, Integer> symptoms) {
    	   writer.writeSymptoms(symptoms);
    }
    
}
	

