package atu.ie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee myEmployee;

    @BeforeEach
    void setUp() {
        myEmployee = new Employee();
    }

    @AfterEach
    void tearDown() {
        myEmployee = new Employee();
    }

    @Test
    void getNameSuccess() {
        assertEquals(5, myEmployee.getName().length());
    }

    @Test
    void getNameFail() {
        assertEquals(23, myEmployee.getName().length());
    }

//    @Test
//    void setName() {
//        myEmployee = new Employee();
//    }

    @Test
    void getPpsIdSuccess() {
        assertEquals(6, myEmployee.getPpsId());
    }

    @Test
    void getPpsIdFail() {  assertEquals(8, myEmployee.getPpsId());}


//    @Test
//    void setPpsId() {
//        myEmployee = new Employee();
//    }
}