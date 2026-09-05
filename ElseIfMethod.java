import java.util.Scanner;
public class ElseIfMethod { {
    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if(age>45){
            System.out.println("you are ultra pro");
        }
        else if (age>35) {
            System.out.println("you are pro");
        }
        else if (age>25) {
            System.out.println("you are a beginner");
        }
        else {
            System.out.println("you are noob");
            }
        }
    }