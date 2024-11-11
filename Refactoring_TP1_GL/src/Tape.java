class Tape extends DomainObject{ 
	
 public Movie movie() { 
	 return _movie; 
 } 
 
 public Tape(String serialNumber, Movie movie) { 
	 set_serialNumber(serialNumber); 
	 _movie = movie; 
 } 
 
 
 public String get_serialNumber() {
	return _serialNumber;
}

public void set_serialNumber(String _serialNumber) {
	this._serialNumber = _serialNumber;
}


private String _serialNumber; 
 private Movie _movie; 
 }

