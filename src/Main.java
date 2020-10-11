import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());
//, как бы вы вычислили среднее значение. Вам нужно разделить сумму на количество элементов.
// Проблема в том, что потоки допускают только один проход. Java признает,
// что вычисление среднего значения является обычным делом, и предоставляет метод для вычисления среднего
// по потоковым классам для примитивов:
//
//IntStream intStream = IntStream.of(1, 2, 3);
//OptionalDouble avg = intStream.average();
//System.out.println(avg.getAsDouble());
    }
}
