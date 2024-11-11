package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements Database
{
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public void save(String inputString)
    {
        _data.put(++_count, inputString);
    }
}
