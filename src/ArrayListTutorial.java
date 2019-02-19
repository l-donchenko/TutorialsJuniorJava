import java.util.ArrayList;

public class ArrayListTutorial {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "1");
        list.add(1, "2");
        list.add(2, "100");
        System.out.println("List before removing second element: " +list);
        list.remove(1);
        System.out.println("List after removing second element: "+list);
    }


}
