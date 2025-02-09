package com.aize.b_collections;

import com.aize.b_collections.BCollectionsApplication;
import com.aize.b_collections.persistence.dao.TypeARepository;
import com.aize.b_collections.persistence.model.TypeA;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DataJpaTest
@SpringBootTest(classes = BCollectionsApplication.class)
@AutoConfigureMockMvc
public class TypeAControllerTest {
    static final String PATH = "/typea";

    @Autowired
    private MockMvc mvc;

    @Autowired
    private TypeARepository typeARepository;

    @Before
    public void setUp() {

    }

    @Test
    public void getAllTypeA_AndExpectNone() throws Exception {
        final TypeA typeA = new TypeA();
        mvc.perform(get(PATH).contentType(MediaType.APPLICATION_JSON)
                        .content(String.valueOf(typeA)))
                .andExpect(status().isOk());

        List<TypeA> typeAList = typeARepository.findAll();
        assertThat(typeAList.size()).isEqualTo(0);
    }

    @Test
    public void postTypeA_AndExpectOk() throws Exception {
        final TypeA typeA = new TypeA();
        mvc.perform(post(PATH).contentType(MediaType.APPLICATION_JSON)
                        .content(String.valueOf(typeA)))
                .andExpect(status().isOk());
    }
}
