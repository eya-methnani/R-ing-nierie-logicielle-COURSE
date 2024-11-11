package com.directi.training.ocp.exercise;

public class TimeSlotResource implements Resource
{
    @Override
    public int allocate()
    {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId)
    {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot()
    {
        // Logic to find a free time slot
        return 0;
    }

    private void markTimeSlotBusy(int resourceId)
    {
        // Logic to mark the time slot as busy
    }

    private void markTimeSlotFree(int resourceId)
    {
        // Logic to mark the time slot as free
    }
}
