package rankinca;

//import file processing libraries
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVArray {

	String csvFile = "C:\\Users\\ranki\\Documents\\TestDocs\\SampleCSV.csv";
	BufferedReader reader;
	ArrayList<String> csvRecordsRaw;
	
	public ArrayList<String> setListArray(String csvfile) {
		try {
			reader = new BufferedReader(new FileReader(csvFile));

			// create list array
			csvRecordsRaw = new ArrayList<String>();
			String line;
			while (true) {
				line = reader.readLine();
				if (line == null)
					break;
				csvRecordsRaw.add(line);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		return csvRecordsRaw;
	}
	
	// = new BufferedReader(new FileReader(csvFile));
	
	
//	BufferedReader br = new BufferedReader(new FileReader(new File("filename.txt")));
//	ArrayList<Double> ald = new ArrayList<Double>();
//	String line;
//	while(true)
//	{
//	    line = br.readLine();
//	    if(line == null) break;
//	    ald.add(new Double(line));
//	}
//	
	
}
