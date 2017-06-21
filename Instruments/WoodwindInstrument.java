/**
 * Created by anjalimalik on 4/21/17.
 */
public abstract class WoodwindInstrument extends Instrument{

    private WoodwindType type;
    public WoodwindInstrument(String musicianName, WoodwindType type){
        super(musicianName);
        this.type = type;
    }


    public String getType(){

        if(type == WoodwindType.FLUTE)
            return "FLUTE";
        else if (type == WoodwindType.REED)
            return "REED";
        else
            return null;
    }

}
