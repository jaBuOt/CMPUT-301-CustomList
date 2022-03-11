import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "HS"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        boolean listContains = list.hasCity(new City("Halifax", "HS"));
        assertEquals(false, listContains);
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Halifax", "HS");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(listSize-1, list.getCount());
    }

}
