package com.communitywebsite.service.serviceimpl;

import com.communitywebsite.dto.EventPostedDto;
import com.communitywebsite.model.EventEntity;
import com.communitywebsite.repository.EventRepository;
import com.communitywebsite.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;


//    @Override
//    public EventEntity postEvent() {
//        return null;
//    }

    @Override
    public EventPostedDto postEvent(EventPostedDto eventPostedDto){
        EventEntity eventEntity=new EventEntity();
        eventEntity.setEventDate(eventPostedDto.getEventDate());
        eventEntity.setEventName(eventPostedDto.getEventName());
        eventEntity.setEventDescription(eventPostedDto.getEventDiscription());
        eventEntity.setEventPosteddate(new Date());
        eventEntity=eventRepository.save(eventEntity);
        return eventEntity!=null ? eventPostedDto : null;
    }

    @Override
    public List<EventEntity> getAllEvent() {
        return findAllEvent();
    }

    private List<EventEntity> findAllEvent() {
        return eventRepository.findAll();
    }
}
