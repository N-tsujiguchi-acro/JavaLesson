package sampleJava5_1;

public class RunnableExample {  
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        });

        thread.start(); 
    }
}

