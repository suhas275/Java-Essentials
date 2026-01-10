package constructorAndGetterCall.example1;

public class cars {

    private String narendra;
    private int myAmount;
    private int returnAmount;

    public cars(String narendra, int myAmount, int returnAmount) {
        this.narendra = narendra;
        this.myAmount = myAmount;
        this.returnAmount = returnAmount;
    }

    public String getNarendra() {
        return narendra;
    }

    public int getMyAmount() {
        return myAmount;
    }

    public int getReturnAmount() {
        return returnAmount;
    }


}
