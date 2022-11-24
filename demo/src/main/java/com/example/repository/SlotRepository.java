package com.example.repository;

import com.example.entity.SalonServiceDetail;
import com.example.entity.Slot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SlotRepository implements ObjectRepository<Slot >{
    private Map<Long, Slot> repository;

    public SlotRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public void store(Slot slot) {
        repository.put(slot.getId(), slot);
    }

    @Override
    public Slot retrieve(long id) {

        return this.repository.get(id);
    }

    @Override
    public Slot search(String name) {
        Collection<Slot> sds = repository.values();
        for(Slot sd: sds){
            if(sd.getStylistName().equalsIgnoreCase(name))
                return sd;
        }
        return null;
    }

    @Override
    public Slot delete(long id) {
        Slot sd = repository.get(id);
        repository.remove(id);
        return sd;
    }
}
