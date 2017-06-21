/**
 * Created by anjalimalik on 4/21/17.
 */
public class Saxophone extends WoodwindInstrument{
    public Saxophone(String musicianName) {
        super(musicianName, WoodwindType.REED);
    }
    public void play(String song) {
        System.out.println(getMusicianName() + " is playing " + song + " on a saxophone, " + "a " + WoodwindType.REED + " type woodwind.");
    }
}
