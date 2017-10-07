package com.acehouhao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author houhao
 */
public class P171 {
    public static void main(String[] args) {
        String[] strings = {"lint","intl","inlt","code"};
//        String[] strings = {"tea","and","ate","eat","den"};
        for (String s : anagrams(strings)) {
            System.out.println(s);
        }
    }

    /*
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public static List<String> anagrams(String[] strs) {
        List<String> anagramList = new ArrayList<>();
//        int[] flag = new int[strs.length];
//        for (int i = 0; i < strs.length; i++) {
//            boolean addi = false;
//            for (int j = i + 1; j < strs.length; j++) {
//                if (flag[j] == 1) {
//                    continue;
//                }
//                if (strs[i].length() != strs[j].length()) {
//                    continue;
//                }
//                if (strs[i].equals(strs[j])) {
//                    if (!addi) {
//                        anagramList.add(strs[i]);
//                        addi = true;
//                    }
//                    anagramList.add(strs[j]);
//                    flag[j] = 1;
//                    addi = true;
//                    continue;
//                }
//
//                String[] sa = strs[i].split("");
//                String[] ta = strs[j].split("");
//                Arrays.sort(sa);
//                Arrays.sort(ta);
//
//                for (int k = 0; k < sa.length; k++) {
//                    if (!sa[k].equals(ta[k])) {
//                        break;
//                    }
//                    if (k == sa.length - 1) {
//                        if (!addi) {
//                            anagramList.add(strs[i]);
//                            addi = true;
//                        }
//                        anagramList.add(strs[j]);
//                        flag[j] = 1;
//                    }
//                }
//            }
//        }

        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            String key = hashStr(s);
            ArrayList<String> res = hashMap.get(key);
            if (res == null) {
                res = new ArrayList<>();
                hashMap.put(key, res);
            }
            res.add(s);
        }

        for (ArrayList<String> anagram : hashMap.values()) {
            if (anagram.size() > 1) anagramList.addAll(anagram);
        }

        return anagramList;
    }

    private static String hashStr(String str) {
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            hash[index]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) continue;
            char c = (char) (i + 'a');
            sb.append(c);
            sb.append(hash[i]);
        }
        return sb.toString();
    }
}
