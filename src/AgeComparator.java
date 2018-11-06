/**
 *@version  1.0 05 ноября 2018
 * @author  Natasha Yatcenya
 */
import java.util.Comparator;
public class AgeComparator implements Comparator<People> {
    @Override
    public int compare(final People o1, final People o2) {
        if ((o1.getAge() > 63) || (o2.getAge() > 63)) {
            if (o1.getAge() > o2.getAge()) {
                return -1;
            } else if (o1.getAge() < o2.getAge()) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
