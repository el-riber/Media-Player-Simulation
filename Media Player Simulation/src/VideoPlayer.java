
public class VideoPlayer implements MediaPlayer {

    private String currentTitle;
    private String state;
    private String resolution;
    private boolean subtitlesEnabled;

    /**
     * Constructor for VideoPlayer
     * @param resolution The video resolution (e.g., "1080p", "4K")
     */
    public VideoPlayer(String resolution) {
        this.resolution = resolution;
        this.state = "STOPPED";
        this.currentTitle = "";
        this.subtitlesEnabled = false;
    }

    @Override
    public void play(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println(" Error: Cannot play video - no title provided");
            return;
        }
        this.currentTitle = title;
        this.state = "PLAYING";
        System.out.println("🎬 VideoPlayer: Now playing video '" + title + "' in " + resolution + " resolution");
        System.out.println("   [ PLAYING] Video with " + (subtitlesEnabled ? "subtitles ON" : "subtitles OFF"));
    }

    @Override
    public void pause() {
        if (!state.equals("PLAYING")) {
            System.out.println(" VideoPlayer: Cannot pause - not currently playing");
            return;
        }
        this.state = "PAUSED";
        System.out.println("  VideoPlayer: Paused video '" + currentTitle + "'");
    }

    @Override
    public void stop() {
        if (state.equals("STOPPED")) {
            System.out.println("  VideoPlayer: Already stopped");
            return;
        }
        this.state = "STOPPED";
        System.out.println(" VideoPlayer: Stopped playing '" + currentTitle + "'");
        this.currentTitle = "";
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getPlayerType() {
        return "VideoPlayer (" + resolution + ")";
    }

    /**
     * Toggles subtitle display
     * Extra feature for VideoPlayer
     */
    public void toggleSubtitles() {
        this.subtitlesEnabled = !this.subtitlesEnabled;
        System.out.println("Subtitles " + (subtitlesEnabled ? "enabled" : "disabled"));
    }
}