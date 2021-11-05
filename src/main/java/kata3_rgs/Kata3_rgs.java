/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3_rgs;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Kata3_rgs {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("alu.ulpgc.com");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
