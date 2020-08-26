import java.util.Scanner;

public class avv {
    public static void main(String[] args) {

            int min=0, max=0, sum=0;
            double avg=0.0;
            int score, counter=0;

            Scanner keybd = new Scanner(System.in);
            System.out.println("Enter a test score. Type -1 to quit.");
            score = keybd.nextInt();
            keybd.nextLine();
            min=score;
            max=score;

            while (score != -1) {
                if (score<min){
                    min=score;
                }
                if(score>max){
                    max=score;
                }
                sum=sum + score;
                counter++;
                System.out.println("please enter another score or type -1 to quit");
score= keybd.nextInt();

            }


            if (counter > 0) {
                avg = sum / counter;
            }
            System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
        }
    }

