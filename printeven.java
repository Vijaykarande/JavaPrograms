class printeven
{
    public static void main(String[] args)
    {
        int[] arr = {20, 30, 40, 50, 60, 60, 70, 80};

        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
