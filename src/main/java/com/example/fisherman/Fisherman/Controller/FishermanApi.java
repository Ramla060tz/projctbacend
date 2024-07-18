package com.example.fisherman.Fisherman.Controller;

import com.example.fisherman.Fisherman.Model.Fisherman;
import com.example.fisherman.Fisherman.Service.FishermanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/fishers")
@CrossOrigin(origins = "http://localhost:3000")
public class FishermanApi {

    @Autowired
    private FishermanService fishermanService;

    @PostMapping
    public Fisherman post(@RequestBody Fisherman fisherman) {
        return fishermanService.post(fisherman);
    }

    @GetMapping
    public List<Fisherman> getAllFisherman() {
        return fishermanService.getFishermen();
    }

    @GetMapping("/{id}")
    public Optional<Fisherman> getById(@PathVariable Long id) {
        return fishermanService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        fishermanService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Fisherman updateFisherman(@PathVariable long id, @RequestBody Fisherman fisherman) {
        return fishermanService.updateFisherman(id, fisherman);
    }


}
