import java.util.*;

public class problem1{

public static boolean findduplicatenumber(int[] number){
    HashSet<Integer> seen=new HashSet<>();
    for (int num : number){
        if(seen.contains(num)){
            return true;

        }
        else{
            seen.add(num);
        }
        
    }
        
    return false;

}


public static void main(String[] args){
    int[] number1={3,2,3,9};
    System.out.println("ex1:"+findduplicatenumber(number1));

    int[] number2={3,2,3,4};
    System.out.println("ex2:"+findduplicatenumber(number2));
}
}
