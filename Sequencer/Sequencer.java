import java.util.*;

public class Sequencer {

	public static void main(String[] args) {
		// PART 1 - Reconstruction
		Scanner inp = new Scanner(System.in);
		System.out.println("Input lowercase DNA fragments one line at a time. End with a blank line.");
		String dna = "";
		while (inp.hasNextLine()) {
			String str = inp.nextLine();
			str = str.toLowerCase();
			str = str.trim();
			int n_str = str.length();
			if (str.isEmpty()) {
				break;
			}
			if (dna.isEmpty()) {
				dna = str;
			} else {
				int n_dna = dna.length();
				int start = -1;
				int end = -1;
				for (int i = n_str - 1; i >= 0; i--) {
					int j = n_dna - 1;
					if (str.charAt(i) == dna.charAt(j)) {
						if (start == 0) {
							break;
						}
						end = i;
						for (int m = i - 1; m >= 0; m--) {
							j--;
							if (str.charAt(m) == dna.charAt(j)) {
								start = m;
							} else {
								end = -1;
								break;
							}

						}
					}
				}
				if (start == 0 && end != -1) {
					String newStr = str.substring(end + 1);
					newStr.trim();
					dna = dna + newStr;
				} else {
					dna = dna + str;
				}
			}
		}
		inp.close();
		int N = dna.length();
		boolean valid = true;
		for (int x = 0; x < N; x++) {
			if (dna.charAt(x) != 'a' && dna.charAt(x) != 't' && dna.charAt(x) != 'c' && dna.charAt(x) != 'g') {
				valid = false;
			}
		}

		if (valid) {
			System.out.println("Input DNA: " + dna);
		} else {
			System.out.println("DNA is Invalid");
			return;
		}

		// PART 2 - Finding a Gene
		boolean codonStart = false;
		boolean codonEnd = false;

		int startCodon = 0;
		int endCodon = 0;
		for (int i = 0; i < N; i++) {
			if (dna.charAt(i) == 'a') {
				if ((i + 1 < N) && dna.charAt(i + 1) == 't') {
					if ((i + 2 < N) && dna.charAt(i + 2) == 'g') {
						codonStart = true;
						startCodon = i;
						break;
					}
				}
			}
		}
		if (codonStart == false) {
			System.out.println("DNA does not contain a gene start codon");
			return;
		} else {
			
			for (int i = N - 3; i >= 0; i--) {
				if (dna.charAt(i) == 't') {
					if (dna.charAt(i + 1) == 'a') {
						if (dna.charAt(i + 2) == 'a' || dna.charAt(i + 2) == 'g') {
							if ((i - startCodon) % 3 == 0) {
								codonEnd = true;
								endCodon = i;
							}
							
						}
					}
					if (dna.charAt(i + 1) == 'g') {
						if (dna.charAt(i + 2) == 'a') {
							if ((i - startCodon) % 3 == 0) {
								codonEnd = true;
								endCodon = i;
							}
						}
					}
				}
			}

		}
		if (codonEnd == false) {
			System.out.println("DNA does not contain a gene end codon");
			return;
		}
		String gene = dna.substring(startCodon, endCodon);
		System.out.println("Start codon position: " + startCodon);
		System.out.println("End codon position: " + endCodon);
		System.out.println("Gene: " + gene);

		// PART 3 - Decoding the Gene

		int n_gen = gene.length();
		if (n_gen < 30) {
			System.out.println("The gene is not long enough to continue.");
			return;
		}

		System.out.println(); // Empty Line
		System.out.println("Analysis Results");
		System.out.println(); // Empty Line

		String eyeColor = "";
		String hairColor = "";
		String tRoll = "yes";

		char eyeColorChar = gene.charAt(20);
		char hairColorChar = gene.charAt(18);
		char tRollChar = gene.charAt(8);

		if (eyeColorChar == 'a') {
			eyeColor = "blue";
		}
		if (eyeColorChar == 't') {
			eyeColor = "green";
		}
		if (eyeColorChar == 'c' || (eyeColorChar == 'g')) {
			eyeColor = "brown";
		}

		System.out.println("Eye color: " + eyeColor);

		if (hairColorChar == 'a') {
			hairColor = "black";
		}
		if (hairColorChar == 't') {
			hairColor = "blond";
		}
		if (hairColorChar == 'c') {
			hairColor = "brown";
		}
		if (hairColorChar == 'g') {
			hairColor = "red";
		}

		System.out.println("Hair color: " + hairColor);

		if (tRollChar == 't' || tRollChar == 'c' || tRollChar == 'g') {
			tRoll = "no";
		}

		System.out.println("Can roll tongue? " + tRoll);

	}
}
