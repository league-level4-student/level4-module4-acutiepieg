package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		int counter = 0;
		int doctor = 0;
		for (int i = 0; i < patients.size(); i++) {
			System.out.println(i + " " + patients.get(i));
			if (counter < 3) {
				try {
					System.out.println("adding to doctor" + doctors.get(doctor).patientsAssigned.size());
					doctors.get(doctor).assignPatient(patients.get(i));
				} catch (DoctorFullException e) {
					e.printStackTrace();
				}
				counter++;
			} else {
				counter = 1;
				doctor++;
				try {
					System.out.println("adding to doctor" + doctors.get(doctor).patientsAssigned.size());
					doctors.get(doctor).assignPatient(patients.get(i));
				} catch (DoctorFullException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
