public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        System.out.println(list1.is_empty());
        list1.set_first(2);
        list1.set_first(1);
        list1.set_first(0);
        System.out.println(list1.getHead());

    }
}
