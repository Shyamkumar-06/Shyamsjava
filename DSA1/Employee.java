import java.util.Scanner;

class Employee {
    int choice;
    static Scanner sc = new Scanner(System.in);
    int[] arr;
    int index = 0; 

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Enter the maximum capacity of the company:");
        int length = sc.nextInt();
        emp.arr = new int[length]; 
        emp.menu();
    }

    void menu() {
        do {
            System.out.println("\n************ MAIN MENU ************");
            System.out.println("1. Add Employee ID");
            System.out.println("2. Remove Employee ID");
            System.out.println("3. Display Employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmp();
                    break;
                case 2:
                    removeEmp();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Enter a valid choice.");
            }
        } while (choice != 4);
    }

    void addEmp() {
        if (index < arr.length) {
            System.out.print("Enter employee ID: ");
            arr[index] = sc.nextInt();
            index++; 
            System.out.println("Employee ID added.");
        } else {
            System.out.println("Error: System at maximum capacity.");
        }
    }

    void removeEmp() {
        System.out.print("Enter employee ID to remove: ");
        int toRemove = sc.nextInt();
        int foundAt = -1;

        
        for (int i = 0; i < index; i++) {
            if (arr[i] == toRemove) {
                foundAt = i;
                break;
            }
        }

        
        if (foundAt != -1) {
            for (int i = foundAt; i < index - 1; i++) {
                arr[i] = arr[i + 1];
            }
            index--; 
            System.out.println("Employee ID removed.");
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    void display() {
        if (index == 0) {
            System.out.println("No employees in the list.");
        } else {
            System.out.println("\nEmployee IDs:");
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}