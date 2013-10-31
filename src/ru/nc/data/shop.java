package ru.nc.data;
public class Shop {
private long ID_SHOP;
private String SHOP_NAME;
private long ID_LOCATION;
private boolean WORKING;

public Shop(long ids, long idl) {
	this.ID_SHOP=ids;
	this.ID_LOCATION=idl;
	}
public long getID_SHOP() {
	return ID_SHOP;
	}
public long getID_LOCATION() {
	return ID_LOCATION;
	}
}