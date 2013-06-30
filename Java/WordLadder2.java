import java.util.*;

public class WordLadder2 {
	private String start = null;
	private String end = null;
	private HashSet<String> dict = null;
	
    public ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict) {
    	this.start = start;
    	this.end = end;
    	this.dict = dict;
        Queue<String> queue = new LinkedList<String>();
    	queue.add(start);
    	Map<String, Integer> distance = new HashMap<String, Integer>();
    	distance.put(start, 1);
    	
    	while(!queue.isEmpty()) {
    		String head = queue.poll();
    		final int headDistance = distance.get(head);
    		List<String> addj = addjacent(head, dict);
    		for (String x : addj) {
				if(!distance.containsKey(x)) {
					queue.add(x);
					distance.put(x, headDistance + 1);
				}
    		}
    	}
    	
    	ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
    	if(distance.containsKey(end)) {
    		dfs(distance, end, new ArrayList<String>(), result);
    	}
    	return result;
    }
    
    private List<String> addjacent(String head, HashSet<String> dict) {
    	List<String> result = new ArrayList<String>();
    	for(int i = 0; i < head.length(); i++) {
			for(char j = 'a'; j <= 'z'; j++) {
				StringBuilder sb = new StringBuilder(head);
				sb.setCharAt(i, j);
				if(dict.contains(sb.toString())) {
					result.add(sb.toString());
				}
			}
		}
    	return result;
    }
    
    private void dfs(Map<String, Integer> distance, String cur, ArrayList<String> path, ArrayList<ArrayList<String>> result) {
    	path.add(cur);
    	int d = distance.get(cur);
    	if(d == 1) {
    		Collections.reverse(path);
    		result.add(path);
    		return ;
    	}
    	
    	List<String> addj = addjacent(cur, dict);
    	for (String x : addj) {
    		if (distance.get(x) == d - 1) {
    			ArrayList<String> newPath = (ArrayList<String>) path.clone();
    			dfs(distance, x, newPath, result);
    		}
    	}
    }
}