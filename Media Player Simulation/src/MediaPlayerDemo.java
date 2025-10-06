
public class MediaPlayerDemo {

    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("        MEDIA PLAYER SIMULATION DEMONSTRATION          ");
        System.out.println("═══════════════════════════════════════════════════════\n");

        // Create instances of different media players
        MediaPlayer audioPlayer = new AudioPlayer("MP3");
        MediaPlayer videoPlayer = new VideoPlayer("4K");
        MediaPlayer streamingPlayer = new StreamingPlayer("Spotify");

        // Test Case 1: Normal AudioPlayer usage
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 1: AudioPlayer - Normal Usage            ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        audioPlayer.play("Bohemian Rhapsody");
        System.out.println("State: " + audioPlayer.getState());
        audioPlayer.pause();
        System.out.println("State: " + audioPlayer.getState());
        audioPlayer.play("Bohemian Rhapsody"); // Resume
        audioPlayer.stop();
        System.out.println("State: " + audioPlayer.getState());

        // Test Case 2: Normal VideoPlayer usage
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 2: VideoPlayer - Normal Usage            ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        videoPlayer.play("The Matrix");
        ((VideoPlayer) videoPlayer).toggleSubtitles(); // Extra feature
        videoPlayer.pause();
        videoPlayer.play("The Matrix"); // Resume
        videoPlayer.stop();

        // Test Case 3: Normal StreamingPlayer usage
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 3: StreamingPlayer - Normal Usage        ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        streamingPlayer.play("Stranger Things S01E01");
        ((StreamingPlayer) streamingPlayer).checkBuffer(); // Extra feature
        streamingPlayer.pause();
        streamingPlayer.play("Stranger Things S01E01"); // Resume
        streamingPlayer.stop();

        // Test Case 4: Edge Case - Playing with null/empty title
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 4: Edge Case - Null/Empty Title          ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        audioPlayer.play(null);
        audioPlayer.play("");
        audioPlayer.play("   "); // Whitespace only

        // Test Case 5: Edge Case - Pause without playing
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 5: Edge Case - Pause Without Playing     ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        MediaPlayer newAudio = new AudioPlayer("WAV");
        newAudio.pause(); // Should show error message

        // Test Case 6: Edge Case - Stop when already stopped
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 6: Edge Case - Stop When Already Stopped ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        videoPlayer.stop(); // Already stopped from earlier

        // Test Case 7: Polymorphism demonstration
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 7: Polymorphism - Array of Players       ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        MediaPlayer[] players = {
                new AudioPlayer("FLAC"),
                new VideoPlayer("1080p"),
                new StreamingPlayer("YouTube")
        };

        String[] titles = {
                "Classical Symphony No. 5",
                "Documentary: Planet Earth",
                "Live Concert Stream"
        };

        for (int i = 0; i < players.length; i++) {
            System.out.println("\n→ Testing " + players[i].getPlayerType());
            players[i].play(titles[i]);
            players[i].pause();
            players[i].stop();
        }

        // Test Case 8: Sequential operations
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 8: Sequential Play Operations            ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        MediaPlayer sequentialPlayer = new StreamingPlayer("Netflix");
        sequentialPlayer.play("Movie A");
        sequentialPlayer.stop();
        sequentialPlayer.play("Movie B"); // Different title
        sequentialPlayer.stop();

        // Test Case 9: Multiple pauses
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║  TEST CASE 9: Edge Case - Multiple Pauses           ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        MediaPlayer multiPausePlayer = new VideoPlayer("720p");
        multiPausePlayer.play("Test Video");
        multiPausePlayer.pause();
        multiPausePlayer.pause(); // Pause again - should show error

        System.out.println("\n═══════════════════════════════════════════════════════");
        System.out.println("         ALL TEST CASES COMPLETED SUCCESSFULLY         ");
        System.out.println("═══════════════════════════════════════════════════════\n");
    }
}