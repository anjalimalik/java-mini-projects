/**
 * Created by anjalimalik
 */
public class Violin extends StringInstrument{

    public Violin(String musicianName) {
        super(musicianName, 4);
    }

    public void play(String song){
        System.out.println(getMusicianName() + " is playing " + song + " on a " + getNumStrings() + " string violin.");
    }
}
