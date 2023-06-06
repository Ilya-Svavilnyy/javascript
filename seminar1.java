// public class as {

// public static void Main(String[] args) {
//     // Написать программу, которая запросит пользователя ввести "Имя" в консоли
//     // Получит введенную строку и выведет в консоль сообщение "Привет, "Имя! ""}

//     Scanner sc = new Scanner(System.in, charsetName:"cp866");
//     System.out.print(s:"Введите имя пользователя: ");
//     String name = sc.nextLine();
//     System.out.println("Привет, " + name);
// }

// }


//Задание. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество продряд идущих 1.

// public class seminar1 {
//     public static void main(String[] args) {
//         int[] binaryArray = {1, 1, 0, 1, 1, 1}; // создали массив двоичных чисел
//         int currentLength = 0; // обьявление и инициализация текущей длинны
//         int maxLength = 0; // инициализация и обьявление максимального количества идущих подряд 1
//         for (int i = 0; i < binaryArray.length; i++) {
//             if (binaryArray[i] == 1) {
//                 currentLength++;
//             } else {
//                 if (currentLength > maxLength) {
//                     maxLength = currentLength;
//                 } 
//                 currentLength = 0;
//             }
//         }
//         if(currentLength > maxLength) {
//             maxLength = currentLength;
//         }
//         System.out.println(maxLength);
//     }

// }

// Дан массив нумс = [3,2,4,3,1,5,3,3] и число val = 3
// Если в массиве есть числа равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом перве нескольуко строк (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

// public class seminar1 {
//     public static void main(String[] args) {
// int[] nums = new int [] {3, 3, 2, 4, 3, 1, 5, 3, 1, 5, 3, 3};
// int val = 3;
// int index = 0;
// int count = 0;

// for (int i = 0; i < nums.length; i++ ) {
//     if(nums[i] == val) {
//         count++;
//     }
// }

// for (int j = 0; j <= count; j++) {
//     for(int i = 0; i < nums.length; i++) {
//         if(nums[i] == val) {
//             index = i;
//         } else if (index != -1) {
//             int temp = nums[i];
//             nums[i] = nums[index];
//             nums[index] = temp;
//             index = i;
//         }
//     }
//     index = -1;
// }

// for(int i = 0; i < nums.length; i++) {
//     System.out.print(nums[i] + " ");
// }
//     }
// }