package winter.model;

import javax.persistence.Id;

/**
 * Created by lequan on 11/10/2016.
 */
public class Country
{
    @Id
    private String id;
    private String name;

    public Country(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Country()
    {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Country country = (Country) o;

        if (id != null ? !id.equals(country.id) : country.id != null)
        {
            return false;
        }
        if (name != null ? !name.equals(country.name) : country.name != null)
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
