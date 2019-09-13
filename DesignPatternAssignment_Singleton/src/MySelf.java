public class MySelf {
    private volatile static MySelf ourInstance;

    private MySelf() {
        System.out.println("I am myself, I am unique!");
    }

    public static MySelf getInstance() {
        if(ourInstance == null){
            synchronized (MySelf.class){
                if(ourInstance == null){
                    ourInstance = new MySelf();
                }
            }
        }
        return ourInstance;
    }

}
