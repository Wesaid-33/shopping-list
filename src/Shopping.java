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


            switch(actionNumber) {

                case 1:
                    System.out.println("Введите название товара: ");
                    String productName = scanner.next();
                    boolean isExistProduct = shoppingList.contains(productName); //ищу схожий элемент в массиве

                    if (isExistProduct){ //если элемент такой же вывожу на экран и не добавляю его
                        System.out.println("Такой товар находится уже списке");
                    } else {

                        shoppingList.add(productName); //добавляю согласно имени
                        productCount++; //увеличиваю счётчик товаров
                        System.out.println("Товар " + productName + " успешно добавлен!");
                    }

                    break;

                case 2:
                    System.out.println("В вашем списке находится: " + productCount + " товаров");

                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println((i + 1) + ". " + shoppingList.get(i));

                    }

                    break;

                case 3:
                   shoppingList.clear();
                   productCount = 0;
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
