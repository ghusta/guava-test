package fr.husta.test.pojo;

import java.io.Serializable;
import java.util.Date;

import com.google.common.base.Objects;

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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Dog))
        {
            return false;
        }

        final Dog other = (Dog) obj;
        // uses Guava's Objects
        return Objects.equal(name, other.name) && Objects.equal(dateOfBirth, other.dateOfBirth);
    }

    @Override
    public int hashCode()
    {
        // uses Guava's Objects
        return Objects.hashCode(name, dateOfBirth);
    }

    @Override
    public String toString()
    {
        // uses Guava's Objects
        return Objects.toStringHelper(this.getClass().getName()).add("name", name).add("dateOfBirth", dateOfBirth).toString();
    }

}
