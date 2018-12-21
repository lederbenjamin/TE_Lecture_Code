package com.techelevator;

public class TestAuction {

	public static void main(String[] args) {
		
		//Auction regularAuction = new Auction("golf clubs");
		//boolean didIwin = regularAuction.placeBid(new Bid("Steve", 245));
			
		boolean didIwin = false;
		BuyoutAuction buyOut = new BuyoutAuction("guitar pedal", 25);	
		didIwin = buyOut.placeBid(new Bid("Steve", 10));
		didIwin = buyOut.placeBid(new Bid("Matt", 25));
		

	}

}
