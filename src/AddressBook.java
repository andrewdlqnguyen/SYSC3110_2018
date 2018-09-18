import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyInfoList = new ArrayList<>();
	
	public AddressBook() {
		
	}
	
	public void addBuddy(BuddyInfo b) {		
		if(b != null) {
			buddyInfoList.add(b);			
		}
	}
	
	public void removeBuddy(int i) {
		if(i >= 0 && i < buddyInfoList.size()) {
			buddyInfoList.remove(i);			
		}
	}
	
	public static void main(String[] args) {
		
		BuddyInfo b = new BuddyInfo("Homer", "Cawthra Road", "516 777 8790");
		AddressBook a = new AddressBook();
		a.addBuddy(b);
		a.removeBuddy(0);
	}
}
