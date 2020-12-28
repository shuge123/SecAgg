package edu.bjut.messages;

import java.util.ArrayList;

import edu.bjut.Shamir.SecretShareBigInteger;

public class RegBack3 {
	private ArrayList<SecretShareBigInteger> alKeys;

	public RegBack3(ArrayList<SecretShareBigInteger> alKeys) {
		super();
		this.alKeys = alKeys;
	}

	public ArrayList<SecretShareBigInteger> getAlKeys() {
		return alKeys;
	}

	public void setAlKeys(ArrayList<SecretShareBigInteger> alKeys) {
		this.alKeys = alKeys;
	}
}
