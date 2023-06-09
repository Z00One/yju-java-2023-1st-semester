package Unit9.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest2 {
  public static void main(String[] args) {
    HashMap<String, ArrayList<String>> keyAndList = new HashMap<>();
    
    ArrayList<String> stds = new ArrayList<>();
    for (int i = 0; i < 15; i++) {
      stds.add("std" + i);
    }
    
    // 첫 번째 키, 벨류(리스트)
    keyAndList.put("team1", new ArrayList<>());
    keyAndList.put("team2", new ArrayList<>());
    keyAndList.put("team3", new ArrayList<>());
    
    keyAndList.getClass();
    
    final int NUM_OF_MEMBER = 5;

    // 값 넣기
    for (String key : keyAndList.keySet()) {
      ArrayList<String> list = keyAndList.get(key);

      for (int i = 0; i < NUM_OF_MEMBER; i++) {
        int randomIndex = (int) Math.floor(Math.random() * stds.size());
        list.add((String)stds.toArray()[randomIndex]);
        stds.remove(randomIndex);
      }
    };

    // 값 출력
    for (String key : keyAndList.keySet()) {
      System.out.print(key + " : ");
      ArrayList<String> list = keyAndList.get(key);

      for (String i : list) {
        System.out.print(i + "\t");
      }

      System.out.println();
    };
  }
}