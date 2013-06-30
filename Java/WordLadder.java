import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class WordLadder {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        Queue<String> queue = new LinkedList<String>();
    	queue.add(start);
    	Map<String, Integer> distance = new HashMap<String, Integer>();
    	distance.put(start, 1);
    	
    	while(!queue.isEmpty()) {
    		String head = queue.poll();
    		final int headDistance = distance.get(head);
    		for(int i = 0; i < head.length(); i++) {
    			for(char j = 'a'; j <= 'z'; j++) {
    				StringBuilder sb = new StringBuilder(head);
    				sb.setCharAt(i, j);
    				if(dict.contains(sb.toString()) && !distance.containsKey(sb.toString())) {
    					queue.add(sb.toString());
    					distance.put(sb.toString(), headDistance + 1);
    				}
    			}
    		}
    	}
    	
    	if(distance.containsKey(end)) {
    		return distance.get(end);
    	}
    	else {
    		return 0;
    	}
    }
}
