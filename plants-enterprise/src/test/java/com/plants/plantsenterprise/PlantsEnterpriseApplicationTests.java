package com.plants.plantsenterprise;

import com.plants.plantsenterprise.Service.ISpecimenService;
import com.plants.plantsenterprise.dto.Specimen;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Configuration
@SpringBootTest
class PlantsEnterpriseApplicationTests {

	@Autowired
	private ISpecimenService specimenService;
	private Specimen specimen;

	@Test
	void contextLoads() {
	}

	@Test
	void fetchSpecimenByID_returnRedBudForID83(){
		givenSpecimenDataAreAvailable();
		whenSearchSpecimenWithID83();
		thenReturnOneEasternRedBudSpecimenForID83();
	}

	private void givenSpecimenDataAreAvailable() {
	}

	private void whenSearchSpecimenWithID83() {

		specimen = specimenService.fetchById(83);
	}

	private void thenReturnOneEasternRedBudSpecimenForID83() {

		String description = specimen.getDescription();
		assertEquals("Eastern Redbub", description);
	}
}
