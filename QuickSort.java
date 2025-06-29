class QuickSort
{
    int partition(int a[], int low, int high)
    {
        int pivot = a[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (a[j] <= pivot)
            {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      a[] --> Array to be sorted,
      l  --> Starting index,
      h  --> Ending index */
    void sort(int a[], int l, int h)
    {
        if (l < h)
        {
            int pi = partition(a, l, n)
            sort(a, l, pi-1);
            sort(a, pi+1, h);
        }
    }
    public static void main(String args[])
    {
        int a[] = {10, 7, 8, 9, 1, 5};
        int n = a.length;
        QuickSort ob = new QuickSort();
        ob.sort(a, 0, n-1);

        for (int i=0; i<n; ++i)
            System.out.print(a[i]+" ");
    }
}