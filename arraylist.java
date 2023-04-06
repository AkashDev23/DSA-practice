import java.util.ArrayList;

class arraylist {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("size of arraylist " + list.size());
        list.add("A");
        list.add("K");
        list.add("A");
        list.add("S");
        list.add("H");
        list.add(5, "G");
        System.out.println(list);
        list.remove("H");
        System.out.println("Size of list after deletion "+list.size());
    }
}