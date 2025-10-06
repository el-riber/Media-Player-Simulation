
public class AudioPlayer implements MediaPlayer {

    private String currentTitle;
    private String state;
    private String format;

    /**
     * Constructor for AudioPlayer
     * @param format The audio format (e.g., "MP3", "WAV", "FLAC")
     */
    public AudioPlayer(String format) {
        this.format = format;
        this.state = "STOPPED";
        this.currentTitle = "";
    }

    @Override
    public void play(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println(" Error: Cannot play audio - no title provided");
            return;
        }
        this.currentTitle = title;
        this.state = "PLAYING";
        System.out.println(" AudioPlayer: Now playing audio '" + title + "' in " + format + " format");
        System.out.println("   [ PLAYING] Audio quality: High-fidelity " + format);
    }

    @Override
    public void pause() {
        if (!state.equals("PLAYING")) {
            System.out.println("  AudioPlayer: Cannot pause - not currently playing");
            return;
        }
        this.state = "PAUSED";
        System.out.println(" AudioPlayer: Paused '" + currentTitle + "'");
    }

    @Override
    public void stop() {
        if (state.equals("STOPPED")) {
            System.out.println(" AudioPlayer: Already stopped");
            return;
        }
        this.state = "STOPPED";
        System.out.println("  AudioPlayer: Stopped playing '" + currentTitle + "'");
        this.currentTitle = "";
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getPlayerType() {
        return "AudioPlayer (" + format + ")";
    }
}