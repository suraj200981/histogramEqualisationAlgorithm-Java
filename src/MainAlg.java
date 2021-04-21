public class MainAlg {
    public static final String ANSI_GREEN = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final int totalGlobal = 0;

    public static void main(String[] args) {
        int[] greyLevelHistogram = new int[8];
        greyLevelHistogram[0] = 790;
        greyLevelHistogram[1] = 1023;
        greyLevelHistogram[2] = 850;
        greyLevelHistogram[3] = 656;
        greyLevelHistogram[4] = 329;
        greyLevelHistogram[5] = 245;
        greyLevelHistogram[6] = 122;
        greyLevelHistogram[7] = 81;

        System.out.println("Histogram Equalisation Algorithm:");
        System.out.println();
        alg(greyLevelHistogram, 3);

    }


    public static void alg(int[] inputArr, int bit) {

        int[] sumArr = new int[inputArr.length];
        //g
        System.out.print(ANSI_GREEN + "g:      " + ANSI_RESET);
        for (int x = 0; x < inputArr.length; x++) {

            System.out.print(x + "        ");

        }
        System.out.println();

        //h(g)
        System.out.print(ANSI_GREEN + "h(g):  " + ANSI_RESET);

        for (int x = 0; x < inputArr.length; x++) {

            System.out.print(inputArr[x] + "      ");

        }

        System.out.println();


        //Cumulative frequency. The sum of h(g)
        System.out.print(ANSI_GREEN + "Σh(g): " + ANSI_RESET);
        int total = 0;
        for (int x = 0; x < inputArr.length; x++) {
            total = total + inputArr[x];
            sumArr[x] = total;
            System.out.print(sumArr[x] + "     ");
        }


        System.out.println();
        System.out.println();
        System.out.println();
        //g'
        //before rounding
        System.out.print("Before rounding:");
        for (int x = 0; x < inputArr.length; x++) {
            System.out.print("    "+pixelValueFormula(bit,total,sumArr[x])+"     ");
        }
        System.out.println();
        System.out.print(ANSI_GREEN + "g': " + ANSI_RESET);
        for (int x = 0; x < inputArr.length; x++) {
            System.out.print("    "+Math.round(Float.parseFloat(pixelValueFormula(bit,total,sumArr[x])+"     ")));
        }



    }

    /*2m-1/n2 *sum */
    public static double pixelValueFormula(int bitNum, int totalNumberOfPixels, int arrValue) {
        int formulaNumerator = (int) Math.pow(2, bitNum) - 1;
        return (double) (formulaNumerator * arrValue) / totalNumberOfPixels;
    }
}
