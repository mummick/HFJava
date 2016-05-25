package DJChat;

import javax.sound.midi.*;

/**
 * Created by lab on 25.05.16.
 */
class MusicTest1 {
    void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("[OK] Got a sequencer");
        }
        catch (MidiUnavailableException ex)
        {
            System.out.println("[ERROR] Can't got a sequencer: " + ex.getMessage());
        }

    }
}
public class p318e1 {
    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
