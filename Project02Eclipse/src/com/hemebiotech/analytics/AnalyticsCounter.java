import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0;	
	private static int rashCount = 0;		
	private static int dialatedpupilCount = 0;		

	public static void main(String args[]) throws Exception {
	try {	
		BufferedReader reader = new BufferedReader (new FileReader(".\\ Project02 \\symptoms.txt"));
		    String line = reader.readLine();

		
		while (line != null) {
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headacheCount++;
				System.out.println("number of headaches: " + headacheCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
				System.out.println("Number of rash: " + rashCount);
			}
			else if (line.equals("dialatedpupils")) {
			     dialatedpupilCount++;
			     System.out.println("Number of dialated pupils: " + dialatedpupilCount);
			}
            
			line = reader.readLine();
			
		    }
	  }
			catch (IOException e) {
				e.printStackTrace();
			}
		
	
	
		}
		
		
		FileWriter writer = null;
		try {
	    writer = new FileWriter (".\\Project02\\result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + dialatedpupilCount + "\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
		writer.close();
	}
}
}