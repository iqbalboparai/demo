package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaApplication1 {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = br.readLine()) != null) {
			// Splitting the passages
			String[] passages = s.split("\\|");
			// (testPassages) - a new array just for comparing
			String[] testPassages = new String[passages.length];
			// removing leading, trailing and multiple whitespaces
			for (int i = 0; i < passages.length; i++) {
				passages[i] = passages[i].trim();
				passages[i] = passages[i].replaceAll("\\s+", " ");
				testPassages[i] = passages[i];
			}
			// Removing non-alphanumeric characters
			for (int i = 0; i < testPassages.length; i++) {
				testPassages[i] = testPassages[i].replaceAll("[^A-Zaz0-9\\s]", "");
			}
			for (int i = 0; i < passages.length; i++) {
				for (int j = 0; j < passages.length; j++) {
					if (i != j && !testPassages[j].equals("")) {
						// Checking containment
						if (testPassages[j].toLowerCase().contains(testPassages[i].toLowerCase())) {
							passages[i] = "";
							testPassages[i] = "";
							break;
						}
						// Checking duplicates
						else if (testPassages[i].equalsIgnoreCase(testPassages[j])) {
							if (passages[i].length() > passages[j].length()) {
								passages[i] = "";
								testPassages[i] = "";
							} else if (passages[i].length() < passages[j].length()) {
								passages[j] = "";
								testPassages[j] = "";
							} else {
								passages[Math.max(i, j)] = "";
								testPassages[Math.max(i, j)] = "";
							}
							break;
						}
					}
				}
			}
			for (String passage : passages) {
				if (!passage.equals("")) {
					System.out.print(passage + "|");
				}
			}
		}
	}
}