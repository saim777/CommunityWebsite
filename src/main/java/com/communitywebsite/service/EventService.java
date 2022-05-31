package com.communitywebsite.service;

import com.communitywebsite.dto.EventPostedDto;
import com.communitywebsite.model.EventEntity;

import java.util.List;

public interface EventService {
   // EventEntity postEvent();

    EventPostedDto postEvent(EventPostedDto eventPostedDto);

    List<EventEntity> getAllEvent();
}
