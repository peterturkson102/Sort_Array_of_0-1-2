// Java program to sort an array of 0, 1 and 2

class Sorting {

    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void sorter(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    /* Utility function to print array myArray[] */
    static void printArray(int myArray[], int arrSize)
    {
        int i;
        for (i = 0; i < arrSize; i++)
            System.out.print(myArray[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main(String[] args)
    {
        int myArray[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arrSize = myArray.length;
        sorter(myArray, arrSize);
        System.out.println("Array after sorting ");
        printArray(myArray, arrSize);
    }
}