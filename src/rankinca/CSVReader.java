package rankinca;

//import file libraries
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		
		String csvFile = "C:\\Users\\ranki\\Documents\\TestDocs\\SampleCSV.csv";
		BufferedReader reader = null;
		String line = "";
		String csvSplitBy = ",";
		String[] csvArray;
		
		try {
			reader = new BufferedReader(new FileReader(csvFile));
			while ((line = reader.readLine()) != null) {
				// using comma as separator
				csvArray = line.split(csvSplitBy);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if (reader !=null) {
				try {
					reader.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
