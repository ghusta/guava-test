package fr.husta.test.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dog
        implements Serializable
{

    private static final long serialVersionUID = 1L;

    private String name;
    private Date dateOfBirth;

    /**
     * 
     */
    public Dog()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

}
