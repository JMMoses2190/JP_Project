public class AudioPlayerDriver {

  public static void testAudioPlayer() {

    AudioPlayer audioPlayer = new AudioPlayer("Audio Name", "Specification");
    audioPlayer.setProductionNumber(1);
    audioPlayer.stop();
    System.out.println(audioPlayer);
  }

}
