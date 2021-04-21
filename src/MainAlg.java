public class MainAlg {
    public static void main(String[] args) {
        int [] greyLevelHistogram = new int[8];
        greyLevelHistogram[0]= 780;
        greyLevelHistogram[1]= 1023;
        greyLevelHistogram[2]= 850;
        greyLevelHistogram[3]= 656;
        greyLevelHistogram[4]= 329;
        greyLevelHistogram[5]= 245;
        greyLevelHistogram[6]= 122;
        greyLevelHistogram[7]= 81;

        System.out.println("Histogram Equalisation Algorithm:");
        System.out.println();
        alg(greyLevelHistogram,3);

    }


    public static void alg(int [] inputArr, int bit){


        //g
        System.out.print("g:      ");
    for(int x=0; x<inputArr.length; x++){

        System.out.print(x +"     ");

    }
        System.out.println();

    //h(g)
        System.out.print("h(g):  ");

        for(int x=0; x<inputArr.length; x++){

            System.out.print(inputArr[x] +"   ");

        }

    }
}
