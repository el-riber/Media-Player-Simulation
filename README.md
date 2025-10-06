# Media Player Simulation

A Java-based simulation demonstrating interface implementation and polymorphism through various media player types.

## 📋 Project Overview

This project implements a modular media player system using Java interfaces. It demonstrates object-oriented programming principles including:
- Interface-based design
- Polymorphism
- Inheritance
- Encapsulation

## 🏗️ Architecture

### Interface
- **MediaPlayer**: Defines the contract for all media player implementations
  - `play(String title)`: Plays media with the specified title
  - `pause()`: Pauses the currently playing media
  - `stop()`: Stops the media playback
  - `getState()`: Returns the current player state
  - `getPlayerType()`: Returns the player type information

### Implementations

1. **AudioPlayer**
   - Supports audio formats (MP3, WAV, FLAC)
   - Displays audio-specific information
   - Validates input before playing

2. **VideoPlayer**
   - Supports video playback with resolution settings
   - Extra feature: Subtitle toggling
   - Handles video-specific states

3. **StreamingPlayer**
   - Simulates online streaming
   - Extra feature: Buffer status checking
   - Platform-specific messaging

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line or IDE (IntelliJ IDEA, Eclipse, VS Code)

### Compilation
```bash
javac MediaPlayer.java
javac AudioPlayer.java
javac VideoPlayer.java
javac StreamingPlayer.java
javac MediaPlayerDemo.java
```

### Execution
```bash
java MediaPlayerDemo
```

## 🧪 Test Cases

The demo includes 9 comprehensive test cases:

### Normal Cases (3)
1. **AudioPlayer Normal Usage**: Play → Pause → Resume → Stop
2. **VideoPlayer Normal Usage**: Play with subtitle toggle → Pause → Resume → Stop
3. **StreamingPlayer Normal Usage**: Stream → Check buffer → Pause → Resume → Stop

### Edge Cases (6)
4. **Null/Empty Title**: Tests input validation
5. **Pause Without Playing**: Tests state validation
6. **Stop When Already Stopped**: Tests redundant operations
7. **Polymorphism**: Tests interface usage with array of players
8. **Sequential Operations**: Tests multiple play/stop cycles
9. **Multiple Pauses**: Tests repeated pause operations

## ✨ Extra Credit Features

### Implemented Enhancements (5% Extra Credit Eligible)

1. **Extended Interface Methods**
   - `getState()`: Tracks and returns player state (PLAYING, PAUSED, STOPPED)
   - `getPlayerType()`: Returns detailed player information

2. **State Management**
   - Comprehensive state tracking across all operations
   - Error handling for invalid state transitions
   - Prevents operations when not in correct state

3. **Input Validation**
   - Null checking for media titles
   - Empty string detection
   - Whitespace-only title validation

4. **Player-Specific Features**
   - **VideoPlayer**: `toggleSubtitles()` - Controls subtitle display
   - **StreamingPlayer**: `checkBuffer()` - Displays buffer status
   - **AudioPlayer**: Format-specific quality indicators

5. **Enhanced User Experience**
   - Emoji icons for visual clarity (🎵 🎬 📡 ⏸️ ⏹️ ▶️)
   - Detailed status messages
   - Formatted output with clear sections
   - Professional console presentation with borders

6. **Advanced Testing**
   - 9 comprehensive test cases (3 normal + 6 edge cases)
   - Polymorphism demonstration
   - State transition testing
   - Error condition coverage

### Why These Features are Substantial

- **Robustness**: Input validation prevents crashes and provides user feedback
- **Maintainability**: State management ensures consistent behavior
- **Extensibility**: Additional methods in interface support future enhancements
- **User Experience**: Clear visual feedback improves usability
- **Testing**: Comprehensive test coverage ensures reliability

## 📁 Project Structure

```
media-player-simulation/
├── MediaPlayer.java          # Interface definition
├── AudioPlayer.java          # Audio player implementation
├── VideoPlayer.java          # Video player implementation
├── StreamingPlayer.java      # Streaming player implementation
├── MediaPlayerDemo.java      # Main demo/test class
└── README.md                 # This file
```

## 🎯 Learning Outcomes

This project demonstrates:
- How interfaces enable polymorphic behavior
- Benefits of interface-based design for scalability
- Importance of state management in applications
- Value of comprehensive testing
- Professional code documentation practices

## 👨‍💻 Author

[Your Name]
[Your Student ID]
[Course Name]
[Date]

## 📝 License

This project is submitted as coursework for [Course Name].
