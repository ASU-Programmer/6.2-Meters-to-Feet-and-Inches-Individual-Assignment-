import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
	//below this comment: declare and instantiate a Scanner
        Scanner scnr=new Scanner(System.in);
        //Below this comment: declare any variables you may need
        //to store the user's input and the Feet and Inches equivalent value
        float meters;
        String result;
        //Below this comment: collect the required inputs
        System.out.print("Enter distance in Meters: ");
        meters=scnr.nextFloat();
        //Below this comment: call your MetersToFeetAndInches method
        result=MetersToFeetAndInches(meters);
        //Below this comment: display the required results
        System.out.printf("%.2f meters in Feet and Inches is : %s",meters,result);

    }
    public static String MetersToFeetAndInches(double meters)
    {
        //calculate feet and inches
        double feet,inches;
        //calculate total inches
        inches=meters*39.37f;
        //calculate feet
        feet=(int)inches/12;
        //calculate remaining inches
        inches=inches%12;
        //return the result as a formatted String
        return String.format("%.0f' %.2f\"",feet,inches);
    }
}
