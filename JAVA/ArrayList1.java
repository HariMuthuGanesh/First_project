import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(6);
        list.add(1);

        int result1 = list.indexOf(6);
        System.out.println(result1);

        int result = list.lastIndexOf(2);
        System.out.println(result);

        result = list.lastIndexOf(8);
        System.out.println(result);

        System.out.println(list);

        ArrayList<Boolean> list2 = new ArrayList<>();

        list2.addFirst(true);
        list2.addLast(false);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Ragavi");
        list3.add("Muthu");
        System.out.println(list3);

        list3.addFirst("R.");
        list3.addLast("Thangam");
        System.out.println(list3);
    }
}
