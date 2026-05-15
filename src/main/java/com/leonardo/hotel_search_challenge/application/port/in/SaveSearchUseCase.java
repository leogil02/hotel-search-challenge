package com.leonardo.hotel_search_challenge.application.port.in;

import com.leonardo.hotel_search_challenge.domain.event.HotelSearchedEvent;

public interface SaveSearchUseCase {
    void save(HotelSearchedEvent event);
}
