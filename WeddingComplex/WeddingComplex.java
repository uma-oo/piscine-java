


import java.util.List;
import java.util.Map;

import java.util.HashMap; 
import java.util.HashSet; 
import java.util.Set; 
import java.util.ArrayList; 


public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        // your code here
        
        Map<String, String> couples = new HashMap<>(); 
        // iterate over men 
        Set<String> singles = new HashSet<>(first.keySet());
        List<String> toRemove = new ArrayList<>();
        List<String> toAdd = new ArrayList<>();

        while (singles.size()!=0) {
            for (String man: singles) {
                        List<String> womenOfInterest = first.get(man); 
                        for (String woman: womenOfInterest ) {
                            if (!couples.containsValue(woman)) {
                            toRemove.add(man);
                            couples.put(man, woman); 
                            break; 
                            } 
                            String otherMan = getKeyByValue(couples, woman);
                            List<String> menOfInterest = second.get(woman); 
                            if (menOfInterest.contains(man) && menOfInterest.indexOf(man) < menOfInterest.indexOf(otherMan)) {
                                couples.remove(otherMan);
                                toAdd.add(otherMan); 
                                toRemove.add(man); 
                                couples.put(man, woman); 
                                break; 
                                
                            }
                              
                    }
            
            
            
            }
            singles.removeAll(toRemove);
            singles.addAll(toAdd);
            
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