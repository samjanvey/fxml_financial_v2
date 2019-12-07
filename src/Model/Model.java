package Model;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Model
{    
    SerializedDataCollection sdc;
    
    public Model() throws JAXBException, FileNotFoundException {
        sdc = new SerializedDataCollection();
    }

    public SerializedDataCollection getSdc() {
        return sdc;
    }

    public void setSdc(SerializedDataCollection sdc) {
        this.sdc = sdc;
    }
}