package Application;

public class Program {

	public static void main(String[] args) {

		//estanciando um vetor com alguns valores
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//percorre todo o vetor
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("--------------------------------------");
		//vai percorre todo o vetor, chamndo todos os elementos do meu vetor de arr
		for (String arr : vect) {
			System.out.println(arr);
		}
	}
}
