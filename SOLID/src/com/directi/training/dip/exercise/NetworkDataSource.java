package com.directi.training.dip.exercise;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;

public class NetworkDataSource implements DataSource
{
    private final URL url;

    public NetworkDataSource(URL url)
    {
        this.url = url;
    }

    @Override
    public String read() throws IOException
    {
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            inputString.append((char) c);
        }
        reader.close();
        return inputString.toString();
    }
}
