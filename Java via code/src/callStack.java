public class callStack {

    public static void D(){
        float f = 3.453f;
        System.out.println("In Method D " +f);
    }

    public static void C(){
        String s = "Jocky";
        System.out.println("In Method C " +s);
    }

    public static void B(){
        //calling C
        C();
        int a = 20;
        System.out.println("In Method B " +a);
    }

    public static void A(){
        B();
        char c = 'D';
        System.out.println("In Method A " +c);
    }

    public static void main(String[] args){

        A();
        D();
    }
}
