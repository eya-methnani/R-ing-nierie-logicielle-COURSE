package com.directi.training.dip.exercise;

import java.io.IOException;

public interface DataDestination
{
    void write(String data) throws IOException;
}
