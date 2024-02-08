package com.plants.plantsenterprise.Service;

import com.plants.plantsenterprise.dto.Specimen;
import org.springframework.stereotype.Component;

@Component
public class SpecimenServiceStub implements ISpecimenService{

    @Override
    public Specimen fetchById(int id) {
        Specimen specimen = new Specimen();
        specimen.setDescription("Eastern Redbub");
        specimen.setSpecimenId("83");
        return specimen;
    }
}
