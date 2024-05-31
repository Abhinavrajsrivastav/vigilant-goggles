package Pollymorphism;

class MusicPlayer {
    public void play() {
        System.out.println("Playing music...");
    }
}

class MoviePlayer {
    public void play() {
        System.out.println("Playing movie...");
    }
}

class MediaController {
    private MusicPlayer musicPlayer;
    private MoviePlayer moviePlayer;

    public MediaController() {
        this.musicPlayer = new MusicPlayer();
        this.moviePlayer = new MoviePlayer();
    }

    public void playMusic() {
        musicPlayer.play();
    }

    public void playMovie() {
        moviePlayer.play();
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        MediaController mediaController = new MediaController();

        mediaController.playMusic(); // Playing music...
        mediaController.playMovie(); // Playing movie...
    }
}
