package ru.it.academia.org.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<PromoCode> promos = new ArrayList<>();

        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA300", true));
        promos.add(new PromoCode("SKIDKA400", true));
        promos.add(new PromoCode("SKIDKA500", false));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA300", true));
        promos.add(new PromoCode("SKIDKA400", true));
        promos.add(new PromoCode("SKIDKA500", false));
        promos.add(new PromoCode("SKIDKA100", false));
        promos.add(new PromoCode("SKIDKA100", false));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA200", true));
        promos.add(new PromoCode("SKIDKA200", true));


//        promos.stream()
//                .filter(PromoCode::getExpired)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        promos.stream()
//                .filter(promoCode -> !promoCode.getExpired())
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        promos.stream()
//                .filter(promoCode -> promoCode.getCode().equals("SKIDKA200"))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//
//        promos.sort(Comparator.comparing(PromoCode::getCode));
//
//        promos.forEach(System.out::println);

        Map<String, List<PromoCode>> map = promos.stream()
                .collect(Collectors.groupingBy(PromoCode::getCode));

//
//        List<PromoCode> skidka200 = map.get("SKIDKA200");
//        skidka200.forEach(System.out::println);

        map.forEach((k, v) -> {
            if (k.equals("SKIDKA100")) {
                v.forEach(System.out::println);
            }
        });

        AtomicInteger counter = new AtomicInteger();

        promos.forEach(promoCode -> {
            if (!promoCode.getCode().equals("SKIDKA500")) {
                counter.getAndIncrement();
            }
        });

        System.out.println(promos.size());
        System.out.println(counter.get());

    }

}
