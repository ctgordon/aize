package com.aize.b_collections;

import com.aize.b_collections.persistence.model.TypeC;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class BCollectionsApplicationTests {
    @Test
    public void demoTestMethod() {
        assertTrue(true);
    }

    @Test
    public void whenStoringAJsonColumn_thenDeserializedVersionMatches() throws IOException {
        TypeC typeC = new TypeC();
        typeC.setName("first name");
        typeC.setCreationDate(new Date());

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("address", "123 Main Street");
        attributes.put("zipcode", 12345);

        typeC.setAttributes(attributes);
        typeC.serializeCustomerAttributes();

        String serialized = typeC.getAttributesJSON();

        typeC.setAttributesJSON(serialized);
        typeC.deserializeCustomerAttributes();

        Assertions.assertEquals(attributes, typeC.getAttributes());
    }


}
