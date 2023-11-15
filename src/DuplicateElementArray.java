import java.util.HashMap;
import java.util.Map;

// time complexity O(n)
//space complexity O(n)

public class DuplicateElementArray {
    public static void main(String[] args){
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr={2,3,5,8,2,3,6,45,5,45};

        for(int count:arr){
            map.put(count,map.getOrDefault(count,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
