import java.util.*;

public class Main {
    public static void main(String[] args) {
//        // Задание 1 Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
//        // Код должен работать с любой последовательностью и объемом списка чисел.
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        boolean first = true;
        for (Integer number : nums) {
            if (number % 2 != 0) {
                if (first) {
                    System.out.print(number);
                    first = false;
                } else {
                    System.out.print("," + number);


                }

            }
        }
            System.out.println();
//        if(number%!=2){ // получить значение элемента по индексу и потом поделить его
//            System.out.println(); // и если он  не делится без остатка то вывести его
//        }
            //Задание 2
            //Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
            //Код должен работать с любой последовательностью и объемом списка чисел.
            Set<Integer> nums2 = new HashSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            first=true;
            for (Integer number2 : nums2) {
                if (number2 % 2 == 0 ) {
                    if(first){
                        System.out.print(number2);
                        first=false;
                    } else{
                    System.out.print(  ","+number2 );
                }
                }
            }
            System.out.println();
//      Задание 3
//      Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
//      В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
            Set<String> words = new HashSet<>(List.of("перец", "огурец", "помидор", "перец", "салат", "соль", "майонез", "хлеб", "перец", "масло"));
            first=true;
        for (String word : words) {
            if(first){
                System.out.print(word);
                first=false;
            } else{
                System.out.print("," + word);
            }

        }
        System.out.println();


//        Задание 4 Напишите код, который выводит в консоль все количество дублей из списка слов.
//        Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
//        В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.
//        В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
        List<String> words2 = new ArrayList<>(List.of("перец", "огурец", "помидор", "перец", "салат", "соль", "майонез", "соль", "перец", "масло", "масло", "соль", "хлеб", "хлеб"));
        words2.sort(Comparator.naturalOrder());
        int numbersWords=0;
        for (int i = 0; i < words2.size(); i++) {
            if(i!=words2.size()-1 && words2.get(i).equals(words2.get(i+1))){
                 numbersWords=numbersWords+1;
            } else{
                if(numbersWords!=0){
                    System.out.println(words2.get(i)+":" + (numbersWords+1));
                    numbersWords=0;
                }
            }
        }
    }
}
