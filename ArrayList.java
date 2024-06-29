import java.util.List;
public class ArrayList {
    public static void main(String[] args) {
        List<String> lst = new java.util.ArrayList<>();
        lst.add("Yakshi");
        lst.add("Shakshi");
        lst.add("Ajay");
        lst.add("Arun");

        List<String> link = new java.util.ArrayList<>();
        link.add("Shimni");
        link.add("Swathi");
        link.add("Swetha");
        link.add("Yazhini");

        System.out.println("ArrayList " + lst);
        System.out.println("LinkedList " + link);
    }
}
