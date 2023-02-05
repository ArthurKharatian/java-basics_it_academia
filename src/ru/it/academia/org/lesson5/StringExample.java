package ru.it.academia.org.lesson5;

import java.io.IOException;

public class StringExample {

    public static void main(String[] args) throws IOException {

        String java = "JaVa";

//        String java2 = new String("JavA");
//
//
//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));


        java = java.concat(" Developer");

//        System.out.println(java);

//        java = java + 123;

//        System.out.println(java);


//        java = 80 + 120 + java + (140 + 160);

//        System.out.println(java);
//
//        int length = java.length();
//        System.out.println(length);

//        char[] chars = java.toCharArray();

        String empty = "";
//        System.out.println(empty.isEmpty());

//
//        String substring = java.substring(3);
//
////        System.out.println(substring);
//
//
//        String substring2 = java.substring(3, 7);
//        System.out.println(substring2);


        String string = " Hello world12341!   ";
//        System.out.println(string);
//        System.out.println(string.trim());


//        String l = string.replaceAll("l", "?");
//        String l = string.replaceAll("[^0-9]", "?");
//        System.out.println(l);

        String text = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";
//
//        String[] strings = text.split(" ");
//        for (String s : strings) {
//            System.out.println(s);
//        }

//        int counter = 0;
//        char[] chars = string.toCharArray();
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                counter++;
//            }
//        }
//
//        System.out.println("counter: " + counter);


//        Integer number = 4525442;
//
//        String s = String.valueOf(number);
//        System.out.println(s);
//
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String line = reader.readLine();
//
//        System.out.println(Integer.parseInt(line));


        StringBuilder builder = new StringBuilder();
//        StringBuilder builder2 = new StringBuilder(java);

//        System.out.println(builder);

//        System.out.println(java == builder.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
//        System.out.println(java.equals(builder.toString()));
//        System.out.println(java.equals(builder));

        for (String word : text.split(" ")) {
            builder.append(word)
                    .append(", ");
        }


//        String result = builder.toString();
//        System.out.println(result);

//        System.out.println(builder.reverse());


        builder.insert(3, "MOSCOW");
        System.out.println(builder);


        StringBuffer stringBuffer = new StringBuffer();

    }

}
