package com.parser.scraper.dto;

import java.util.Map;

public record RawVehicleRecord(
        String vin,
        String county,
        String city,
        String state,
        String postalCode,
        String modelYear,
        String make,
        String model,
        String electricVehicleType,
        String cafvEligibility,
        String electricRange,
        String legislativeDistrict,
        String dolVehicleId,
        String vehicleLocation,
        String electricUtility,
        String censusTract2020
) {
    public static RawVehicleRecord fromMap(Map<String, String> data) {
        return new RawVehicleRecord(
                data.get("VIN (1-10)"),
                data.get("County"),
                data.get("City"),
                data.get("State"),
                data.get("Postal Code"),
                data.get("Model Year"),
                data.get("Make"),
                data.get("Model"),
                data.get("Electric Vehicle Type"),
                data.get("Clean Alternative Fuel Vehicle (CAFV) Eligibility"),
                data.get("Electric Range"),
                data.get("Legislative District"),
                data.get("DOL Vehicle ID"),
                data.get("Vehicle Location"),
                data.get("Electric Utility"),
                data.get("2020 Census Tract")
        );
    }
}
