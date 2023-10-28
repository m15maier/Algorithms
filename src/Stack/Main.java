package Stack;

public class Main {

    public static void main(String[] args) {

        SpecialStack stack = new SpecialStack();

        System.out.println("Пустой ли стек? " + stack.isEmpty());
        System.out.println(stack);
        System.out.println();

        stack.push(1);
        stack.push(5);
        stack.push(9);

        System.out.println("После добавления элементов");
        System.out.println(stack);
        System.out.println("Пустой ли стек? " + stack.isEmpty());
        System.out.println();

        String element = stack.pop();
        System.out.println("Извлечённый элемент " + element);
        System.out.println("После извлечения элемента: ");
        System.out.println(stack);

        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("Пустой ли стек? " + stack.isEmpty());


        System.out.println(stack);

        System.out.println(stack.getMin());
    }
}
