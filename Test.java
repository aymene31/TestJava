import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("comment tu t'appelles ?");
		
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		
		System.out.println("quel est ton prénom ?");
		String prenom = scan.nextLine();
		
		System.out.println("bonjour "+ nom + " " +prenom);
		System.out.println("quel âge as-tu ?");
		int age = scan.nextInt();
		
		if(age >= 18)	System.out.println("tu es majeur");
		else System.out.println("tu n'es pas majeur");
	}
}