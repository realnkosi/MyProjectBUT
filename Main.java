public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!\nThis in Nkosiyapha's Java Program");

        String[] fruits = { "Mango", "Banana", "Orange", "Apple", "Grapes", "Pineapple" };

        // add sorting logic here, quick sort algorithm
        quickSort(fruits, 0, fruits.length - 1);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}