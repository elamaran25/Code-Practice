public class max_n_min {
    public static void main(String[] args) {
        int a = 3521;
        int b = 2452;
        int c = 1352;

        /*int a_min = 9,b_min = 9,c_min = 9, a_max = 0,b_max = 0,c_max = 0,res,x,y,z;
        while(a>0 || b>0 || c>0){
            if(a>0){
                x = a%10;
                if (x < a_min)
                    a_min = x;
                if(x > a_max)
                    a_max = x;
            a/=10;
            }
            if(b>0){
                y = b%10;
                if (y < b_min)
                    b_min = y;
                if(y >b_max)
                    b_max = y;
            b/=10;
            }
            if(c>0){
                z = c%10;
                if (z < c_min)
                    c_min = z;
                if(z > c_max)
                    c_max = z;
            c/=10;
            }
        }
        res = a_min+a_max+b_min+b_max+c_min+c_max;
        System.out.println("result : " + res);   */

        int s1 = 9,s2 = 9,s3 = 9,l1 = 1,l2 = 1,l3 = 1,res;
        while(true){
            s1 = (s1 < a%10) ? s1 : a%10;
            s2 = (s2 < b%10) ? s2 : b%10;   
            s3 = (s3 < c%10) ? s3 : c%10;
            l1 = (l1 > a%10) ? l1 : a%10;
            l2 = (l2 > b%10) ? l2 : b%10;
            l3 = (l3 > c%10) ? l3 : c%10;
            
            a/=10;
            b/=10;
            c/=10;
            if(a==0)
                break;

        }
        System.out.println("result : " + (s1+s2+s3+l1+l2+l3));
    }
}
