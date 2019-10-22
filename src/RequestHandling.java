import java.util.Date;


public interface RequestHandling {

	public String removeFromInventory(String userId, Date requestDate, 
			String departmentId, String organizationId, String itemId, int qty,
			String reason, float price, int discountPercentage);
	
}
