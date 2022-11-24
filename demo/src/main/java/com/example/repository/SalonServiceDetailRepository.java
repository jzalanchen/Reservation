package com.example.repository;

import com.example.entity.SalonServiceDetail;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class SalonServiceDetailRepository implements ObjectRepository<SalonServiceDetail>{
    private Map<Long, SalonServiceDetail> repository;

    public SalonServiceDetailRepository() {
        this.repository = new HashMap<>();
    }


    @Override
    public void store(SalonServiceDetail sd) {
        repository.put(sd.getId(), sd);
    }

    @Override
    public SalonServiceDetail retrieve(long id) {
        return repository.get(id);
    }

    @Override
    public SalonServiceDetail search(String name) {
        Collection<SalonServiceDetail> sds = repository.values();
        for(SalonServiceDetail sd: sds){
            if(sd.getName().equalsIgnoreCase(name))
                return sd;
        }
        return null;
    }

    @Override
    public SalonServiceDetail delete(long id) {
        SalonServiceDetail sd = repository.get(id);
        repository.remove(id);
        return sd;
     }
}
