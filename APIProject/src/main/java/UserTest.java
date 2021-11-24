import com.userdetails.UserDetails;
import io.restassured.RestAssured;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class UserTest {
    /*public static void main(String[] args) {
        UserDetails userDetails=new UserDetails(1,"Malvika","malvika","Gulati","malvika@gmail.com","1234567890","9876543210",0);
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all().header("Content-Type","application/json")
                .body(userDetails).when().log().body().post("/user").then().log().body().assertThat().statusCode(200).extract().response();
    }*/
    @Test
    public void createUser()
    {
        UserDetails userDetails=new UserDetails(1,"Malvika","malvika","Gulati","malvika@gmail.com","1234567890","9876543210",0);
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all().header("Content-Type","application/json")
                .body(userDetails).when().log().body().post("/user").then().log().body().assertThat().statusCode(200);
    }
    @Test
    public void createUserWithArray(){
        List<UserDetails> userDetails=new ArrayList<>();
        UserDetails userDetails1=new UserDetails(1,"Malvika","malvika","Gulati","malvika@gmail.com","1234567890","9876543210",0);
        UserDetails userDetails2=new UserDetails(2,"abc","abc","ghf","abc@gmail.com","1234567890","9876543210",0);
    userDetails.add(userDetails1);
    userDetails.add(userDetails2);
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all().header("Content-Type","application/json")
                .body(userDetails).when().log().body().post("/user/createWithArray").then().log().body().assertThat().statusCode(200);


    }


}
