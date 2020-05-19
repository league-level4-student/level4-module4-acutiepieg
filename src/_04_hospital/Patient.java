package _04_hospital;

public class Patient extends Hospital {

	private boolean pulseChecked = false;
	
	public void checkPulse() {
		pulseChecked = true;
	}

	public boolean feelsCaredFor() {
		return pulseChecked;
	}
	
	

}
