package com.day6.Q1;

class FileDownloader implements Runnable {
    private final String fileUrl;

    public FileDownloader(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public void run() {
        System.out.println("Started " + Thread.currentThread().getName() + " Downloading the file :" + fileUrl);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " All files has been downloaded sucessfully :" + fileUrl);
    }
}
