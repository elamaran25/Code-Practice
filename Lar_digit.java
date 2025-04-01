public class Lar_digit {
    public static void main(String[] args) {
        int a = 3521;
        int b = 2452;
        int c = 1352;

        int a_max = 0, b_max = 0, c_max = 0, a_max_sec = 0, b_max_sec = 0, c_max_sec = 0;

        while(a > 0 && b > 0 && c > 0){
            int a1 = a % 10;
            int b1 = b % 10;
            int c1 = c % 10;

            if(a1 > a_max){
                a_max_sec = a_max;
                a_max = a1;
            }
            if(a1 != a_max && a1 > a_max_sec){
                a_max_sec = a1;
            }

            if(b1 > b_max){
                b_max_sec = b_max;
                b_max = b1;
            } 
            if(b1 != b_max && b1 > b_max_sec){
                b_max_sec = b1;
            }

            if(c1 > c_max){
                c_max_sec = c_max;
                c_max = c1;
            } 
            if(c1 != c_max && c1 > c_max_sec){
                c_max_sec = c1;
            }

            a /= 10;
            b /= 10;
            c /= 10;
        }
        
        int result = (a_max + b_max + c_max) + (a_max_sec + b_max_sec + c_max_sec);
        System.out.println(result);
    }
}
