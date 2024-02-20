package lab5;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList<double[]> children = new ArrayList<>();

        // your implementation:
        double a = random.nextDouble();
        children.add(makeChild(p1, p2, a));
        children.add(makeChild(p2, p1, a));
        return children;
    }

    private double[] makeChild(double[] p1, double[] p2, double a) {
        double[] child = new double[p1.length];
        for(int j=0; j < p1.length; j++) {
            child[j] = a*p1[j]+(1-a)*p2[j];
        }
        return child;
    }
}
