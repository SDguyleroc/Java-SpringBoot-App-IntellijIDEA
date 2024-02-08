package com.plants.plantsenterprise.Service;

import com.plants.plantsenterprise.dto.Specimen;

public interface ISpecimenService {

/**
 *
 * Fetch a specimen with a given ID
 * @param id is a unique identifier for a specimen
 * @return the matching specimen, for a null if no matches found
 *
*/
    Specimen fetchById(int id);
}
