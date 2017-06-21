/**
 * Created by anjalimalik 
 */
public class Flute extends WoodwindInstrument{

    public Flute (String musicianName){
        super(musicianName, WoodwindType.FLUTE);
    }

    public void play(String song){
        System.out.println(getMusicianName() + " is playing " + song + " on a flute, " + "a " + WoodwindType.FLUTE + " type woodwind.");
    }
}
