package strategies.impl;

import strategies.SearchStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllStrategyImpl implements SearchStrategy {

    @Override

    public List<String> search(List<String> list, Map<String, ArrayList<Integer>> searchMap, String query) {
        String[] words = queryWords(query);
        List<String> found = new ArrayList<>();

        for (int index : searchMap.getOrDefault(words[0], new ArrayList<>())) {
            boolean temporaryIndex = false;

            for (String word : words) {
                if (!list.get(index).toUpperCase().contains(word)) {
                    temporaryIndex = true;
                    break;
                }
            }

            if (!temporaryIndex) {
                found.add(list.get(index));
            }
        }
        return found;
    }
}