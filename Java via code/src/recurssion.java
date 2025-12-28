public class recurssion {

    static void Test(int n){
        if (n > 0){
            System.out.println(n + " "); // TODO smaple to do
            Test(n - 1);
        }
    }
    public static void main(String[] args){
         Test(3);

    }
}
