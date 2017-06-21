/**
 * Created by anjalimalik on 4/21/17.
 */
public class Flute extends WoodwindInstrument{

    public Flute (String musicianName){
        super(musicianName, WoodwindType.FLUTE);
    }

    public void play(String song){
        System.out.println(getMusicianName() + " is playing " + song + " on a flute, " + "a " + WoodwindType.FLUTE + " type woodwind.");
    }
}
