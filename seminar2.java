

import java.util.Scanner;

// Task_1
// Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.
// Sample Input:
// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:
// 0
// 14

// public class seminar2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input array:   ");
//         String userStr = sc.nextLine();
//         System.out.println("Input number:   ");
//         String userNum = sc.nextLine();
//         userStr = userStr.replace(" ", "");
//         System.out.println("first index userNum = " + userStr.indexOf(userNum));
//         System.out.println("last index userNum = " + userStr.lastIndexOf(userNum));
//     }
// }

// Task_2
// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова,
// которые написаны в газете.
// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
// Sample Input:
// а
// в
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output:
// 7
// 5



// public class seminar2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter letter Маша:  ");
//         String mLetter = sc.nextLine();
//         System.out.println("enter letter Олег:  ");
//         String oLetter = sc.nextLine();
//         System.out.println("enter string words:  ");
//         String strWords = sc.nextLine();
//         String[] arrWords = strWords.split(" ");
//         int countM = 0;
//         int countO = 0;
//         for (int i = 0; i < arrWords.length; i++) {
//             if (arrWords[i].indexOf(mLetter) != -1) {
//                 countM++;
//             }
//             if (arrWords[i].indexOf(oLetter) != -1) {
//                 countO++;
//             }
//         }
//         System.out.println(countM);
//         System.out.println(countO);
//     }
// }

// Task_3
//Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. В следующих трех строках показаны три правильных IP-адреса:
//127.0.0.0
//192.168.0.01
//255.00.255.255
//Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
//Входные данные
//На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
//Выходные данные
//Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.
//Примечание:
//У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:
//String s = ".";
//просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки, содержащей точку используйте экранирование.
//String s = ".";
//Sample Input 1:
//192.168.1.2
//Sample Output 1:
//YES
//Sample Input 2:
//192.11.690.0
//Sample Output 2:
//NO
//Sample Input 3:
//67.67.67
//Sample Output 3:
//NO

// public class seminar2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter IP: ");
//         String userStr = sc.nextLine();
//         String s = "\\.";
//         String[] ipNum = userStr.split(s);
//         boolean res = true;
//         if (ipNum.length != 4) {
//             System.out.println("NOOOOOO");
//             System.out.println(ipNum.length);
//             res = false;
//         } else {
//             for (int i = 0; i < ipNum.length; i++) {
//                 int num = Integer.parseInt(ipNum[i]);
//                 if (num >= 0 && num <= 255) {

//                 } else {
//                     res = false;
//                     break;
//                 }
//             }
//         }
//         if (res == true) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }

// 

// Task_4
// Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите, сколько раз в тексте
// встречается введённый символ в любом регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.
// Sample Input:
// Good morning my dear friend. My fish.
// m
// Sample Output:
// 3


// public class seminar2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter text:  ");
//         String userText = sc.nextLine().toLowerCase();
//         System.out.println("enter char:  ");
//         String userChr = sc.nextLine().toLowerCase();
//         String[] textArr = userText.split("");
//         int count = 0;
//         for (int i = 0; i < textArr.length; i++) {
//             if (textArr[i].equals(userChr)) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// Task_5
// Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы,
// например. не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе
// выведите "Letter". Если же их равное количество, то выведите слово "Equal".
// Sample Input:
// 34Hi56
// Sample Output:
// Digit



// public class seminar2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input text: ");
//         String userText = sc.nextLine();
//         int countDig = 0;
//         int countLet = 0;

//         char[] textArr = userText.toCharArray();
//         for (int i = 0; i < textArr.length; i++) {
//             if (Character.isDigit(textArr[i])) {
//                 countDig++;
//             } else if (Character.isLetter(textArr[i])) {
//                 countLet++;
//             }
//         }

//         if (countDig > countLet) {
//             System.out.println("Digit " + countDig);
//         } else {
//             System.out.println("Letter " + countLet);
//         }
//     }
// }