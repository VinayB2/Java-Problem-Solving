public class factorial {
    public static void main(String[]args){
        int n=5;
        int ans=fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n<=1){

            return n;
        }
//         fact(n-1);
        return n*fact(n-1);
    }
}