package Model;

import java.util.ArrayList;

public class Model
{    
    SerializedDataCollection serializedDataCollection;
    
    public Model()
    {
        serializedDataCollection = new SerializedDataCollection();
    }

    public SerializedDataCollection getSerializedDataCollection() {
        return serializedDataCollection;
    }

    public void setSerializedDataCollection(SerializedDataCollection serializedDataCollection) {
        this.serializedDataCollection = serializedDataCollection;
    }
}