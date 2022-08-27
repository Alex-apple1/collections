package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class MedianQueue extends LinkedList<Integer> {
    private static final long serialVersionUID = 1L;

    private static final Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public
        int compare(Integer a, Integer b) {
            return a - b;
        }
    };

    private int getMedianIndex() {
        int m = size() / 2;

        if (size() % 2 == 0) {
            return get(m) < get(m - 1) ? m : m - 1;
        }
        return m;
    }

    @Override
    public boolean offer(Integer e) {
        return add(e);
    }

    @Override
    public Integer poll() {
        return size() > 0 ? remove(getMedianIndex()) : null;
    }

    @Override
    public Integer peek() {
        sort(comparator);
        return size() > 0 ? get(getMedianIndex()) : null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return super.iterator();
    }

    @Override
    public int size() {
        return super.size();
    }

}
