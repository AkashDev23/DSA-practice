
import java.util.ArrayList;

class ArraylistInteger {
    public static void main(String[]args){
        ArrayList <Integer>li=new ArrayList<Integer>();
        li.add(2);
        li.add(3);
        li.add(5);
        int sum=0;
        for(int i:li){
            sum+=i;
            System.out.print("sum of the numbers in arraylist is "+sum);
        }
    }
}