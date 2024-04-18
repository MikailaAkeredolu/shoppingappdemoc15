package unittestdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

//    @Test
//    public void setAndGetPersonTest(){
//        Person person = new Person();
//        String expected = "Mike";
//        person.setName(expected);
//        String actual = person.getName();
//        assertEquals(expected, actual);
//    }

    @Test
    public void testPersonConstructor(){
       //given
        String expected = "Mike";
        Person person = new Person(expected);
        //when
      String actual = person.getName();

        //Then
        assertEquals(expected, actual);

    }


}