/**
 * Created by anjalimalik on 4/21/17.
 */
public class Piano extends StringInstrument{

    private String key;
    public Piano(String musicianName, int numStrings, String key) {
        super(musicianName, numStrings);
        this.key = key;
    }
    public String getKey(){
        return this.key;
    }
    public void play(String song){
        System.out.println(getMusicianName() + " is playing " + song + " on a " + getNumStrings() + " string piano in the key of " + getKey() + ".");
    }
}
