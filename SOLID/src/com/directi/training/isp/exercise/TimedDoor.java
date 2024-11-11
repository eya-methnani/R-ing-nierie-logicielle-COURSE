package com.directi.training.isp.exercise;

public class TimedDoor implements Lockable, Openable, TimedDoorSensor
{
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
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
    public void timeOutCallback()
    {
        _locked = true;
    }

	public boolean is_opened() {
		return _opened;
	}

	public void set_opened(boolean _opened) {
		this._opened = _opened;
	}
}
