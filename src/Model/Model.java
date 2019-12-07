package Model;

import java.util.ArrayList;

public class Model
{    
    private SerializedDataCollection sdc;
    
    public Model()
    {
        sdc = new SerializedDataCollection();
    }

    /**
     * @return the sdc
     */
    public SerializedDataCollection getSdc() {
        return sdc;
    }

    /**
     * @param sdc the sdc to set
     */
    public void setSdc(SerializedDataCollection sdc) {
        this.sdc = sdc;
    }

}