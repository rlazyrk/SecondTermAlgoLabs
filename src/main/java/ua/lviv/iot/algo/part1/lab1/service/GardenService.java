package ua.lviv.iot.algo.part1.lab1.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.models.BotanicGarden;
import ua.lviv.iot.algo.part1.lab1.models.Garden;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Service
public final class GardenService {
    private Map<Integer, Garden> gardens = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    public void deleteBotanicGarden(final Integer id) {
        gardens.remove(id);
    }

    public BotanicGarden addBotanicGarden(final BotanicGarden garden) {
        garden.setId(idCounter.incrementAndGet());
        gardens.put(garden.getId(), garden);
        return garden;
    }
}
