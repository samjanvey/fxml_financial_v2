package Model;

import java.io.IOException;

public class Model
{    
    SerializedDataCollection sdc;
    
    public Model() {
        sdc = new SerializedDataCollection();
    }

    public SerializedDataCollection getSdc() {
        return sdc;
    }

    public void setSdc(SerializedDataCollection sdc) {
        this.sdc = sdc;
    }
}