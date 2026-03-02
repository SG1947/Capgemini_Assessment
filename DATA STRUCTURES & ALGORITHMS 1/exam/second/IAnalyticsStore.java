package DSA.exam.second;

import java.util.Queue;

interface IAnalyticsStore {
    void storeActions(Queue<ActionEnum> actions);
}
enum ActionEnum {
    LOGIN,
    LOGOUT,
    PURCHASE,
    VIEW
}
