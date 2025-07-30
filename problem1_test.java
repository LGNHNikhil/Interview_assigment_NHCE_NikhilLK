import java.util.*;

public class problem1_test{

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
    int[] number1={1,2,3,-1};
    System.out.println("testex1:"+findduplicatenumber(number1));

    int[] number2={1,2,-3,4};
    System.out.println("testex2:"+findduplicatenumber(number2));

    int[] number3={1,1,1,3,3,4,3,2,4,2};
    System.out.println("testex2:"+findduplicatenumber(number3));

    int[] number4={0,0,0,1};
    System.out.println("testex2:"+findduplicatenumber(number4));
}
}

