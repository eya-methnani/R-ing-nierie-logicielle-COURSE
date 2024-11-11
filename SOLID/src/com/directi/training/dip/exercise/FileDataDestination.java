package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataDestination implements DataDestination
{
    private String filePath;

    public FileDataDestination(String filePath)
    {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(data);
        writer.close();
    }
}
