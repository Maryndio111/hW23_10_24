import java.util.ArrayList;
import java.util.List;

public class IndexFinder {
    public static List<Integer>findIndices(List<Integer>number,int theshold){
        List<Integer>indices = new ArrayList<>();
        for (int i = 0; i <number.size(); i++) {
            if (number.get(i)>theshold) {
                indices.add(i);

            }
        }
        return indices;
    }
    public static void main(String[]args){
        List<Integer> numbers = List.of(10,44,7,6,12,89);
        int thershold = 33;
        List<Integer> result = findIndices(numbers,thershold);
        System.out.println(result);
    }
}
