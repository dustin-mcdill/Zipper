package zipper;

import java.util.ArrayList;
import java.util.List;

public class Zipper<T> {
    private final List<T> list1;
    private final List<T> list2;

    public Zipper(List<T> list1, List<T> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public List<T> zip() {
        List<T> result = new ArrayList<>();
        int maxLength = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) result.add(list1.get(i));
            if (i < list2.size()) result.add(list2.get(i));
        }

        return result;
    }
}
