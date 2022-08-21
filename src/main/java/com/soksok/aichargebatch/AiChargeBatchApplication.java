package com.soksok.aichargebatch;

import com.soksok.aichargebatch.address.service.AddressAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AiChargeBatchApplication implements CommandLineRunner {

    private final AddressAnalyzerService addressAnalyzerService;

    public AiChargeBatchApplication(AddressAnalyzerService addressAnalyzerService) {
        this.addressAnalyzerService = addressAnalyzerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AiChargeBatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        addressAnalyzerService.parser();
    }
}
