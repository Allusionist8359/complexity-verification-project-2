    public static void main7 (String[] args) {
        int array[] = {2, 19, 5, 17};
        int result = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > result)
                result = array[i];
        System.out.println(result);
    }
