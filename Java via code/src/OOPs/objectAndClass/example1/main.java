package OOPs.objectAndClass.example1;

public class main {
    public static void main(String[] args) {
        cars newcar = new cars("amount ako lowde", 2500, 3000);
        System.out.println(newcar.getNarendra());
        System.out.println(newcar.getMyAmount());
        System.out.println(newcar.getReturnAmount());

        System.out.println("Narendra " + newcar.getNarendra() + " nan " + newcar.getMyAmount() + " nen  return madbek erod total " + newcar.getReturnAmount());

    }
}
