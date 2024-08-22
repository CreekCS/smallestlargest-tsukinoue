//Helen Arina 
public class SmallestLargest{
    public static void main(String[] args){
        int[] numbers;
        numbers = new int[10];
        for (int i = 0; i < 10; i++){
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(smallestValue(numbers));
        System.out.println(largestValue(numbers));
    }
    public static int smallestValue(int[] numbers){
        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest){
                smallest = numbers[i];
            } 
        }
        return smallest;
    }
    public static int largestValue(int[] numbers){
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest){
                largest = numbers[i];
            } 
        }
        return largest;
    }
}