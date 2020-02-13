package main.java.com.company.quick_tour;

import main.java.com.company.partition.BasicPartition;
import main.java.com.company.partition.Quicksort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int[] data = getInputNumbers();
        BasicPartition partition = new BasicPartition(comparison());
        Quicksort quicksort = new Quicksort(partition);
        quicksort.sort(data, 0, data.length-1);
        System.out.println(getOutputString(data));
    }

    private static int[] getInputNumbers(){
        System.out.println("Please enter numbers: ");
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        return Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
    }

    private static BiFunction<Integer, Integer, Boolean> comparison(){
        return (item, pivot) -> {
            return item.toString().length() > pivot.toString().length();
        };
    }

    private static String getOutputString(int[] data){
        return Arrays.stream(data)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}