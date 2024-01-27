import java.util.Scanner;
public class Problem09 {

    public static void main(String[] args) {
        String[] painters = {"Da Vinci", "Monet", "Van Gogh", "Rembrandt", "Picasso", "Raphael", "Michelangelo"};
        display(painters);

        Scanner input = new Scanner(System.in);
        String name, choice;

        do {
            System.out.println("Enter \"add\" to add painter, \"delete\" to delete an existing painter, or \"*\" to EXIT: ");
            choice = input.nextLine().trim();
            switch (choice) {
                case "delete":
                    System.out.println("Enter painter's name: ");
                    String deleteName = input.nextLine().trim();
                    int isThere = binarySearch(painters, deleteName);
                    if (isThere == -1) {
                        System.out.println("There is no such painter in the list.");
                    } else {
                        painters = removeNameFromArray(painters, deleteName);
                        display(painters);
                    }
                    break;
                case "add":
                    System.out.printf("\nEnter painter's name or enter\n(Populated Array: %s)\n", String.join(", ", painters));
                    name = input.nextLine().trim();

                    if (!name.equals("*")) {
                        int index = binarySearch(painters, name);
                        if (index != -1) {
                            System.out.println("Painter is already in the list.");
                            display(painters);
                        } else {
                            painters = addNameToArray(painters, name);
                            painters = bubbleSort(painters);
                            display(painters);
                        }
                    }
                    break;
                case "*":
                    break;
            }
        } while (!choice.equals("*"));
    }

    public static void display(String[] painters) {
        System.out.println("\nCurrent array content: ");
        for (String painter : painters) {
            System.out.print(painter + ", ");
        }
        System.out.println();
    }

    public static int binarySearch(String[] painters, String name) {
        int left = 0;
        int right = painters.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            int cmp = name.compareTo(painters[mid]);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static String[] addNameToArray(String[] painters, String name) {
        String[] newPainters = new String[painters.length + 1];
        for (int i = 0; i < painters.length; i++) {
            newPainters[i] = painters[i];
        }
        newPainters[newPainters.length - 1] = name;
        return newPainters;
    }

    public static String[] removeNameFromArray(String[] painters, String name) {
        String[] newPainters = new String[painters.length - 1];
        int j = 0;
        for (int i = 0; i < painters.length; i++) {
            if (!painters[i].equals(name)) {
                newPainters[j++] = painters[i];
            }
        }
        return newPainters;
    }

    public static String[] bubbleSort(String[] painters) {
        String temp;
        for (int i = 0; i < painters.length; i++) {
            for (int j = 1; j < (painters.length - i); j++) {
                if (painters[j - 1].compareTo(painters[j]) > 0) {
                    temp = painters[j - 1];
                    painters[j - 1] = painters[j];
                    painters[j] = temp;
                }
            }
        }
        return painters;
    }
}
