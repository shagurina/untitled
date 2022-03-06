package HomeWork4_Task2;

import java.util.HashMap;

public class Phonebook {


    private static HashMap<String, String> hm = new HashMap<>();

    public void add(String phone, String name) {
        hm.put(phone,name);
    }

    public static String getPhone(String name) {
        if(hm.containsValue(name)) {
            String result = "Phone: ";
            // System.out.println(s);
            for (String key : hm.keySet()) if (hm.get(key).equals(name)) result += key + ";";
            return result;

        }
                else return "Can't find";


    }
}


//                        {    System.out.println(o.getKey() + ": " + o.getValue());
//                }





