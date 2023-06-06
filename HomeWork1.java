import java.util.Scanner;

// Задание 1: Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// public class HomeWork1 {
//     public static void main(String[] args){
//         Scanner ch = new Scanner(System.in);
//         System.out.println("Input number:  ");
//         int num = Integer.parseInt(ch.nextLine());
//         triangle_num(num);
//         System.out.println();
//         factorial(num);
//     }

//     static void triangle_num(int n) {
//         int tr_num = 0;
//         for (int i = 0; i <= n; i++) {
//             tr_num += i;
//         }
//         System.out.printf("%d triangular number: %d", n, tr_num);
//     }
//     static void factorial(int n) {
//         int f = 1;
//         for (int i = 2; i <= n; i++) {
//             f *= i;
//         }
//         System.out.printf("Factorial of a number %d: %d", n, f);
//     }
// }


// Задание 2: Вывести все простые числа от 1 до 1000

// import java.math.*;

// public class HomeWork1 {
//     public static void main(String[] args){
//         for (int i = 2; i < 1000; i++) {
//             boolean flag = true;
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag == true) System.out.printf("%d ", i);
//         }
//     }
// }




// Задание 3: Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - вычесть
// 3 - умножить
// 4 - разделить

// import java.util.Scanner;

// public class HomeWork1 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Введите первое число: ");
//         int num_1 = sc.nextInt();
//         System.out.print("Введите второе число: ");
//         int num_2 = sc.nextInt();
//         System.out.print("Введите оперцию(+,-,*,/): ");
//         String operation = sc.next();
//         char symbol = operation.charAt(0);
//         int value;
//         if (symbol == '+'){
//             value = num_1 + num_2;
//             System.out.println("Ответ: " + value);
//         }
//         else if (symbol == '-'){
//             value = num_1 - num_2;
//             System.out.println("Ответ: " + value);
//         }
//         else if (symbol == '*'){
//             value = num_1 * num_2;
//             System.out.println("Ответ: " + value);
//         }
//         else if (symbol == '/'){
//             value = num_1 / num_2;
//             System.out.println("Ответ: " + value);
//         }
//         else{
//             System.out.println("Неверная операция!");
//         }
//     }
// }