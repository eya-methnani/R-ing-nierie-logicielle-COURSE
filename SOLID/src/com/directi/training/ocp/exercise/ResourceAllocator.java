package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource)
    {
        return resource.allocate();
    }

    public void free(Resource resource, int resourceId)
    {
        resource.free(resourceId);
    }

	public static int getInvalidResourceId() {
		return INVALID_RESOURCE_ID;
	}
}
