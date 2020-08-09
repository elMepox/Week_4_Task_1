package com.sergey.kataev;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    private static<T> Collection<T> getCollectionWithoutDubl(Collection<T> collection){
        return new HashSet<T>(collection);
    }

    public static void main(String[] args) {
        LinkedList<String> collection = new LinkedList<>();
        collection.add("1");
        collection.add("2");
        collection.add("2");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        System.out.println("До избавления от дубликатов");
        for (Object i:collection
        ) {
            System.out.println(i.toString());
        }
        Collection<String> collectionWithNoDubl = getCollectionWithoutDubl(collection);
        System.out.println("После избавления от дубликатов");
        for (Object i:collectionWithNoDubl
             ) {
            System.out.println(i.toString());
        }
    }
}
