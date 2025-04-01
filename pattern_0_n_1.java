public class pattern_0_n_1 {
    public void pattern(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j < i+1;j++){
                if(i % 2 == 0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_0_n_1 p = new pattern_0_n_1();
        p.pattern(5);
    }

}
