package guildTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dogFoodTestcase {

    dogFood dogFoodObject;

    @BeforeEach
    void setUp() {
        dogFoodObject = new dogFood();
    }

    @Test
    void numberOfDogsInShelter () {
        assertEquals("Total Dogs can not be more than 30",dogFoodObject.foodRequired(10,10,11,17),"Total dog count can not be more than 30 in Shelter");
        assertEquals("Do not order food as Dog count is zero",dogFoodObject.foodRequired(0,0,0,17),"Total dog count can be 0 in Shelter");
        assertEquals("Food required is 387",dogFoodObject.foodRequired(3,5,7,17),"Total dog count is more than zero and less equal to 30 in Shelter");
    }

    @Test
    void smallDogConditions(){
        assertEquals("Food required is 303",dogFoodObject.foodRequired(0,3,7,17),"Small dog value can be 0");
        assertEquals("Food required is 363",dogFoodObject.foodRequired(5,3,7,17),"Small dog value is between 0-30");
        assertEquals("Food required is 339",dogFoodObject.foodRequired(30,0,0,17),"Small dog value can be 30");
        assertEquals("Value can not be in negative",dogFoodObject.foodRequired(-2,3,5,17),"Small dog value can not be negative");
        assertEquals("Dog count can not be more than 30",dogFoodObject.foodRequired(31,3,5,17),"Small dog value can not be more than 30");

        // assertEquals("Dog count can not be in decimal",dogFoodObject.foodRequired(3.1,3,5,17),"Small dog value can not be in decimal");
        // assertEquals("Dog count can not be character",dogFoodObject.foodRequired('a',3,5,17),"Small dog value can not be character");

    }

    @Test
    void mediumDogConditions(){
        assertEquals("Food required is 291",dogFoodObject.foodRequired(5,0,7,17),"Medium dog value can be 0");
        assertEquals("Food required is 363",dogFoodObject.foodRequired(5,3,7,17),"Medium dog value is between 0-30");
        assertEquals("Food required is 699",dogFoodObject.foodRequired(0,30,0,17),"Medium dog value can be 30");
        assertEquals("Value can not be in negative",dogFoodObject.foodRequired(3,-3,5,17),"Medium dog value can not be negative");
        assertEquals("Dog count can not be more than 30",dogFoodObject.foodRequired(5,31,5,17),"Medium dog value can not be more than 30");

        // assertEquals("Dog count can not be in decimal",dogFoodObject.foodRequired(3,3.2,5,17),"Medium dog value can not be in decimal");
        // assertEquals("Dog count can not be character",dogFoodObject.foodRequired(2,'a',5,17),"Medium dog value can not be character");
    }

    @Test
    void largeDogConditions(){
        assertEquals("Food required is 111",dogFoodObject.foodRequired(5,3,0,17),"Large dog value can be 0");
        assertEquals("Food required is 363",dogFoodObject.foodRequired(5,3,7,17),"Large dog value is between 0-30");
        assertEquals("Food required is 1059",dogFoodObject.foodRequired(0,0,30,17),"Large dog value can be 30");
        assertEquals("Value can not be in negative",dogFoodObject.foodRequired(3,3,-5,17),"Large dog value can not be negative");
        assertEquals("Dog count can not be more than 30",dogFoodObject.foodRequired(5,3,31,17),"Large dog value can not be more than 30");

        // assertEquals("Dog count can not be in decimal",dogFoodObject.foodRequired(3,3,5.1,17),"Large dog value can not be in decimal");
        // assertEquals("Dog count can not be character",dogFoodObject.foodRequired(2,3,'a',17),"Large dog value can not be character");
    }

    @Test
    void leftOverConditions(){
        assertEquals("Food required is 384",dogFoodObject.foodRequired(5,3,7,0),"Left over value can be 0");
        assertEquals("Value can not be in negative",dogFoodObject.foodRequired(5,3,7,-17),"Left over value can be 0");

//        assertEquals("Value can not be character",dogFoodObject.foodRequired(5,3,7,-'a'),"Left over value can not be character");
    }
}