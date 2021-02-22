package com.Solution649;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiance = new LinkedList<Integer>();
        Queue<Integer> dire = new LinkedList<Integer>();
        int direIndex=0,radianceIndex=0;

        for (int i=0; i<senate.length(); i++){
            if (senate.charAt(i)=='R'){radiance.add(i);}
            else dire.add(i);
        }
        while (!radiance.isEmpty() && !dire.isEmpty()){
            radianceIndex = radiance.poll();
            direIndex = dire.poll();
            if (radianceIndex<direIndex){
                radiance.add(radianceIndex+senate.length());
            }  else {
                dire.add(direIndex+senate.length());
            }
        }
        return radiance.isEmpty()?"Dire":"Radiant";
    }
}
