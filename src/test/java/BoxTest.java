import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void testBox() {
        List<Integer> number1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number1.add(i);
        }
        List<Number> numbers2 = new ArrayList<>();
//        List<Number> numbers3 = new ArrayList<>();
        Box.transfer(number1, numbers2);
        assertEquals(0, number1.size());
        assertEquals(10, numbers2.size());


//        Box<Integer> box1 = new Box<>(5, 10, 15);
//        Box<Integer> box2 = new Box<>();
//
//        Box.transfer(numbersSrc, numbersDest);

//        Box<Integer> box1 = new Box<>(5, 10, 15);
//        Box<Float> box2 = new Box<>(5f, 10f, 15f);
//        assertEquals(10.0, box1.average(), 0.001);
//        assertEquals(0, box1.compare(box2));

//        Box<Integer> box1 = new Box<>(20);
//        Box<Integer> box2 = new Box<>(10);
//        box2.setObject("fjdka"); // error
//        int n1 = 0;
//        int n2 = 0;
//        // Также не нужно делать явно преобразование типов
//        n1 = box1.getObject();
//        n2 = box2.getObject();
//
//         Теперь данную проверку можно не делать, т.к уже точно знаем, что класс принадлежит Integer
//        if (box1.getObject() instanceof Integer) {
//            n1 = (int) box1.getObject();
//        }
//
//        if (box2.getObject() instanceof Integer) {
//            n2 = (int) box2.getObject();
//        }
//        int expected = 30;
//        int result = box1.getObject() + box2.getObject();
//        assertEquals(expected, result);

//        Box<String, Integer, Float> box1 = new Box<>("string", 2, 3.5f);
//        Box<String, Integer, Float> box2 = new Box<>("string", 5, 6.5f);
//        float result1 = box1.getValue() + box1.getFloatValue() + box2.getValue() + box2.getFloatValue();
//        int result2 = (int) (box1.getValue() + box1.getFloatValue() + box2.getValue() + box2.getFloatValue());
//
//        assertEquals(17, result1);
//        assertEquals(17, result2);
    }

}