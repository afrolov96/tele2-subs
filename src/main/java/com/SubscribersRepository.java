package com;

import com.bercut.specs.aoi.tele2.subscribercontrolbpel.HashMap;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class SubscribersRepository {
    private static final List<HashMap> subscribers = new ArrayList<>();

    @PostConstruct
    public void initData() {
        HashMap hashMap = new HashMap();

        subscribers.add(hashMap);
    }

    public HashMap findSubscriber(String name) {
        Assert.notNull(name);

        HashMap result = new HashMap();
        result.setName(name);
        result.setValue("testValue");

        for (HashMap hashMap : subscribers) {
            if (name.equals(hashMap.getName())) {
                result = hashMap;
            }
        }
        return result;
    }
}
