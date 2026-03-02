package DSA.exam.second;


import java.util.*;
import java.util.Map.Entry;

class Analytics {

    private final IAnalyticsStore analyticsStore;
    private final int K;

    private Queue<ActionEnum> buffer;
    private Map<ActionEnum, Integer> frequencyMap;
    
    
    private int totalLoggedActions;
    private int maxFrequency;

    public Analytics(IAnalyticsStore analyticsStore, int K) {
        this.analyticsStore = analyticsStore;
        this.K = K;
        this.buffer = new LinkedList<>();
        this.frequencyMap = new HashMap<>();
        this.totalLoggedActions = 0;
        this.maxFrequency = 0;
    }

    public void registerAction(ActionEnum action) {
        buffer.offer(action);
        totalLoggedActions++;

        int freq = frequencyMap.getOrDefault(action, 0) + 1;
        frequencyMap.put(action, freq);
        maxFrequency = Math.max(maxFrequency, freq);

        if (buffer.size() == K) {
            analyticsStore.storeActions(new LinkedList<>(buffer));
            buffer.clear();
        }
    }

    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
        return buffer.size();
    }

    public int getTotalNumberOfLoggedActions() {
        return totalLoggedActions;
    }

    public List<ActionEnum> getMostFrequentlyUsedActions() {
        List<ActionEnum> result = new ArrayList<>();
        for(ActionEnum key : frequencyMap.keySet()) {
        	if(frequencyMap.get(key)==maxFrequency) result.add(key);
        }
//        for (Map.Entry<ActionEnum, Integer> entry : frequencyMap.entrySet()) {
//            if (entry.getValue() == maxFrequency) {
//                result.add(entry.getKey());
//            }
//        }

        result.sort((a, b) -> a.name().compareTo(b.name()));
        return result;
    }
}
