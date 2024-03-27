
// Interface representing a MediaPlayer
interface MediaPlayer {
    void play();
}

class MusicPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing music...");
    }
}

class MoviePlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing movie...");
    }
}

class MediaController {
    private MediaPlayer mediaPlayer;

    public MediaController(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void playMedia() {
        mediaPlayer.play();
    }
}

public class LC {
    public static void main(String[] args) {
        MediaPlayer musicPlayer = new MusicPlayer();
        MediaPlayer moviePlayer = new MoviePlayer();

        MediaController musicController = new MediaController(musicPlayer);
        MediaController movieController = new MediaController(moviePlayer);

        musicController.playMedia(); // Playing music...
        movieController.playMedia(); // Playing movie...
    }
}
