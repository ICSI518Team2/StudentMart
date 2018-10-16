/*package com.hemanshu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items {
 
	@Id
	private String ItemID;
	private int id;
	private String SellerID;
	private String ItemName;
	private float ItemPrice;
	private float ItemWeight;
	private float ItemCartDesc;
	private float ItemLongDesc;
	private int ItemCategoryID;
	private String ItemImageRef;
	private int ItemNumber;
	private int ItemSold;
	
	
	public Items(String sellerID, String itemName, float itemPrice, float itemWeight, float itemCartDesc,
			float itemLongDesc, int itemCategoryID, String itemImageRef, int itemNumber, int itemSold) {
		super();
		SellerID = sellerID;
		ItemName = itemName;
		ItemPrice = itemPrice;
		ItemWeight = itemWeight;
		ItemCartDesc = itemCartDesc;
		ItemLongDesc = itemLongDesc;
		ItemCategoryID = itemCategoryID;
		ItemImageRef = itemImageRef;
		ItemNumber = itemNumber;
		ItemSold = itemSold;
	}
	public String getItemID() {
		return ItemID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setItemID(String itemID) {
		this.ItemID = itemID;
	}
	public String getSellerID() {
		return SellerID;
	}
	public void setSellerID(String sellerID) {
		SellerID = sellerID;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public float getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(float itemPrice) {
		ItemPrice = itemPrice;
	}
	public float getItemWeight() {
		return ItemWeight;
	}
	public void setItemWeight(float itemWeight) {
		ItemWeight = itemWeight;
	}
	public float getItemCartDesc() {
		return ItemCartDesc;
	}
	public void setItemCartDesc(float itemCartDesc) {
		ItemCartDesc = itemCartDesc;
	}
	public float getItemLongDesc() {
		return ItemLongDesc;
	}
	public void setItemLongDesc(float itemLongDesc) {
		ItemLongDesc = itemLongDesc;
	}
	public int getItemCategoryID() {
		return ItemCategoryID;
	}
	public void setItemCategoryID(int itemCategoryID) {
		ItemCategoryID = itemCategoryID;
	}
	public String getItemImageRef() {
		return ItemImageRef;
	}
	public void setItemImageRef(String itemImageRef) {
		ItemImageRef = itemImageRef;
	}
	public int getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(int itemNumber) {
		ItemNumber = itemNumber;
	}
	public int getItemSold() {
		return ItemSold;
	}
	public void setItemSold(int itemSold) {
		ItemSold = itemSold;
	}
	@Override
	public String toString() {
		return "Items [ItemID=" + ItemID + ", id=" + id + ", SellerID=" + SellerID + ", ItemName=" + ItemName
				+ ", ItemPrice=" + ItemPrice + ", ItemWeight=" + ItemWeight + ", ItemCartDesc=" + ItemCartDesc
				+ ", ItemLongDesc=" + ItemLongDesc + ", ItemCategoryID=" + ItemCategoryID + ", ItemImageRef="
				+ ItemImageRef + ", ItemNumber=" + ItemNumber + ", ItemSold=" + ItemSold + "]";
	}
	
	




}*/