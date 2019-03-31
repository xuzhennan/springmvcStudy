package com.xuzn.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {

    private HelloController helloController;

    private MockMvc mockMvc;


    @Before
    public void setUp(){
        helloController=new HelloController();
        mockMvc= MockMvcBuilders.standaloneSetup(helloController).build();
    }

    @Test
    public void hello() throws Exception{
        mockMvc.perform(get("/helloView"))
        .andExpect(view().name("hello"));
    }

    @Test
    public void home() throws Exception{
        mockMvc.perform(get("/homeView"))
                .andExpect(view().name("home"));
    }
}