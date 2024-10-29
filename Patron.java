import java.util.ArrayList;
import java.util.List;

public class Patron {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected List<LibraryItem> borrowedItems;

    public Patron(String name, String address, String phoneNumber) {
        this.name = name; 
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    // Patron Getters
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    // Patron Setters
    public void setAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Must Fill Address.");
        }
        this.address = address;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Must Fill Name.");
        }
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Must Fill Phone Number.");
        }
        this.phoneNumber = phoneNumber;
    }
    public void setBorrowedItems(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Must Fill Borrowed Items.");
        }
        this.borrowedItems.add(item);
    }

    public void borrowItem(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        this.borrowedItems.add(item);
        System.out.println("Item borrowed: " + item.getTitle());
    }
}