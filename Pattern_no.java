public class Pattern_no {
    public void pattern(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || i== n-1 ){
                    System.out.print("1 ");
                }else if(j == 0){
                    System.out.print(i + " ");
                }
                else if(j == n-1){
                    System.out.print(n + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern_no p = new Pattern_no();
        p.pattern(5);
    }    
}
