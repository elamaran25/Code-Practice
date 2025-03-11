public class num_problem {
    public static void main(String[] args) {
        int a = 3521;
        int b = 2452;
        int c = 1352;

        /*int min_no =9;
        int a1 = a/1000;
        int b1 = (b/100)%10;

        while(c > 0) {
            int c1 = c%10;
            min_no = (c1<min_no)? c1 : min_no;
            c = c/10;
        }
        int result = (a1*b1) + min_no;
        System.out.println("result : " + result);*/

        String a1 = a + "";
        char th_a1 = a1.charAt(a1.length()-4);

        String b1 = b + "";
        char hun_b1 = b1.charAt(b1.length()-3);

        int min_no = 9;

        String c1 = c + "";

        for(int i= 0 ;i < c1.length(); i++) {
            int c2 = c1.charAt(i) - '0';
            min_no = (c2<min_no)? c2 : min_no;
        }
        int result = ((th_a1 - '0') * (hun_b1 - '0')) + min_no;
        System.out.println("result : " + result);

    }
}
