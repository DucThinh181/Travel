package winter.model;

import javax.persistence.*;

/**
 * Created by lequan on 11/5/2016.
 */

@Entity
@Table(name="city")
@NamedQuery(
        name = "findCityById",
        query="from City where id = :id"
)
public class City
{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String countryId;
    private String name;

    public City(int id, String countryId, String name)
    {
        this.id = id;
        this.countryId = countryId;
        this.name = name;
    }

    public City()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCountryId()
    {
        return countryId;
    }

    public void setCountryId(String nationId)
    {
        this.countryId = nationId;
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

        City city = (City) o;

        if (id != city.id)
        {
            return false;
        }
        if (countryId != null ? !countryId.equals(city.countryId) : city.countryId != null)
        {
            return false;
        }
        if (name != null ? !name.equals(city.name) : city.name != null)
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
