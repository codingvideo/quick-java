package main.java.com.company.partition;

public class Quicksort {

    private PartitionStrategy strategy;

    public Quicksort(PartitionStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(int[] data, int begin, int end)
    {
        if (begin < end)
        {
            int mid = this.strategy.partition(data, begin, end);
            this.sort(data, begin, mid - 1);
            this.sort(data, mid + 1, end);
        }
    }
}
