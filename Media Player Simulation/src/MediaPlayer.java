
public interface MediaPlayer {

    /**
     * Plays the media with the given title
     * @param title The name/title of the media to play
     */
    void play(String title);

    /**
     * Pauses the currently playing media
     */
    void pause();

    /**
     * Stops the currently playing media
     */
    void stop();

    /**
     * Gets the current state of the player
     * @return String representing the player state (PLAYING, PAUSED, STOPPED)
     */
    String getState();

    /**
     * Gets the type of media player
     * @return String representing the player type
     */
    String getPlayerType();
}