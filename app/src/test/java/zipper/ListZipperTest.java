package zipper;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListZipperTest {

    @Test
    void testZipWithEqualSizeLists() {
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6);
        Zipper<Integer> zipper = new Zipper<>(list1, list2);
        List<Integer> result = zipper.zip();
        assertEquals(List.of(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    void testZipWithFirstListLonger() {
        List<String> list1 = List.of("A", "B", "C", "D");
        List<String> list2 = List.of("1", "2");
        Zipper<String> zipper = new Zipper<>(list1, list2);
        List<String> result = zipper.zip();
        assertEquals(List.of("A", "1", "B", "2", "C", "D"), result);
    }

    @Test
    void testZipWithSecondListLonger() {
        List<String> list1 = List.of("X", "Y");
        List<String> list2 = List.of("10", "20", "30", "40");
        Zipper<String> zipper = new Zipper<>(list1, list2);
        List<String> result = zipper.zip();
        assertEquals(List.of("X", "10", "Y", "20", "30", "40"), result);
    }

    @Test
    void testZipWithEmptyLists() {
        Zipper<Object> zipper = new Zipper<>(List.of(), List.of());
        List<Object> result = zipper.zip();
        assertTrue(result.isEmpty());
    }

    @Test
    void testZipWithDifferentTypes() {
        List<Double> list1 = List.of(1.1, 2.2);
        List<Double> list2 = List.of(3.3);
        Zipper<Double> zipper = new Zipper<>(list1, list2);
        List<Double> result = zipper.zip();
        assertEquals(List.of(1.1, 3.3, 2.2), result);
    }
}
