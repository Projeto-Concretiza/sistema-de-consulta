package concretiza.models;

import java.util.ArrayList;
import concretiza.models.Agenda;
import concretiza.models.Package;
import java.util.Calendar;

public class Session {
	private int id;
	private Package actualPackage;
	private Agenda actualDate;
	private ArrayList <Package> relatedPackages;
	
	public Session() {
		Calendar newDate = Calendar.getInstance();
		this.actualDate = new Agenda(newDate.get(Calendar.HOUR),newDate.get(Calendar.MINUTE),
				newDate.get(Calendar.DATE),
				newDate.get(Calendar.MONTH),
				newDate.get(Calendar.YEAR));
		String actualId = (Integer.toString(this.id) + actualDate.getDay() + 
				actualDate.getMonth() + actualDate.getYear());
		
		this.actualPackage = new Package(actualId, actualDate);
	}
	
	public void setActualPackage(Package pack) {
		this.actualPackage = pack;
	}
	
	public Package getActualPackage() {
		return this.actualPackage;
	}
	
	
}
