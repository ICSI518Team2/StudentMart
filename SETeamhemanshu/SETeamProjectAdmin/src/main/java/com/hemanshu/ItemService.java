/*package com.hemanshu;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ItemService {

private static ItemsRepository itemsRepository;
	
	public ItemService(ItemsRepository itemsRepository) {
		this.itemsRepository=itemsRepository;
	}
	
	
	
	public static List<Items> showAllItems(){
		List<Items> items = new ArrayList<Items>();
		for(Items item : itemsRepository.findAll()) {		
			items.add(item); }
		return items;
	}
	
	public void deleteMyItem(int id) {
		itemsRepository.deleteById(id);
	}
	
	
	public Items findByItemID(String ItemID) {
		return itemsRepository.findByItemID(ItemID);
	}



	public static void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
*/