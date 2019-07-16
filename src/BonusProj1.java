import java.util.Scanner;

public class BonusProj1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;
		
		do {
			char letterGrade;
			System.out.println("Please enter your grade.");
			int grade = scan.nextInt();
			scan.nextLine();
			
			if (grade <= 100 && grade > 87) {
				letterGrade = 'A';
			}
			else if (grade <= 87 && grade > 79) {
				letterGrade = 'B';
			}
			else if (grade <= 80 && grade > 66) {
				letterGrade = 'C';
			}
			else if (grade <= 66 && grade > 60) {
				letterGrade = 'D';
			}
			else if (grade <= 60 && grade > -1) {
				letterGrade = 'F';
			}
			else {
				System.out.println("Please enter an integer between 0 and 100.");
				continue;
			}
			
			System.out.println("You got a(n) " + letterGrade);
			
			System.out.println("Would you like to continue? (y/n) ");
			
			if (scan.nextLine().equals("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
		}
		while (keepGoing);
	}
}
