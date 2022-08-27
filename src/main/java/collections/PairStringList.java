package collections;

import java.util.*;

public class PairStringList extends AbstractList<String> implements Iterable<String> {
    private List<String> list = new ArrayList<>();

    @Override
    public boolean add(String value) {
        list.add(value);
        list.add(value);
        return true; }

    @Override
    public void add(int index, String value) {
        int addIndex = index % 2 == 0 ? index : index + 1;
        list.add(addIndex, value);
        list.add(addIndex, value);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o) && list.remove(o);
    }

    @Override
    public String remove(int index) {
        int rmIndex = index % 2 == 0 ? index : index - 1;
        list.remove(rmIndex);
        return list.remove(rmIndex);
    }

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public String set(int index, String value) {
        int setIndex = index % 2 == 0 ? index : index - 1;
        list.set(setIndex, value);
        return list.set(setIndex + 1, value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(int index, Collection<? extends String> data) {
        List<String> listData = (List<String>) data;
        for (int i = 0, j = index; i < data.size(); i++, j += 2) {
            add(j, listData.get(i));
        }
        return true;
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }
}
