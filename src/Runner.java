/** Реализовать очередь на почту
 *@version  1.0 05 ноября 2018
 * @author  Natasha Yatcenya
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class Runner {
    public static void main(String[] args) {
        Comparator<People> comparator = new AgeComparator();
        PriorityQueue<People> peopleQueue = new PriorityQueue<>(10, comparator);
        peopleQueue.add(new People("Иванов", 64));
        peopleQueue.add(new People("Петров", 23));
        peopleQueue.add(new People("Сидоров", 34));
        peopleQueue.add(new People("Рыбкин", 59));
        while (!peopleQueue.isEmpty()) {
            System.out.println(peopleQueue.remove().getName());
        }
    }
}

