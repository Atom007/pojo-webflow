package cn.atom.webflow.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.atom.webflow.entity.Hotel;

@Service(value="bookingService")
public class BookingService {
	
	Logger logger = LoggerFactory.getLogger(BookingService.class);
	
	public Hotel findHotel(long hotelId){
		
		logger.info("hotelId:{}",hotelId);
		
		Hotel hotel = new Hotel();
		hotel.setId(123l);
		hotel.setName("noName");
		
		return hotel;
	}
	
}
