package DSA.exam;

import java.util.*;

public class Main {

    public static List<List<String>> extractErrorLog(List<List<String>> logs) {

        List<List<String>> result = new ArrayList<>();
        for (List<String> log : logs) {
            if (log.get(2).equals("ERROR") || log.get(2).equals("CRITICAL")) {
                result.add(log);
            }
        }

        // Sort by date + time (stable)
//        Collections.sort(result, (a, b) -> {
//            String keyA = a.get(0) + " " + a.get(1);
//            String keyB = b.get(0) + " " + b.get(1);
//            return keyA.compareTo(keyB);
//        });
      // Stable sort with lambda comparator
      result.sort((a, b) -> {

          String[] d1 = a.get(0).split("-");
          String[] d2 = b.get(0).split("-");
          String[] t1 = a.get(1).split(":");
          String[] t2 = b.get(1).split(":");

          int y1 = Integer.parseInt(d1[2]);
          int y2 = Integer.parseInt(d2[2]);
          if (y1 != y2) return y1 -y2;

          int m1 = Integer.parseInt(d1[1]);
          int m2 = Integer.parseInt(d2[1]);
          if (m1 != m2) return m1 -m2;

          int day1 = Integer.parseInt(d1[0]);
          int day2 = Integer.parseInt(d2[0]);
          if (day1 != day2) return day1-day2;

          int h1 = Integer.parseInt(t1[0]);
          int h2 = Integer.parseInt(t2[0]);
          if (h1 != h2) return h1 -h2;

          int min1 = Integer.parseInt(t1[1]);
          int min2 = Integer.parseInt(t2[1]);
          if (min1 != min2) return min1 -min2;

          return 0; // SAME date + time → keep insertion order
      });
        return result;
    }

    // Example
    public static void main(String[] args) {
        List<List<String>> logs = new ArrayList<>();

        logs.add(Arrays.asList("01-01-2024", "14:00", "ERROR", "failed"));
        logs.add(Arrays.asList("21-01-2023", "15:00", "INFO", "established"));
        logs.add(Arrays.asList("01-01-2023", "01:30", "ERROR", "failed"));

        List<List<String>> output = extractErrorLog(logs);

        for (List<String> log : output) {
            System.out.println(log);
        }
    }
}


//import java.util.*;
//
//public class Main {
//
//    public static List<List<String>> extractErrorLog(List<List<String>> logs) {
//
//        List<List<String>> result = new ArrayList<>();
//
//        // 1. Filter ERROR and CRITICAL
//        for (List<String> log : logs) {
//            if (log.get(2).equals("ERROR") || log.get(2).equals("CRITICAL")) {
//                result.add(log);
//            }
//        }
//
//        // 2. Sort by date and time (numeric comparison)
//        result.sort(new Comparator<List<String>>() {
//            @Override
//            public int compare(List<String> a, List<String> b) {
//
//                // Split date and time
//                String[] d1 = a.get(0).split("-");
//                String[] d2 = b.get(0).split("-");
//                String[] t1 = a.get(1).split(":");
//                String[] t2 = b.get(1).split(":");
//
//                int y1 = Integer.parseInt(d1[2]);
//                int y2 = Integer.parseInt(d2[2]);
//                if (y1 != y2) return y1 < y2 ? -1 : 1;
//
//                int m1 = Integer.parseInt(d1[1]);
//                int m2 = Integer.parseInt(d2[1]);
//                if (m1 != m2) return m1 < m2 ? -1 : 1;
//
//                int day1 = Integer.parseInt(d1[0]);
//                int day2 = Integer.parseInt(d2[0]);
//                if (day1 != day2) return day1 < day2 ? -1 : 1;
//
//                int h1 = Integer.parseInt(t1[0]);
//                int h2 = Integer.parseInt(t2[0]);
//                if (h1 != h2) return h1 < h2 ? -1 : 1;
//
//                int min1 = Integer.parseInt(t1[1]);
//                int min2 = Integer.parseInt(t2[1]);
//                if (min1 != min2) return min1 < min2 ? -1 : 1;
//
//                return 0; // same timestamp → keep original order (stable sort)
//            }
//        });
//
//        return result;
//    }
//}





//import java.util.*;
//
//public class Main {
//
//    public static List<List<String>> extractErrorLog(List<List<String>> logs) {
//
//        List<List<String>> result = new ArrayList<>();
//
//        // Filter ERROR and CRITICAL
//        for (List<String> log : logs) {
//            if (log.get(2).equals("ERROR") || log.get(2).equals("CRITICAL")) {
//                result.add(log);
//            }
//        }
//
//        // Stable sort with lambda comparator
//        result.sort((a, b) -> {
//
//            String[] d1 = a.get(0).split("-");
//            String[] d2 = b.get(0).split("-");
//            String[] t1 = a.get(1).split(":");
//            String[] t2 = b.get(1).split(":");
//
//            int y1 = Integer.parseInt(d1[2]);
//            int y2 = Integer.parseInt(d2[2]);
//            if (y1 != y2) return y1 < y2 ? -1 : 1;
//
//            int m1 = Integer.parseInt(d1[1]);
//            int m2 = Integer.parseInt(d2[1]);
//            if (m1 != m2) return m1 < m2 ? -1 : 1;
//
//            int day1 = Integer.parseInt(d1[0]);
//            int day2 = Integer.parseInt(d2[0]);
//            if (day1 != day2) return day1 < day2 ? -1 : 1;
//
//            int h1 = Integer.parseInt(t1[0]);
//            int h2 = Integer.parseInt(t2[0]);
//            if (h1 != h2) return h1 < h2 ? -1 : 1;
//
//            int min1 = Integer.parseInt(t1[1]);
//            int min2 = Integer.parseInt(t2[1]);
//            if (min1 != min2) return min1 < min2 ? -1 : 1;
//
//            return 0; // SAME date + time → keep insertion order
//        });
//
//        return result;
//    }
//}

