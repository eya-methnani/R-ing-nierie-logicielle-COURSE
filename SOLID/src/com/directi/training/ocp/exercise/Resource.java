package com.directi.training.ocp.exercise;

public interface Resource
{
    int allocate();
    void free(int resourceId);
}
