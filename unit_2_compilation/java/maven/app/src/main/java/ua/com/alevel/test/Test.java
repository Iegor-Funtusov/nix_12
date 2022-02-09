package ua.com.alevel.test;

import org.apache.commons.lang3.*;
import org.apache.commons.math3.stat.descriptive.*;

public class Test {

    public void run() {
        System.out.println("Hello World!");
        System.out.println(StringUtils.upperCase("Hello World!"));

        double[] values = new double[] {65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }

        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();
        System.out.println("standardDeviation = " + standardDeviation);
    }
}