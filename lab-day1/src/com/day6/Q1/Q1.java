package com.day6.Q1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class    Q1 {

    public static void main(String[] args) throws InterruptedException {
        //String[] fileUrls = new String[5];
        List<String> fileUrls = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            fileUrls.add(i, "https://www.dropbox.com/photo" + (i + 1) + ".jpg");
        }

        // Using ExecutorService for better thread management and to handle large number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(25); // Thread pool with 5 threads

        System.out.println("Start downloading files...");

        // Submit file download tasks to the thread pool
        for (String url : fileUrls) {
            executorService.submit(new FileDownloader(url));
        }

        // Gracefully shutdown the executor after all tasks are finished
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Waiting for all threads to finish
            //System.out.println();
        }

        System.out.println("All files downloaded successfully.");
    }
}
