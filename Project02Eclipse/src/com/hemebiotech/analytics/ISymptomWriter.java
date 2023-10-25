import java.util.Map;

/**
 * Interface which used the method for writing symptoms.
 */
public interface ISymptomWriter {
	
	/**
	 * Writes the list of symptoms and their number of occurrences.
	 * @param symptoms A map of symptoms and their occurrences to write.
	 */
	
     public void writeSymptoms (Map<String,Integer>symptoms);
}
