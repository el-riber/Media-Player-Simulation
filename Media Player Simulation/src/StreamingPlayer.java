
public class StreamingPlayer implements MediaPlayer {

    private String currentTitle;
    private String state;
    private String platform;
    private int bufferPercentage;

    /**
     * Constructor for StreamingPlayer
     * @param platform The streaming platform name (e.g., "Netflix", "Spotify")
     */
    public StreamingPlayer(String platform) {
        this.platform = platform;
        this.state = "STOPPED";
        this.currentTitle = "";
        this.bufferPercentage = 0;
    }

    @Override
    public void play(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println(" Error: Cannot stream - no title provided");
            return;
        }
        this.currentTitle = title;
        this.bufferPercentage = 100;
        this.state = "PLAYING";
        System.out.println("📡 StreamingPlayer: Streaming '" + title + "' from " + platform);
        System.out.println("   [ PLAYING] Buffer: " + bufferPercentage + "% | Connection: Stable");
    }

    @Override
    public void pause() {
        if (!state.equals("PLAYING")) {
            System.out.println("  StreamingPlayer: Cannot pause - not currently streaming");
            return;
        }
        this.state = "PAUSED";
        System.out.println(" StreamingPlayer: Paused stream '" + currentTitle + "'");
        System.out.println("   [BUFFERING] Maintaining connection...");
    }

    @Override
    public void stop() {
        if (state.equals("STOPPED")) {
            System.out.println(" StreamingPlayer: Already stopped");
            return;
        }
        this.state = "STOPPED";
        System.out.println(" StreamingPlayer: Stopped streaming '" + currentTitle + "'");
        System.out.println("   [DISCONNECTED] Stream ended");
        this.currentTitle = "";
        this.bufferPercentage = 0;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getPlayerType() {
        return "StreamingPlayer (" + platform + ")";
    }

    public void checkBuffer() {
        if (state.equals("PLAYING") || state.equals("PAUSED")) {
            System.out.println(" Buffer Status: " + bufferPercentage + "%");
        } else {
            System.out.println(" Not currently streaming");
        }
    }
}