

   package com.company;

    public class Main {

        public static void main(String[] args) {
            double[] drobNumbers = {
                    -5.5, -55.8, -8.3, 27.2, 6.9, 48.7, 56.3, -9.2, -95.4, -65.9, 48.8, 57.4, 35.1, 31.2, 13.6};
            double ok = 0;
            int br = 0;
            boolean nor = false;
            for (double nihgbers : drobNumbers) {
                if (nihgbers < 0) {
                    nor = true;
                } else if (nor) {
                    br++;
                    ok += nihgbers;

                }

            }
            System.out.println(ok / br);
        }
    }


