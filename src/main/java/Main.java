import stream_api.Director;
import stream_api.Predicate;
import stream_api.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* Director director = new Director();
        Worker worker = i -> "Success " + i;
        String string = director.doWork(worker,6);
        System.out.println(string);*/

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = filter(integers, a -> a % 2 == 0);
        for (int numbers :
                filtered) {
            System.out.println(numbers);
        }
    }

    public static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.predicate(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
