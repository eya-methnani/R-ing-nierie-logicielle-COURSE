package com.directi.training.isp.exercise;

public class SensingDoor implements Lockable, Openable, ProximitySensor
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            set_opened(true);
        }
    }

    @Override
    public void close()
    {
        set_opened(false);
    }

    @Override
    public void proximityCallback()
    {
        set_opened(true);
    }

	public boolean is_opened() {
		return _opened;
	}

	public void set_opened(boolean _opened) {
		this._opened = _opened;
	}
}
