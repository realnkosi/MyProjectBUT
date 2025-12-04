public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!\nThis in Nkosiyapha's Java Program");

        String[] fruits = { "Mango", "Banana", "Orange", "Apple", "Grapes" };

        // add sorting logic here
        java.util.Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}