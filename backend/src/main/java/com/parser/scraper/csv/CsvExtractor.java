package com.parser.scraper.csv;

import com.parser.scraper.dto.RawVehicleRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.supercsv.io.CsvMapReader;
import org.supercsv.io.ICsvMapReader;
import org.supercsv.prefs.CsvPreference;

import java.io.FileReader;
import java.util.Map;

import static com.parser.scraper.dto.RawVehicleRecord.fromMap;

@Slf4j
@Component
public class CsvExtractor {

    public void extract() throws Exception {
        ICsvMapReader mapReader = null;
        try {
            mapReader = new CsvMapReader(new FileReader(
                    "C:/Users/bulas/projects/etl-parser/backend/csv/Electric_Vehicle_Population_Data.csv"),
                    CsvPreference.STANDARD_PREFERENCE);

            final String[] header = mapReader.getHeader(true);

            Map<String, String> row;
            while ((row = mapReader.read(header)) != null) {
                RawVehicleRecord vehicleRecord = fromMap(row);
                log.info("Parsed CSV row {}", mapReader.getRowNumber());
            }

        } finally {
            if (mapReader != null) {
                mapReader.close();
            }
        }

    }
}
