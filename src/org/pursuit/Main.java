package org.pursuit;

import java.util.ArrayList;
import java.util.Scanner;

import static org.pursuit.Weather.*;
// * anything tahts static i want all of them

public class Main {

    public static void main(String[] args) {
//        System.out.println(reverseMe("hello"));
//        String word = "helo";
//        word = word + ", world";
//    }
////
////    private static boolean reverseMe(String hello) {
////        return new stringBuilder(word).reverse().toString();
////    }
//        Bucket<Integer> bucket = new Bucket<>(contents: 6);
//
//        ArrayList<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("hell");
//        stringArrayList.add("s");
//        stringArrayList.add("das");
//
//        for ( String s: stringArrayList){
//            System.out.println(s);
//
//            //iterable class- for everything that is a string do that
//        }
//
//        System.out.println(bucket.getContents());
//
//        Weather weather = Weather.SUNNY;
        Weather weather = SUNNY;
//        System.out.println(Weather.values()[2]);
//        System.out.println(Weather.RAINY.ordinal()); //find the index of RAINY which order it lies in


        Scanner scanner = new Scanner(System.in);
        System.out.println("what choice");
        int input = scanner.nextInt();
        checkWeather(Weather.values()[input-1]);

    }
        public static void checkWeather(Weather weather) {
            if(weather != null) {
                switch(weather){
                    case SUNNY:
                        System.out.println(SUNNY.toString());
                        break;
                    case RAINY:
                        System.out.println(RAINY.toString());
                        break;
                    case CLOUDY:
                        System.out.println(CLOUDY.toString());
                        break;
                    case UNKNOWN:
                        System.out.println(UNKNOWN.toString());
                        break;
                }
            }
        }

    }
