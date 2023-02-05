package ru.it.academia.org.lesson9;

import ru.it.academia.org.lesson6.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("String");
        list.add(true);
        list.add(new Car());


//        System.out.println(list);

        List<String> strings = new ArrayList<>();
        strings.add("true");
        strings.add("Sting");
        strings.add("1234");

//        System.out.println(strings);

//        StringBuilder builder = new StringBuilder();
//
//        for (String string : strings) {
//            builder.append(string)
//                    .append(" ");
//        }
//
//        System.out.println(builder);

//        System.out.println(strings);
//
//        Collections.sort(strings);
//
//        System.out.println(strings);
//
//        Collections.reverse(strings);
//
//        System.out.println(strings);

        List<Integer> integers = new ArrayList<>();

        integers.add(1234);
        integers.add(12361);
        integers.add(12361);
        integers.add(12361);
        integers.add(12361);
        integers.add(12361);
        integers.add(12361);
        integers.add(12361);
        integers.add(12361);
        integers.add(12361);
        integers.add(819234);
        integers.add(819234);
        integers.add(819234);
        integers.add(819234);
        integers.add(819234);
        integers.add(819234);
        integers.add(819234);
        integers.add(819234);
        integers.add(123477);
        integers.add(123542);
        integers.add(123542);
        integers.add(123542);
        integers.add(123542);
        integers.add(123542);
        integers.add(123542);
        integers.add(123542);
        integers.add(123542);

//        System.out.println(integers);
//
//        integers.remove(Integer.valueOf(123542));
//        System.out.println(integers);

//        List<Integer> ints = Arrays.asList(4522, 8899, 9012); // Java 8
//        List<Integer> ints2 = List.of(4522, 8899, 9012); // Java 11

//        ints.add(2134); // <- UnsupportedOperationException


//        for (Integer integer : integers) {  // <- ConcurrentModificationException
//            if (integer % 2 == 0) {
//                integers.remove(integer);
//            }
//        }

//        Iterator<Integer> iterator = integers.iterator();
//
//        while (iterator.hasNext()) {
//            if (iterator.next() % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(integers);


//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

        set.add("String");
        set.add("777");
        set.add("world!");
        set.add("Hello");

//        System.out.println(set);


//        Set<Integer> uniques = new HashSet<>(integers);
//        System.out.println(uniques);


        //   key     value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 833276251);
        map.put("Alice", 7376251);
        map.put("Katie", 5576251);
        map.put("Bob", 96243151);
        map.put("Mike", 833276251);
//        map.put("Mike", 76231251);  <- предыдущая запись перезапишется!

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

//        Integer bobNumber = map.get("Bob");
        Integer bobNumber = map.get("Bobby");

//        System.out.println(bobNumber);
//
//
//        System.out.println(map);
        List<String> keysByValue = getKeysByValue(map, 833276251);
        System.out.println(keysByValue);

    }


    public  static  List<String> getKeysByValue(Map<String, Integer> map, Integer value) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String pairKey = pair.getKey();
            Integer pairValue = pair.getValue();

            if (value.equals(pairValue)) {
                result.add(pairKey);
            }

        }

        return result;
    }

}
