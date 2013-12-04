package fr.husta.test.pojo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest
{

    private Dog myDog1;
    private Dog myDog1Clone;

    @Before
    public void setUp()
    {
        myDog1 = new Dog();
        myDog1.setName("Rex");
        myDog1.setDateOfBirth(new GregorianCalendar(2012, Calendar.DECEMBER, 31).getTime());

        myDog1Clone = new Dog();
        myDog1Clone.setName("Rex");
        myDog1Clone.setDateOfBirth(new GregorianCalendar(2012, Calendar.DECEMBER, 31).getTime());

    }

    @Test
    public void testHashCode() throws Exception
    {
        System.out.println(myDog1.hashCode());
    }

    @Test
    public void testEquals() throws Exception
    {
        Assert.assertEquals(myDog1, myDog1Clone);
        System.out.println(myDog1.equals(myDog1Clone));
    }

    @Test
    public void testToString() throws Exception
    {
        String res = myDog1.toString();
        System.out.println(res);

        Assert.assertTrue(res.contains("name=Rex"));
        Assert.assertTrue(res.contains("dateOfBirth=Mon Dec 31 00:00:00 CET 2012"));
    }

}
