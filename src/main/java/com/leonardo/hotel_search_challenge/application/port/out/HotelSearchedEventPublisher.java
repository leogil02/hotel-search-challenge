package com.leonardo.hotel_search_challenge.application.port.out;

import com.leonardo.hotel_search_challenge.domain.event.HotelSearchedEvent;

public interface HotelSearchedEventPublisher {
    void publish(HotelSearchedEvent event);
}
