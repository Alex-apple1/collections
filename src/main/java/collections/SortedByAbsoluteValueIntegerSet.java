package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedByAbsoluteValueIntegerSet extends TreeSet<Integer> {
    private static final long serialVersionUID = 1L;

    public SortedByAbsoluteValueIntegerSet() {

        super(new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Math.abs(a) - Math.abs(b);
            }
        });
    }
}
