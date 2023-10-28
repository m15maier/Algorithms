package DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        System.out.println("is empty? " + array.isEmpty());
        System.out.println(array);

        array.add("A");
        array.add("B");
        array.add("C");

        System.out.println("is empty? " + array.isEmpty());
        System.out.println(array);


        array.add("D");
        array.add("E");
        array.add("F");
        array.add("G");
        array.add("H");
        array.add("I");
        array.add("J");

        System.out.println(array);

        array.remove();
        array.removeAt();
        array.set();
        array.clean();
    }
}
