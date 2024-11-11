package com.directi.training.dip.exercise;

import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        DataSource fileSource = new FileDataSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataDestination fileDestination = new FileDataDestination("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        
        EncodingModule fileEncodingModule = new EncodingModule(fileSource, fileDestination);
        fileEncodingModule.encode();
        
        DataSource networkSource = new NetworkDataSource(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        Database database = new MyDatabase();
        
        EncodingModule networkEncodingModule = new EncodingModule(networkSource, data -> database.save(data));
        networkEncodingModule.encode();
    }
}
