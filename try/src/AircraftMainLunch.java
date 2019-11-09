

import java.util.Scanner;

class Aircraft{
	protected String aircraftName;
	protected String source;
	protected String destination;
	
	public Aircraft() {
		
	}
	public Aircraft(String aircraftName,String source,String destination) {
		this.aircraftName=aircraftName;
		this.source=source;
		this.destination=destination;
	}
	
	
	public String getAircraftName() {
		return aircraftName;
	}
	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	void displayDetails() {
	
		System.out.println(getAircraftName());
		System.out.println(getSource());
		System.out.println(getDestination());
	}
}
class PulicAircraft extends Aircraft{
	private Boolean checkinbeforetwohours;
	private int noOfKgsallowed;
	private Float additionalFeeperkg;
	public PulicAircraft() {
		
	}
	
	
	public PulicAircraft(String aircraftName,String source,String destination,Boolean checkinbeforetwohours, int noOfKgsallowed, Float additionalFeeperkg) {
		super(aircraftName,source,destination);
		this.checkinbeforetwohours = checkinbeforetwohours;
		this.noOfKgsallowed = noOfKgsallowed;
		this.additionalFeeperkg = additionalFeeperkg;
	}


	public Boolean getCheckinbeforetwohours() {
		return checkinbeforetwohours;
	}


	public void setCheckinbeforetwohours(Boolean checkinbeforetwohours) {
		this.checkinbeforetwohours = checkinbeforetwohours;
	}


	public int getNoOfKgsallowed() {
		return noOfKgsallowed;
	}


	public void setNoOfKgsallowed(int noOfKgsallowed) {
		this.noOfKgsallowed = noOfKgsallowed;
	}


	public float getAdditionalFeeperkg() {
		return additionalFeeperkg;
	}


	public void setAdditionalFeeperkg(float additionalFeeperkg) {
		this.additionalFeeperkg = additionalFeeperkg;
	}


	
	void displayDetails() {
		super.displayDetails();
		System.out.println(getCheckinbeforetwohours());
		System.out.println(getNoOfKgsallowed());
		System.out.println(getAdditionalFeeperkg());
	}
	
	
}
class PrivateAircraft extends Aircraft{
	private Boolean checkinbeforetwohours;
	private String pilotPreference;
	private String purpose;
	
	
	
	public PrivateAircraft() {
		
	}
		
	public PrivateAircraft(String aircraftName,String source,String destination,Boolean checkinbeforetwohours, String pilotPreference, String purpose) {
		super(aircraftName,source,destination);
		this.checkinbeforetwohours = checkinbeforetwohours;
		this.pilotPreference = pilotPreference;
		this.purpose = purpose;
	}

	public Boolean getCheckinbeforetwohours() {
		return checkinbeforetwohours;
	}
	public void setCheckinbeforetwohours(Boolean checkinbeforetwohours) {
		this.checkinbeforetwohours = checkinbeforetwohours;
	}
	public String getPilotPreference() {
		return pilotPreference;
	}
	public void setPilotPreference(String pilotPreference) {
		this.pilotPreference = pilotPreference;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println(getCheckinbeforetwohours());
		System.out.println(getPilotPreference());
		System.out.println(getPurpose());
		
	}
}




public class AircraftMainLunch {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter the name of the Aircraft");
String aircraftName = sc.nextLine();
System.out.println("Enter the Source");
String source = sc.nextLine();
System.out.println("Enter the destination");
String destination = sc.nextLine();
System.out.println("Enter the type of Flight");
System.out.println("1:publicAircraft 2:privateAircraft");
int key=sc.nextInt();
switch(key) {
case 1:
	boolean checkinbeforetwohours = false;
	int noOfKgsallowed=0;
	float additionalFeeperkg=0;
	System.out.println("Is the flight check in before two hours");
	checkinbeforetwohours=sc.nextBoolean();
	//sc.nextLine();
	System.out.println("Enter the number of kgs allowed per person");
    noOfKgsallowed=sc.nextInt();
	System.out.println("Enter the additional fee charged for extra baggage per Kg");
	additionalFeeperkg=sc.nextFloat(); 
	PulicAircraft obj1=new PulicAircraft(aircraftName,source,destination,checkinbeforetwohours,noOfKgsallowed,additionalFeeperkg);
	obj1.displayDetails();
	
	break;
	
	
case 2:
	String pilotPreference=null;
	String purpose=null;
	boolean checkinbeforetwohours2 = false;
	System.out.println("Is the flight check in before two hours");
	checkinbeforetwohours=sc.nextBoolean();
	System.out.println("Enter the name of the pilot chose");
	pilotPreference=sc1.nextLine();
	System.out.println("Enter the Purpose of your flight");
	purpose=sc1.nextLine();
	PrivateAircraft obj=new PrivateAircraft(aircraftName,source,destination,checkinbeforetwohours2,pilotPreference,purpose);
	obj.displayDetails();
	
	break;
	default:
		System.out.println("invalid input!!!!");
		break;
}
		
		
	}

}
