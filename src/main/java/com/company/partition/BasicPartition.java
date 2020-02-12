package main.java.com.company.partition;

public class BasicPartition implements PartitionStrategy {

    public int partition(int[] data, int begin, int end){
        int pivot = data[begin];
        int rightBegin = begin + 1;

        for(int i=rightBegin; i <= end; i++)
        {
            if (data[i] < pivot)
            {
                this.swap(data, i, rightBegin);
                rightBegin++;
            }
        }

        int mid = rightBegin - 1;
        this.swap(data, begin, mid);
        return mid;
    }

    void swap(int[] data, int a, int b)
    {
        if (a != b)
        {
            int x = data[a];
            data[a] = data[b];
            data[b] = x;
        }
    }
}
