public class Heure {

	
	private int heures = 0 ;
	private int minutes = 0 ;
	
	public Heure() {
		super() ;
	}

	public Heure( int heures ) {
		super() ;
		this.heures = heures ;
	}

	public Heure( int heures , int minutes ) {
		super() ;
		this.heures = heures ;
		this.minutes = minutes ;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures( int heures ) {
		this.heures = heures ;
	}

	public int getMinutes() {
		return minutes ;
	}

	public void setMinutes( int minutes ) {
		this.minutes = minutes ;
	}

	@Override
	public String toString() {
		return String.format( "%02d:%02d", heures , minutes ) ;
	}
}
