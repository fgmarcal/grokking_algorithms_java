package binarySearch;


/**
 * Binary Search
 */
public class Binary {
    
    //Int search
    public static Object search(int[] list, int value){
        Object result = null;
        int low = 0;
        int high = list.length - 1;
        

        while(low <= high){
            int half = (low + high) / 2;
            int guess = list[half];
            if(guess == value){
                return half;
            }
            if(guess > value){
                high = half - 1;
            }else{
                low = half + 1;
            }
        }
        return result;
    }

    //Double search
    public static Object search(double[] list, double value){
        Object result = null;
        int low = 0;
        int high = list.length - 1;
        

        while(low <= high){
            int half = (low + high) / 2;
            double guess = list[half];
            if(guess == value){
                return half;
            }
            if(guess > value){
                high = half - 1;
            }else{
                low = half + 1;
            }
        }
        return result;
    }

    //String search
    public static Object search(String[] list, String value){
        Object result = null;
        int low = 0;
        int high = list.length - 1;
        

        while(low <= high){
            int half = (low + high) / 2;
            int guess = value.compareTo(list[half]) ;
            if(guess == 0){
                return half;
            }
            if(guess < 0){
                high = half - 1;
            }else{
                low = half + 1;
            }
        }
        return result;
    }

}
