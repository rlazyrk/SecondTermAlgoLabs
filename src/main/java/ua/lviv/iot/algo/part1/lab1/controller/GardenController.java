package ua.lviv.iot.algo.part1.lab1.controller;


import org.springframework.beans.factory.annotation.Autowired;
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


import java.util.List;

@RestController
@RequestMapping("/gardens")
public final class GardenController {
    private GardenService service;

    @Autowired
    public GardenController() {
        this.service = GardenService.getInstance();
    }

    @GetMapping(path = "/{id}")
    public BotanicGarden getBotanicGarden(@PathVariable("id") final Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public BotanicGarden createBotanicGarden(@RequestBody final BotanicGarden garden) {
        return service.addBotanicGarden(garden);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<BotanicGarden> deleteBotanicGarden(@PathVariable final Integer id) {
        if (service.findById(id) != null) {
            service.deleteBotanicGarden(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping
    public List<BotanicGarden> getGardens() {
        return service.allGardens();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity updateGarden(@PathVariable("id") final Integer id,
                                       final @RequestBody BotanicGarden garden) {
        if (service.findById(id) != null) {
            service.replaceBotanicGarden(id, garden);
            service.changeId(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
