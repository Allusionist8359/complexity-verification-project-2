    public static void main8(String[] args) {
        int number = 323;
        int result = 0;

        while (number!= 0) {
            result = result + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
