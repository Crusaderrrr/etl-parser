package com.parser.web;

import com.parser.pipeline.CorePipeline;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImportController {

    private CorePipeline pipeline;

    @PostMapping(value = "api/import/csv", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void importCsf(@RequestParam("file") MultipartFile file) {
        pipeline.processCsv(file);
    }
}
