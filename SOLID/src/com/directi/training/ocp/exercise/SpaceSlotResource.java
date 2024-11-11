package com.directi.training.ocp.exercise;

public class SpaceSlotResource implements Resource
{
    @Override
    public int allocate()
    {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId)
    {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot()
    {
        // Logic to find a free space slot
        return 0;
    }

    private void markSpaceSlotBusy(int resourceId)
    {
        // Logic to mark the space slot as busy
    }

    private void markSpaceSlotFree(int resourceId)
    {
        // Logic to mark the space slot as free
    }
}
