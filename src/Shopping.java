import java.util.Scanner;
import java.util.ArrayList;


public class Shopping {
    public static void main(String[] args) {


        System.out.println("Вас приветствует список покупок!");
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> shoppingList = new ArrayList<>(); //создаю динамический массив arrayList
        int productCount = 0;



       loop: while(true){

            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();
            //boolean productIsExist = false; //переменная для отслеживания существования продукта в списке


            switch(actionNumber) {

                case 1:
                    System.out.println("Добавить товар в список");
                    System.out.println("Введите название товара: ");
                    String productName = scanner.next();
                    boolean isExistProduct = shoppingList.contains(productName); //ищу схожий элемент в массиве

                    if (isExistProduct){ //если элемент такой же вывожу на экран и не добавляю его
                        System.out.println("Такой находится уже");
                    } else {

                        shoppingList.add(productName); //добавляю согласно имени
                        productCount++; //увеличиваю счётчик товаров

                    }

                    for (int i = 0; i < shoppingList.size(); i++) {

                        System.out.println((i + 1) + ". " + shoppingList.get(i));

                    }

                    break;

                case 2:
                    System.out.println("В вашем списке находится: " + productCount + " товаров");

                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println((i + 1) + ". " + shoppingList.get(i));

                    }

                    break;

                case 3:
                    System.out.println("Очистить список");
                    for (int i = 0; i < shoppingList.size(); i++) {

                        shoppingList.remove(i);
                        productCount = 0;
                        i--;

                    }
                    System.out.println("Вы очистили список!");
                    break;

                case 4:
                    System.out.println("Завершить работу");
                    break loop;

                default:
                    System.out.println("Неизвестная команда");
                    break;

            }

        }

    }
}
