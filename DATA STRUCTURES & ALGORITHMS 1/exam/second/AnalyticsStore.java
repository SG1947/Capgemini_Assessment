package DSA.exam.second;
import java.util.*;

class AnalyticsStore implements IAnalyticsStore {

    private List<ActionEnum> storedActions = new ArrayList<>();

    @Override
    public void storeActions(Queue<ActionEnum> actions) {
        storedActions.addAll(actions);
    }

    public List<ActionEnum> getStoredActions() {
        return storedActions;
    }
}
