package com.pinanet.tests;

import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.expect;
import com.jayway.restassured.http.ContentType;
import org.hamcrest.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rpn8fe
 */
public class NewsRESTTest {

    @Before
    public void setUp() {
        RestAssured.basePath = "http://localhost:8080";
    }

    @Test
    public void testGetStage() {
        
    }

}
