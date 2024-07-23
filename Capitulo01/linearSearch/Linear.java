package linearSearch;

/**
 * Linear Search
 */
public class Linear{

    //Int search
    public static Object search(int[] list, int value){
        Object result = null;
        for(int i = 0; i < list.length; i++){
            if(list[i] == value){
                result = i;
                return result;
            }
        }
        return result;
    }

        //double search
        public static Object search(double[] list, double value){
            Object result = null;
            for(int i = 0; i < list.length; i++){
                if(list[i] == value){
                    result = i;
                    return result;
                }
            }
            return result;
        }

    //String search
    public static Object search(String[] list, String value){
        Object result = null;
        for(int i = 0; i < list.length; i++){
            if(list[i].equals(value)){
                result = i;
                return result;
            }
        }
        return result;
    }
}