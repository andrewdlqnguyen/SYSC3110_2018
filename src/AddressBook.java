import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyInfoList = new ArrayList<>();
	
	public void addBuddy(BuddyInfo b) {
		buddyInfoList.add(b);
	}
	
	public void removeBuddy(BuddyInfo b) {
		buddyInfoList.remove(b);
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
	}
}
