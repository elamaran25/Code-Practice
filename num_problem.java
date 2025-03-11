public class num_problem {
    public static void main(String[] args) {
        int a = 3521;
        int b = 2452;
        int c = 1352;

        int min_no =9;
        int a1 = a/1000;
        int b1 = (b/100)%10;

        while(c > 0) {
            int c1 = c%10;
            min_no = (c1<min_no)? c1 : min_no;
            c = c/10;
        }
        int result = (a1*b1) + min_no;
        System.out.println("result : " + result);
    }
}
