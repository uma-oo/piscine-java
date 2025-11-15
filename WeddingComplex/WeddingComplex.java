


import java.util.List;
import java.util.Map;

import java.util.HashMap; 

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        // your code here
        
        Map<String, String> couples = new HashMap<>(); 
        // iterate over men 
        for (int i =0 ; i<first.size(); i++) {
            for (Map.Entry<String, List<String>> entry : first.entrySet())  {
                        String man = entry.getKey(); 
                        List<String> womenOfInterest = entry.getValue(); 
                
                        for (String woman: womenOfInterest ) {
                            if (!couples.containsValue(woman)) {
                            couples.put(man, woman); 
                            break; 
                            } 
                            String otherMan = getKeyByValue(couples, woman);
                            List<String> menOfInterest = second.get(woman); 
                            if (menOfInterest.contains(man) && menOfInterest.indexOf(man) < menOfInterest.indexOf(otherMan)) {
                                couples.remove(otherMan); 
                                couples.put(man, woman); 
                                i =-1; 
        
                                
                            }
                            
                            
                        }

                    }

                }
        
        return couples;          
    } 


    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
    for (Map.Entry<K, V> entry : map.entrySet()) {
        if (entry.getValue().equals(value)) { 
            return entry.getKey();
        }
    }
    return null; 
   }

}