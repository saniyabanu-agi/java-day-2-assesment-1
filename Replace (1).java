class Replace {
    static void findEncryptedArray(int arr[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        for (int i = 0; i < n; i++)
            System.out.print(sum - arr[i] + " ");
    }
    public static void main(String[] args)
    {
        int arr[] = { 5, 1, 3, 2, 4 };
        int N = arr.length;
        findEncryptedArray(arr, N);
    }
}