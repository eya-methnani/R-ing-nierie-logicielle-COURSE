package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule
{
    private final DataSource source;
    private final DataDestination destination;

    public EncodingModule(DataSource source, DataDestination destination)
    {
        this.source = source;
        this.destination = destination;
    }

    public void encode() throws IOException
    {
        String data = source.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        destination.write(encodedData);
    }
}
