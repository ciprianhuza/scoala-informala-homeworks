// Java program to find smallest number in an array
     
    public class SmallestNumberArray {
	 
    public static void main(String[] args) {

        int[] numbers = {10,20,33,40,55,67};

        int smallest = Integer.MAX_VALUE;

         

        for(int i =0;i<numbers.length;i++) {

            if(smallest > numbers[i]) {

                smallest = numbers[i];

            }

        }

         

        System.out.println("Smallest number in array is : " +smallest);

    }

}
