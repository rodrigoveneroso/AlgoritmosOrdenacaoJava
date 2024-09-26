import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Main loop to display the sorting algorithm menu
        while (true) {
            System.out.println("====================================");
            System.out.println("Escolha um algoritmo de ordenação:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Sair");
            System.out.println("====================================\n");

            // Get user's choice
            int choice = scanner.nextInt();

            // Execute the selected sorting algorithm
            switch (choice) {
                case 1:
                    System.out.println("\nBubble Sort:");
                    BubbleSort.main(new String[0]); // Calls the BubbleSort class
                    break;
                case 2:
                    System.out.println("\nInsertion Sort:");
                    InsertionSort.main(new String[0]); // Calls the InsertionSort class
                    break;
                case 3:
                    System.out.println("\nQuick Sort:");
                    QuickSort.main(new String[0]); // Calls the QuickSort class
                    break;
                case 4:
                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close(); // Close the scanner
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}
