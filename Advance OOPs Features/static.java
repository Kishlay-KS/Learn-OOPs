class Counter {
    private static int count;

    public Counter(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void resetCount() {
        count = 0;
    }
}