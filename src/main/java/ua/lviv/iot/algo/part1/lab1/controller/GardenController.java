package ua.lviv.iot.algo.part1.lab1.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import ua.lviv.iot.algo.part1.lab1.models.BotanicGarden;
import ua.lviv.iot.algo.part1.lab1.service.GardenService;


import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/gardens")
public final class GardenController {
    private GardenService service = new GardenService();

    @GetMapping(path = "/{id}")
    public BotanicGarden getBotanicGarden(@PathVariable("id") final Integer id) {
        return (BotanicGarden) service.getGardens().get(id);
    }

    @PostMapping
    public BotanicGarden createBotanicGarden(@RequestBody final BotanicGarden garden) {
        return service.addBotanicGarden(garden);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<BotanicGarden> deleteBotanicGarden(@PathVariable final Integer id) {
        HttpStatus status = service.getGardens().remove(id) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @GetMapping
    public List<BotanicGarden> getGardens() {
        List list = new LinkedList(service.getGardens().values());
        return list;
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity updateMethStone(@PathVariable("id") final Integer id,
                                          final @RequestBody BotanicGarden garden) {
        if (service.getGardens().containsKey(id)) {
            service.getGardens().replace(id, garden);
            service.getGardens().get(id).setId(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
