package ru.nc.data;
public class User {
	private long ID;
	private String NAME;
	private long ID_LOCATION;
	private Sring PASSWORD;
	private boolean IS_ADMIN;
	
	public User(long uid, long idl){
		this.ID = uid;
		this.ID_LOCATION = idl;
		}
	public long getID(){
		return ID;
		}
	public long getID_LOCATION() {
		return ID_LOCATION;
		}
	}