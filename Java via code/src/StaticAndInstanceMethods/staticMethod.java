package StaticAndInstanceMethods;

class name {
    public static void bike(String bikeName){  // static method : when the method doesn't use any instance variable
        System.out.println("I want to buy " +bikeName);
    }
}
public class staticMethod {
    public static void main(String[] args) {
        name.bike("NS200");
    }
}
