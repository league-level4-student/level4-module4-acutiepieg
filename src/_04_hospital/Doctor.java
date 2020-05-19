package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital {
	ArrayList<Patient> patientsAssigned = new ArrayList<Patient>();

	public Doctor() {
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public boolean performsSurgery() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patientsAssigned.size() > 3) {
			throw new DoctorFullException();
		} else {
			patientsAssigned.add(patient);
		}
	}

	public ArrayList<Patient> getPatients() {
		return patientsAssigned;
	}

	public void doMedicine() {
		for (Patient p : patientsAssigned) {
			p.checkPulse();
		}

	}

}
