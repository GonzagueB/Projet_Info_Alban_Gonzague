/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of TimeTable.
 * 
 * @author gbarois
 */
public class TimeTable {
	/**
	 * Description of the property timeTableDBs.
	 */
	
	ArrayList<Reservation> listReservation = new listArray<Reservation>;
	
	public HashSet<TimeTableDB> timeTableDBs = new HashSet<TimeTableDB>();

	/**
	 * Description of the property TimeTableID.
	 */
	public Int TimeTableID = null;

	// Start of user code (user defined attributes for TimeTable)

	// End of user code

	/**
	 * The constructor.
	 */
	public TimeTable() {
		// Start of user code constructor for TimeTable)
		super();
		// End of user code
	}

	/**
	 * Description of the method AddReservation.
	 */
	public void AddReservation() {
		// Start of user code for method AddReservation
		// End of user code
	}

	/**
	 * Description of the method DeleteReservation.
	 */
	public void DeleteReservation() {
		// Start of user code for method DeleteReservation
		// End of user code
	}

	/**
	 * Description of the method TTID.
	 * @param TimeTableID 
	 */
	public void TTID(Integer TimeTableID) {
		// Start of user code for method TTID
		// End of user code
	}

	// Start of user code (user defined methods for TimeTable)

	// End of user code
	/**
	 * Returns timeTableDBs.
	 * @return timeTableDBs 
	 */
	public TimeTableDB getTimeTableDBs() {
		return this.timeTableDBs;
	}

	/**
	 * Returns TimeTableID.
	 * @return TimeTableID 
	 */
	public Int getTimeTableID() {
		return this.TimeTableID;
	}

	/**
	 * Sets a value to attribute TimeTableID. 
	 * @param newTimeTableID 
	 */
	public void setTimeTableID(Int newTimeTableID) {
		this.TimeTableID = newTimeTableID;
	}

}
