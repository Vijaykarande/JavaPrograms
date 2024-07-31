class array6
{
    public static void main(String[] args)
    {
        int[] arr = {20, 3, 40, 5, 60, 60, 7, 80};

        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
