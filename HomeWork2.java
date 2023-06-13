
// Задание 1. Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

// import java.util.Scanner;

// public class HomeWork2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input the jewels: ");
//         String jewels = sc.nextLine();
//         System.out.print("Input the stones: ");
//         String stones = sc.nextLine();
//         int count = 0;
//         for (int i = 0; i < stones.length(); i++) {
//             if (jewels.indexOf(stones.charAt(i)) != -1) {
//                 count++;
//             }
//         }

//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < jewels.length(); i++) {
//             int jewelCount = 0;
//             for (int j = 0; j < stones.length(); j++) {
//                 if (jewels.charAt(i) == stones.charAt(j)) {
//                     jewelCount++;
//                 }
//             }
//             if (jewelCount > 0) {
//                 result.append(jewels.charAt(i)).append(jewelCount);
//             }
//         }

//         System.out.println(result.toString());
//     }
// }

// Задание 2. Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [2,1,0] result “abc”

// import java.util.Scanner;

// public class HomeWork2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Input string S: ");
//         String s = scanner.nextLine();
//         System.out.println("Input array Index: ");
//         String[] indexString = scanner.nextLine().split(" ");
//         int[] index = new int[indexString.length];
//         for (int i = 0; i < indexString.length; i++) {
//             index[i] = Integer.parseInt(indexString[i]);
//         }
//         char[] result = new char[s.length()];
//         for (int i = 0; i < s.length(); i++) {
//             result[index[i]] = s.charAt(i);
//         }
//         System.out.println("Result: " + new String(result));
//     }
// }

// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
// потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк -
// вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который
// следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными
// буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание.
// ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:
// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.


// import java.util.Scanner;

// public class HomeWork2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input n-rows value: ");
//         int n = scanner.nextInt();
//         System.out.println("Input recipe from book: ");
//         scanner.nextLine();
//         String[] book = new String[n];
//         for (int i = 0; i < n; i++) {
//             book[i] = scanner.nextLine();
//         }
//         System.out.print("Input m-rows product value: ");
//         int m = scanner.nextInt();
//         System.out.println("Input your product (allergyProduct - replacementProduct): ");
//         scanner.nextLine();
//         String[] allergies = new String[m];
//         String[] replacements = new String[m];
//         for (int i = 0; i < m; i++) {
//             String[] line = scanner.nextLine().split(" - ");
//             allergies[i] = line[0];
//             replacements[i] = line[1];
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 book[i] = book[i].replaceAll(allergies[j], replacements[j]);
//                 book[i] = book[i].replaceAll(capitalize(allergies[j]), capitalize(replacements[j]));
//             }
//             System.out.println(book[i]);
//         }
//     }

//     private static String capitalize(String s) {
//         return s.substring(0, 1).toUpperCase() + s.substring(1);
//         }
// }