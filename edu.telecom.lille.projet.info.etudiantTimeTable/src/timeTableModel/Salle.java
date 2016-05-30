/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Salle.
 * 
 * @author gbarois
 */
public class Salle {
	
	/**
	 * Description of the property NbPlaces.
	 */
	private int NbPlaces = 0;

	/**
	 * Description of the property timeTableDBs.
	 */
	public TimeTableDB timeTableDBs = new TimeTableDB();

	/**
	 * Description of the property SalleID.
	 */
	private int SalleID = 0;

	// Start of user code (user defined attributes for Salle)

	// End of user code

	// Start of user code (user defined methods for Salle)

	// End of user code
	/**
	 * Returns NbPlaces.
	 * @return NbPlaces 
	 */
	public int getNbPlaces() {
		return this.NbPlaces;
	}

	/**
	 * Sets a value to attribute NbPlaces. 
	 * @param newNbPlaces 
	 */
	public void setNbPlaces(int newNbPlaces) {
		this.NbPlaces = newNbPlaces;
	}

	/**
	 * Returns timeTableDBs.
	 * @return timeTableDBs 
	 */
	public TimeTableDB getTimeTableDBs() {
		return this.timeTableDBs;
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

}
