package main.java.com.company.partition;

interface PartitionStrategy {
    public int partition(int[] data, int begin, int end);
}