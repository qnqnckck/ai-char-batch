package com.soksok.aichargebatch;

import com.soksok.aichargebatch.address.service.AddressAnalyzerService;
import org.apache.commons.lang3.StringUtils;
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
        String jobName = System.getProperty("JOB_NAME");

        if(StringUtils.equals(jobName,"AI_STEP1")){
            boolean isAll = Boolean.parseBoolean(System.getProperty("IS_ALL"));
            String specificDay=System.getProperty("SPECIFIC_DAY");
            addressAnalyzerService.parser(isAll, specificDay);
        }else if(StringUtils.equals(jobName,"AI_STEP2")){
            addressAnalyzerService.tidyUp();
        }
    }
}
