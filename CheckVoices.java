import com.sun.speech.freetts.*;

public class CheckVoices {
    public static void main(String[] args) {
        System.out.println("Available voices:");
        Voice[] voices = VoiceManager.getInstance().getVoices();
        for (Voice voice : voices) {
            System.out.println(" - " + voice.getName());
        }
    }
}
