import java.util.Scanner;

public class CGST_N_GST {
    public static void main(String[] args) {
        double gst, cgst;
        System.out.println("Enter the cost of the product : ");
        Scanner sc = new Scanner(System.in);
        double product = sc.nextDouble();
        cgst = (9.0 / product) * 100;
        gst = (9.0 / product) * 100;
        System.out.println("The GST and CGST of an Product is : \n" + gst + "\n"+ cgst );
        sc.close();
    }
}
