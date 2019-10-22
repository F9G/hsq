import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

	String name = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String first = "Hello";
		String second = null;

		Examples1 ex1 = new Examples1();

		int total = ex1.getLength(first) + ex1.getLength(second);

		int len = second.length();

	}

	private void writeToFile(String output) throws OutputException {
		FileOutputStream out; // declare a file output object
		PrintStream p; // declare a print stream object

		try {
			// Create a new file output stream
			// connected to "myfile.txt"
			out = new FileOutputStream("myfile.txt");

			new PrintStream(out).println(output);

		} catch (Exception e) {
			OutputException ex = new OutputException(e.getStackTrace());
			ex.setOutput(output);
			System.err.println("Error writing to file");
			throw ex;
		}
	}
}
