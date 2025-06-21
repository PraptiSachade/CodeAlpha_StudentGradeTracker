import java.util.*;

public class StudentGradeTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

//input number of students 
System.out.println("Enter number of students: ");
int n= scanner.nextInt();
scanner.nextLine();

//array to store data
String[] names = new String[n];
int[] grades= new int[n];

//input names and grades
for(int i=0;i<n;i++) {
	System.out.println("enter name of student"+(i+1)+":");
	names[i]=scanner.nextLine();
	
	System.out.println("enter grade for "+names[i]+":");
	grades[i]=scanner.nextInt();
	scanner.nextLine();
}
//calculate average,highest,lowest
int sum=0,highest=grades[0],lowest=grades[0];
for(int i=0;i<n;i++) {
	sum+=grades[i];
	if(grades[i]>highest) highest=grades[i];
	if(grades[i]<lowest) lowest=grades[i];
}
double average=(double) sum/n;

//summary report
System.out.println("\n📊 Student Grade Report:");
System.out.println("🧑‍🎓 Name\t📝 Grade");
System.out.println("--------------------------");
for(int i = 0; i < n; i++) {
    System.out.println(names[i] + "\t\t" + grades[i]);
}

System.out.println("\n📈 Average Score: " + average);
System.out.println("🏆 Highest Score: " + highest);
System.out.println("📉 Lowest Score: " + lowest);

scanner.close();
	}

}
