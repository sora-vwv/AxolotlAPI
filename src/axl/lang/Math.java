package axl.lang;

public final class Math {

    public int randomRange(int min, int max) {
        return (int) ((java.lang.Math.random() * (max - min)) + min);
    }

    public double pi() {
        return java.lang.Math.PI;
    }

    public double exp(double value) {
        return java.lang.Math.exp(value);
    }

    public long abs(long value) { return java.lang.Math.abs(value); }

    public float abs(float value) {
        return java.lang.Math.abs(value);
    }

    public int abs(int value) {
        return java.lang.Math.abs(value);
    }

    public double abs(double value) { return java.lang.Math.abs(value); }

}
