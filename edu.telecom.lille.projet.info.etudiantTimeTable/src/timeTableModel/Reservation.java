/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Reservation.
 * 
 * @author gbarois
 */
public class Reservation {
	/**
	 * Description of the property LoginProf.
	 */
	public int LoginProf = 0;

	/**
	 * Description of the property NumeroResa.
	 */
	public int NumeroResa = 0;

	/**
	 * Description of the property DateDebut.
	 */
	public int DateDebut = 0;

	/**
	 * Description of the property SalleID.
	 */
	public int SalleID = 0;

	/**
	 * Description of the property salles.
	 */
	public HashSet<Salle> salles = new HashSet<Salle>();

	/**
	 * Description of the property DateFin.
	 */
	public int DateFin = 0;

	/**
	 * Description of the property timeTables.
	 */
	public HashSet<TimeTable> timeTables = new HashSet<TimeTable>();

	// Start of user code (user defined attributes for Reservation)

	// End of user code

	// Start of user code (user defined methods for Reservation)

	// End of user code
	/**
	 * Returns LoginProf.
	 * @return LoginProf 
	 */
	public int getLoginProf() {
		return this.LoginProf;
	}

	/**
	 * Sets a value to attribute LoginProf. 
	 * @param newLoginProf 
	 */
	public void setLoginProf(int newLoginProf) {
		this.LoginProf = newLoginProf;
	}

	/**
	 * Returns NumeroResa.
	 * @return NumeroResa 
	 */
	public int getNumeroResa() {
		return this.NumeroResa;
	}

	/**
	 * Sets a value to attribute NumeroResa. 
	 * @param newNumeroResa 
	 */
	public void setNumeroResa(int newNumeroResa) {
		this.NumeroResa = newNumeroResa;
	}

	/**
	 * Returns DateDebut.
	 * @return DateDebut 
	 */
	public int getDateDebut() {
		return this.DateDebut;
	}

	/**
	 * Sets a value to attribute DateDebut. 
	 * @param newDateDebut 
	 */
	public void setDateDebut(int newDateDebut) {
		this.DateDebut = newDateDebut;
	}

	/**
	 * Returns SalleID.
	 * @return SalleID 
	 */
	public int getSalleID() {
		return this.SalleID;
	}

	/**
	 * Sets a value to attribute SalleID. 
	 * @param newSalleID 
	 */
	public void setSalleID(int newSalleID) {
		this.SalleID = newSalleID;
	}

	/**
	 * Returns salles.
	 * @return salles 
	 */
	public HashSet<Salle> getSalles() {
		return this.salles;
	}

	/**
	 * Returns DateFin.
	 * @return DateFin 
	 */
	public int getDateFin() {
		return this.DateFin;
	}

	/**
	 * Sets a value to attribute DateFin. 
	 * @param newDateFin 
	 */
	public void setDateFin(int newDateFin) {
		this.DateFin = newDateFin;
	}

	/**
	 * Returns timeTables.
	 * @return timeTables 
	 */
	public HashSet<TimeTable> getTimeTables() {
		return this.timeTables;
	}

}
