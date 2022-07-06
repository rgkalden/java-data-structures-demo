package com.rgkalden;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());

        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

    }
}
