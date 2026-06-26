package com.parser.pipeline;

import com.parser.scraper.csv.CsvExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class CorePipeline {

    @Autowired
    private CsvExtractor csvExtractor;

    public void processCsv(MultipartFile file) {

    }
}
