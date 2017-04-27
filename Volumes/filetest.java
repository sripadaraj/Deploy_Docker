//This program take a volume/directory as an input and prints the date and time it has been opened

//PACKAGES:
import java.util.*;
import java.io.*;
//Files input and output operations are enabled using IO package
import java.nio.file.Paths;
//This package enables to make the root directory and to find path
import java.sql.Timestamp;
//It adds the ability to hold the SQL TIMESTAMP fractional seconds value,
//by allowing the specification of fractional seconds to a precision of nanoseconds.
import java.text.SimpleDateFormat;

public class filetest
{
 	
	public static final String FILENAME = "/datadir/output.txt";
       //store the location of the file directory 
	public static void main(String a[])
	{
		File newTextFile = new File("/datadir/output.txt");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                
				
		BufferedReader br = null;
		FileReader fr = null;
	//exection is done through the try and catch exceptions....
		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));
while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

try {
            String str1 ="File was logged at time" ;
	   String str2 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
            FileWriter fw = new FileWriter(newTextFile);
            fw.write(str1);
	    fw.write(str2);	
            fw.close();

        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }
	}

}

