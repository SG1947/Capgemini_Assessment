package DSA.exam.second;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        AnalyticsStore store = new AnalyticsStore();
        Analytics analytics = new Analytics(store, 3);

        analytics.registerAction(ActionEnum.LOGIN);
        analytics.registerAction(ActionEnum.LOGOUT);
        analytics.registerAction(ActionEnum.LOGIN);

        analytics.registerAction(ActionEnum.PURCHASE);
        analytics.registerAction(ActionEnum.LOGIN);

        System.out.println("Pending actions (not sent): " +
                analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore());

        System.out.println("Total logged actions: " +
                analytics.getTotalNumberOfLoggedActions());

        System.out.println("Most frequently used actions: " +
                analytics.getMostFrequentlyUsedActions());

        System.out.println("Actions stored in AnalyticsStore: " +
                store.getStoredActions());
    }
}
