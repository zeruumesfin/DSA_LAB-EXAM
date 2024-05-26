public class q2 {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            
        if (array[i] == target) {
        return i; 
        }
        }
        return -1; 
        }


   public static void main(String[] args) {
       int [] array = {2,7,11,5};
       int target = 7;

       linearSearch(array, target);

       System.out.println(linearSearch(array, target));
   }
}
