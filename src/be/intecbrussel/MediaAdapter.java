package be.intecbrussel;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType.toLowerCase()) {
            case "mp4":
                this.advanceMediaPlayer = new Mp4Player();
                break;
            case "vlc":
                this.advanceMediaPlayer = new VlcPlayer();
                break;
        }
    }


    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media " + audioType + " is not supported");
        }


    }
}
