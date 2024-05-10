package com.imooc.miaoshaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainq {

    public static void main(String []args) {
        int[] nums = new int[]{3, 1, 5, 9};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(nums));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
