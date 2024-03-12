import java.util.Scanner;
import java.util.ArrayList;


public class Shopping {
    public static void main(String[] args) {


        System.out.println("Вас приветствует список покупок!");
        Scanner scanner = new Scanner(System.in);
        String[] shoppingList = new String[8];
        for (int i = 0; i < shoppingList.length; i++) {
            shoppingList[i] = ""; //заполняю массив пустотой
        }
        int productCount = 0;



       loop: while(true){

            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();
            boolean productIsExist = false; //переменная для отслеживания существования продукта в списке

            switch(actionNumber) {

                case 1:
                    System.out.println("Добавить товар в список");
                    System.out.println("Введите название товара: ");
                    String productName = scanner.next();

                    if (productCount < shoppingList.length) {

                        for (int i = 0; i < shoppingList.length; i++) {

                            if(shoppingList[i].equals(productName)){ //сравниваю вводимое имя с именем в списке (если есть)
                                productIsExist = true; //существует
                            }

                        }

                            if (!productIsExist) { //если нету такого, то добавляю в список
                                shoppingList[productCount] = productName;
                                productCount++;
                                System.out.println("Товар " + productName + " успешно добавлен в список под номером " + productCount);
                            } else {
                                System.out.println("Такой товар уже есть в списке");
                            }


                    } else {
                        System.out.println("Отложите покупку до следующего раза.");
                    }

                    for (int i = 0; i < shoppingList.length; i++) {

                        if(shoppingList[i] != "") {//ищу НЕ пустой элемент массива

                            System.out.println((i + 1) + ". " + shoppingList[i]);
                        }
                    }

                    break;

                case 2:
                    System.out.println("Показать список:");
                    for (int i = 0; i < shoppingList.length; i++) {
                        if(shoppingList[i] != "") {
                            System.out.println((i + 1) + ". " + shoppingList[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Очистить список");
                    for (int i = 0; i < shoppingList.length; i++) {
                        shoppingList[i] = "";
                    }
                    productCount = 0;
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
