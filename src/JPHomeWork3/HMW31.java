package JPHomeWork3;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class HMW31 {

    //Метод поиска уникальных элементов в списке, без подсчета количества
    //Я почему-то сначало подумал,что надо вывести количество уникальных элементов в маасиве
    private static Set<String> CheckUniElements(List<String> ArrList){

        final Set<String> ArrUnique = new HashSet<>();
        final Set<String>Uni = new HashSet<>();

        for (String StrWord : ArrList){
            if (Uni.add(StrWord)){
                ArrUnique.add(StrWord);
            }
        }
        return ArrUnique;
    }

    // Но сокурсники меня убедили, что надо вывести сколько раз встречается слово в массиве и я все переделал
    // Метод поиска уникальных элементов в списке, с подсчетом сколько раз элемент встречается в массиве
    private static Map<String,Integer> CheckUniElements2(List<String> ArrList){
        Map<String,Integer> ArrUnique = new HashMap<>();
        for (String StrWord : ArrList){
            if (!ArrUnique.containsKey(StrWord)){
                ArrUnique.put(StrWord,0);
            }
            ArrUnique.put(StrWord,ArrUnique.get(StrWord)+1);
        }
        return ArrUnique;
    }


    public static void main(String[] args){

        ArrayList<String> Words = new ArrayList<>();

        Words.add("Время");
        Words.add("Ночь");
        Words.add("Солнце");
        Words.add("Волк");
        Words.add("Время");
        Words.add("Огонь");
        Words.add("Капля");
        Words.add("Память");
        Words.add("Огонь");
        Words.add("Время");
        Words.add("Время");
        Words.add("Ночь");
        Words.add("Солнце");
        Words.add("Волк");
        Words.add("Время");
        Words.add("Огонь");
        Words.add("Капля");
        Words.add("Память");
        Words.add("Огонь");
        Words.add("Время");
        Words.add("Колбаса");
        Words.add("Гол");

        Map<String,Integer> ArrUniq = CheckUniElements2(Words);
        System.out.println("Количество элементов в массиве " + Words.size());
        System.out.println(Words);
//Вывод слов с количеством повторений
        System.out.println("Список слов в массиве, с количеством их повторений ");
        for (Map.Entry<String,Integer> uni : ArrUniq.entrySet()){
            int Nm = uni.getValue();
            String Ky = uni.getKey();
            System.out.println(Ky + " - " + Nm);
        }

        System.out.println("**************************************************************");
        System.out.println("Список уникальных слов в массиве:");
//Вывод уникальных слов
        for (Map.Entry<String,Integer> uni : ArrUniq.entrySet()){
            int Nm = uni.getValue();
            if (Nm == 1){
                System.out.println("" + uni.getKey());
            }
        }
    }
}
