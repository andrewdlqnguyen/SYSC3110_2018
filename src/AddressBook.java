import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<BuddyInfo> buddyInfoList;
	
	public AddressBook() {
		this.buddyInfoList = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo b) {		
		if(b != null) {
			this.buddyInfoList.add(b);			
		}
	}
	
	public BuddyInfo removeBuddy(int i) {
		if(i >= 0 && i < buddyInfoList.size()) {
			return this.buddyInfoList.remove(i);			
		}
		return null;
	}
	
	public static void main(String[] args) {
		BuddyInfo b = new BuddyInfo("Homer", "Cawthra Road", "516 777 8790");
		AddressBook a = new AddressBook();
		a.addBuddy(b);
		a.removeBuddy(0);
	}
}
