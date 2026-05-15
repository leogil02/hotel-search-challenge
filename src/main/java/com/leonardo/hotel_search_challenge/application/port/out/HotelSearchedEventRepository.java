package com.leonardo.hotel_search_challenge.application.port.out;

import com.leonardo.hotel_search_challenge.domain.event.HotelSearchedEvent;
import com.leonardo.hotel_search_challenge.domain.model.HotelSearch;

import java.util.Optional;
import java.util.UUID;

public interface HotelSearchedEventRepository {
    void save(HotelSearchedEvent event);
    long countMatching(HotelSearch hotelSearch);
    Optional<HotelSearchedEvent> findById(UUID searchId);
}
