package com.directi.training.dip.exercise;

import java.io.IOException;

public interface DataSource
{
    String read() throws IOException;
}
