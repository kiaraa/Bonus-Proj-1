import java.util.Scanner;

public class BonusProj1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;
		
		do {
			String letterGrade;
			System.out.println("Please enter your grade.");
			int grade = scan.nextInt();
			scan.nextLine();
			
			if (grade <= 100 && grade > 98) {
				letterGrade = "A+";
			}
			else if (grade <= 98 && grade > 92) {
				letterGrade = "A";
			}
			else if (grade <= 92 && grade > 89) {
				letterGrade = "A-";
			}
			else if (grade <= 89 && grade > 86) {
				letterGrade = "B+";
			}
			else if (grade <= 86 && grade > 83) {
				letterGrade = "B";
			}
			else if (grade <= 83 && grade > 79) {
				letterGrade = "B-";
			}
			else if (grade <= 79 && grade > 76) {
				letterGrade = "C+";
			}
			else if (grade <= 76 && grade > 73) {
				letterGrade = "C";
			}
			else if (grade <= 73 && grade > 66) {
				letterGrade = "C-";
			}
			else if (grade <= 66 && grade > 64) {
				letterGrade = "D+";
			}
			else if (grade <= 64 && grade > 62) {
				letterGrade = "D";
			}
			else if (grade <= 62 && grade > 60) {
				letterGrade = "D-";
			}
			else if (grade <= 60 && grade > -1) {
				letterGrade = "F";
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
