package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> elecoes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				String polict = vect[0];
				int votes = Integer.parseInt(vect[1]);
				
				if (elecoes.containsKey(polict)) {
					int votesTotal = elecoes.get(polict);
					elecoes.put(polict, votes + votesTotal);
				} else {
					elecoes.put(polict, votes);
				}
				line = br.readLine();
			}

			for (String pro : elecoes.keySet()) {
				System.out.println(pro + ": " + elecoes.get(pro));
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally{
			sc.close();
		}
	}
}
