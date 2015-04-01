package com.jmockit.example;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * Author sumitk
 * Date   3/29/15
 */
public class PersonTestConstructor {

    @Test
    public void testGetName() {
        new MockUp<Person>() {
            @Mock
            public void $init() {
                //Dont assign name variable at all
                //Leave it null
            }

        };

        Person p = new Person();
        String name = p.getName();

        assertNull("Name of person is null",name);
    }

}
