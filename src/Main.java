import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(10,44,7,6,12,89);
        int theshold = 33;
        List<Integer>result = filterNumberGreaterThen(numbers,theshold);
        System.out.println(result);//вывод 44,89

    }

    private static List<Integer> filterNumberGreaterThen(
            List<Integer> numbers, int theshold) {
        List<Integer>filteredList = new ArrayList<>();/*новый список для храниения больших чисел,//
        */
        for (Integer number : numbers){
            if (number>theshold){
                filteredList.add(number);

            }
        }
        return filteredList;
    }




}