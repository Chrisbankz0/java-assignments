import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Student{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of students: ");
	int numberOfStudents = input.nextInt();

	System.out.print("Enter number of Subjects: ");
	int numberOfSubjects = input.nextInt();


        ArrayList<ArrayList<Double>> allStudentScores = new ArrayList<>();
        ArrayList<Double> totals = new ArrayList<>();
        ArrayList<Double> averages = new ArrayList<>();


	for (int num = 0; num < numberOfStudents; num ++){
		System.out.println("Entering Scores for student " + (num+1) );
		ArrayList<Double> studentScores = new ArrayList<>();
		double total = 0.0;
		
		for (int number = 0; number < numberOfSubjects; number ++){
			System.out.print("Enter score for subject " + (number+1) + ":");
			double score = input.nextDouble();
			
			while(score < 0 || score > 100){
				System.out.print("INVALID SCORE. Enter Scores again: ");
				score = input.nextDouble();
			}

			studentScores.add(score);
			total += score;
		}
		allStudentScores.add(studentScores);
		totals.add(total);
		averages.add(total / numberOfSubjects);

		System.out.println("Saved successfully");
	}

	ArrayList<Double> sortedTotals = new ArrayList<>(totals);
	Collections.sort(sortedTotals, Collections.reverseOrder());

	System.out.println("\nRESULT  SHEET");
	System.out.println("-------------------------------------------------------");

	System.out.printf("%-10s", "Student");
	for(int num = 1; num <= numberOfSubjects; num ++){
		System.out.printf("%-8s", "SUB" + num);
	}

	System.out.printf("%-8s%-10s%-10s%n", "TOTAL", "AVERAGE", "POSITION");
	System.out.println("-------------------------------------------------------");


	for (int num = 0; num < numberOfStudents; num++) {
		System.out.printf("%-10s", "Student " + (num+1));


		for (double score : allStudentScores.get(num)) {
			System.out.printf("%-8.1f", score);
		}

		int position = sortedTotals.indexOf(totals.get(num)) + 1;

		System.out.printf("%-8.1f%-10.2f%-10d", totals.get(num), averages.get(num), position);
        }



}
}