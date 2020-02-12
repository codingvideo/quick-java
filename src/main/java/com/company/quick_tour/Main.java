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
        System.out.println("Please enter numbers: ");
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int[] data = Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
        BiFunction<Integer, Integer, Boolean> comparison = (item, pivot) -> item.toString().length() > pivot.toString().length();
        BasicPartition partition = new BasicPartition(comparison);
        Quicksort quicksort = new Quicksort(partition);
        quicksort.sort(data, 0, data.length-1);
        String output = Arrays.stream(data)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}