package StaticAndInstanceMethods;

class name2 {
    public void bike(String bikeName){
        System.out.println("I want to buy " +bikeName);
    }
}
public class instanceMethod {
    public static void main(String[] args) {
        name2 vehical = new name2();
        vehical.bike("NS200");
    }
}
