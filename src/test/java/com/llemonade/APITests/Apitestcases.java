package com.llemonade.APITests;

import com.llemonade.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class Apitestcases {

@Test
public void testNoReturnPhoto(){

    // No photo is returned for a date in the future

    Response response = given().accept(ContentType.JSON)
            .and().queryParam("earth_date","2022-6-3")
            .and().queryParam("api_key","gnesiqnKCJMm8UTYZYi86ZA5RAnrO4TAR9gDstVb")
           .when().get("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos");
            assertEquals(response.statusCode(),200);

            assertFalse(response.body().toString().contains("id"));
}


@Test
    public void testForthPhotoId(){
//using date 2019-6-3 the 4th photo has ID 675839
    Response response = given().accept(ContentType.JSON)
            .and().queryParam("earth_date","2019-6-3")
            .and().queryParam("api_key","gnesiqnKCJMm8UTYZYi86ZA5RAnrO4TAR9gDstVb")
            .when().get("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos");

    int forthfotoid= response.path("photos.id[3]");
    int expectedid=675839;
    assertEquals(forthfotoid,expectedid);



    }
    @Test
    public void NoApiKey(){
      //  403 status code is returned if no api_key is passed.

        Response response = given().accept(ContentType.JSON)
                .and().queryParam("earth_date","2019-6-3")
                .when().get("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos");

        assertEquals(response.statusCode(),403);
    }
    }

