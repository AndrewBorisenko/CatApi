package CatApi.entity;

<<<<<<< HEAD
<<<<<<< HEAD

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Cats")
public class Cat {

    @Autowired
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;





    public Cat()
    {

    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)

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

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
=======
=======
>>>>>>> e4985ae0e0f39c2e093ee56d6335f3b2e3f0e161
/**
 * Created by andre on 25.02.2017.
 */
public class Cat {
}
<<<<<<< HEAD
>>>>>>> e4985ae0e0f39c2e093ee56d6335f3b2e3f0e161
=======
>>>>>>> e4985ae0e0f39c2e093ee56d6335f3b2e3f0e161
