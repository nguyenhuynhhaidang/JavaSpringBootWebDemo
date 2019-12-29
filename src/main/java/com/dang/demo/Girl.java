package com.dang.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Girl {

    @Autowired
    Outfit outfit;

    public Girl(final Outfit outfit) {
        this.outfit = outfit;
    }

    public void wear() {
        System.out.println("Mặc abc");
    }
    // GET
    // SET
}
