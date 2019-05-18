package ExceptionHandling;
import java.nio.*;
import java.util.*;

public class CompactMethod {
    public static void main(String[] args) {

        int capacity = 10;
        CharBuffer ic = CharBuffer.allocate(capacity);
        ic.put('a');
        ic.put('b');
        ic.put('c');
        System.out.println("Original CharBuffer: " + Arrays.toString(ic.array()));
        CharBuffer CharBuffer = ic.compact();
        System.out.println("\nCompacted CharBuffer: " + Arrays.toString(CharBuffer.array()));
        CharBuffer.put('g');
        System.out.println("\nUpdated Compacted CharBuffer: " + Arrays.toString(CharBuffer.array()));

    }
}
