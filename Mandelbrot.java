import java.util.Arrays;

public class Mandelbrot {
    static int maxIter = 100;
    static int numRows = 50;
    static double[] bounds = {-2, 2};

    public static void main(String[] args) {
        var result = new int[numRows][numRows];

        for (int j = 0; j < numRows; ++j) {
            for (int i = 0; i < numRows; ++i) {
                var z = new ComplexNumber(indexToCoordinate(i), indexToCoordinate(j));
                var numIter = calcEscapeIter(z);

                result[j][i] = numIter;
            }
        }

        for (var row: result){
            var line = Arrays.toString(row);
            System.out.println(line);
        }
    }

    static double indexToCoordinate(int i) {
        return bounds[0] + ((double) i / numRows) * (bounds[1] - bounds[0]);
    }

    static int calcEscapeIter(ComplexNumber c) {
        int n = 0;
        var z = new ComplexNumber(0, 0);
        for (; n < maxIter; n += 1) {
            if (Math.pow(z.abs(), 2.0) > 2.0){
                break;
            }
            z = ComplexNumber.add(ComplexNumber.mul(z, z), c);
            n += 1;
        }

        return n;
    }
}


class ComplexNumber {
    double x;
    double y;

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static ComplexNumber add(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.x + z2.x, z1.y + z2.y);
    }

    public double abs() {
        return Math.pow(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0), 0.5);
    }

    public static ComplexNumber mul(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.x * z2.x - z1.y * z2.y, z1.x * z2.y + z1.y * z2.x);
    }
}
