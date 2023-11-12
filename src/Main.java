import java.util.Scanner;

public class Main {
    public static void menu(){

        System.out.println("1. Додати учасника клубу");
        System.out.println("2. Додати тваринку до учасника клубу");
        System.out.println("3. Видалити тваринку з учасника клубу");
        System.out.println("4. Видалити учасника з клубу");
        System.out.println("5. Видалити конкретну тваринку зі всіх власників");
        System.out.println("6. Вивести на екран зооклуб");
        System.out.println("7. Вийти з програми");

    }

    public static void main(String[] args) {
        menu();
        Scanner scanner = new Scanner(System.in);
        Zooclub zooclub = new Zooclub();

        while (true){
            System.out.println("Оберіть дію яку бажаєте зробити");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Введіть ім'я учасника");
                    String name = scanner.next();
                    System.out.println("Введіть вік учасника");
                    int age = scanner.nextInt();
                    zooclub.addPerson(name,age);

                    break;
                }
                case 2:{

                    System.out.println("Введіть ім'я учасника до якого бажаєте добавити тваринку");
                    String personName = scanner.next();
                    System.out.println("Ведіть ім'я тваринки");
                    String name = scanner.next();
                    System.out.println("Введіть рік тваринки");
                    int age = scanner.nextInt();

                    zooclub.addPet(personName,name,age);

                    break;
                }
                case 3:{

                    System.out.println("Введіть ім'я учасника");
                    String personName = scanner.next();
                    System.out.println("Введіть ім'я тваринки");
                    String petName = scanner.next();

                    zooclub.deletePet(personName, petName);

                    break;
                }
                case 4:{

                    System.out.println("Введіть ім'я учасника якого хочете видалити");
                    String name = scanner.next();
                    zooclub.deletePerson(name);

                    break;
                }
                case 5:{

                    System.out.println("ведіть ім'я тваринки");
                    String name = scanner.next();
                    zooclub.deleteSpecificallyPet(name);

                    break;
                }
                case 6:{

                    zooclub.outputAll();

                    break;
                }
                case 7:{
                    System.exit(0);
                    break;
                }
            }
            scanner.close();
        }

    }
}