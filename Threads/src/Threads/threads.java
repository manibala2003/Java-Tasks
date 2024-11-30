package Threads;

class VideoPlayback extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rendering video frame " + i);
            try {
                Thread.sleep(300); // Simulate time for rendering a frame
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AudioPlayback implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Playing audio chunk " + i);
            try {
                Thread.sleep(300); // Simulate time for playing an audio chunk
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threads {
    public static void main(String[] args) {
        Thread videoThread = new VideoPlayback();
        Thread audioThread = new Thread(new AudioPlayback());

        videoThread.start();
        audioThread.start();
    }
}
