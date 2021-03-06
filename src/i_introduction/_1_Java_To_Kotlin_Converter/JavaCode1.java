package i_introduction._1_Java_To_Kotlin_Converter;

import java.util.Collection;
import java.util.Iterator;

import util.JavaCode;

public class JavaCode1 extends JavaCode {
    public String task1(Collection<Integer> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sb.append(element);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}