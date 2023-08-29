package axl.lang;

import java.math.BigDecimal;
import java.util.Scanner;

public final class Console {

    public void print(boolean value) {
        System.out.print(value);
    }

    public void print(char value) {
        System.out.print(value);
    }

    public void print(int value) {
        System.out.print(value);
    }

    public void print(long value) {
        System.out.print(value);
    }

    public void print(float value) {
        System.out.print(value);
    }

    public void print(double value) {
        System.out.print(value);
    }

    public void print(String value) {
        System.out.print(value);
    }

    public void print(Object value) {
        System.out.print(value);
    }

    public void println(boolean value) {
        System.out.print(value);
    }

    public void println(char value) {
        System.out.println(value);
    }

    public void println(int value) {
        System.out.println(value);
    }

    public void println(long value) {
        System.out.println(value);
    }

    public void println(float value) {
        System.out.println(value);
    }

    public void println(double value) {
        System.out.println(value);
    }

    public void println(String value) {
        System.out.println(value);
    }

    public void println(Object value) {
        System.out.println(value);
    }

    public void printf(String value, Object... args) {
        System.out.printf(value, args);
    }

    private Scanner scanner = new Scanner(System.in);

    public int readInt() {
        return scanner.nextInt();
    }

    public long readLong() {
        return scanner.nextLong();
    }

    public double readDouble() {
        return scanner.nextDouble();
    }

    public String readLine() {
        return scanner.nextLine();
    }

    // public BigDecimal readBigDecimal() {
    //     return scanner.nextBigDecimal();
    // }

}
