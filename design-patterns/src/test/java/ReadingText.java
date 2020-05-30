
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingText {

	public static void main(String args[]) throws IOException {

		// Loading an existing document
		File file = new File("C:\\Users\\Sara Kanase\\Downloads\\PUPUN00341250000004670.pdf");
		PDDocument document = PDDocument.load(file);

		// Instantiate PDFTextStripper class
		PDFTextStripper pdfStripper = new PDFTextStripper();

		// Retrieving text from PDF document
		String text = pdfStripper.getText(document);

		// split by whitespace
		String lines[] = text.split("\\r?\\n");
		int total = 0;
		for (String line : lines) {
			if ((line.startsWith("Cont."))) {
				line = line.replace("Cont. For ", "");
				String contribution = (line.split(" "))[1];
				contribution = contribution.replace(",", "");
				total += Integer.parseInt(contribution);
				System.out.println(line + "  " + contribution);
			} else if (line.startsWith("Int. Updated upto")) {
				line = line.replace("Int. Updated upto ", "");
				String contribution = (line.split(" "))[1];
				contribution = contribution.replace(",", "");
				total += Integer.parseInt(contribution);
				System.out.println("++  " +line + "   " + contribution);
			}

		}

		 System.out.println(total);

		// Closing the document
		document.close();

	}
}