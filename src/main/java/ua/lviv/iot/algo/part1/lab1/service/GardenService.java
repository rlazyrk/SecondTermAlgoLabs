package ua.lviv.iot.algo.part1.lab1.service;

import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.models.BotanicGarden;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public final class GardenService {
    private Map<Integer, BotanicGarden> gardens = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();



    public void delete(final Integer id) {
        gardens.remove(id);
    }

    public BotanicGarden addBotanicGarden(final BotanicGarden garden) {
        garden.setId(idCounter.incrementAndGet());
        gardens.put(garden.getId(), garden);
        return garden;
    }
    

    public LinkedList<BotanicGarden> findAll() {
        List list = new LinkedList(gardens.values());
        return (LinkedList<BotanicGarden>) list;
    }

    public BotanicGarden findById(final Integer id) {
        return (BotanicGarden) gardens.get(id);
    }

    public void update(final Integer id, final BotanicGarden garden) {
        gardens.replace(id, garden);
    }

}
