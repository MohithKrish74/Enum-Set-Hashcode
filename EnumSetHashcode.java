package com.keyword;

import java.util.EnumSet;

enum Sport{CRICKET,HOCKEY,BASEBALL,FOOTBALL,VOLLEYBALL}
public class EnumSetHashcode
{
    public static void main(String[] args)
    {
        EnumSet<Sport> set = EnumSet.allOf(Sport.class);
        System.out.println("Before: ");
        System.out.println("The Set is "+set);
        System.out.println("The Hashcode of the Set is "+set.hashCode());
        System.out.println("------------------------------");
        set.clear();
        System.out.println("After: ");
        System.out.println("The Set is "+set);
        System.out.println("The Hashcode of the Set is "+set.hashCode());
        System.out.println("------------------------------");



    }
}
