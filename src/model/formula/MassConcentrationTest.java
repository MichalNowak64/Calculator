package model.formula;

import model.unit.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MassConcentrationTest {
    private MassConcentration mass;

    @BeforeEach
    public void before(){
        mass=new MassConcentration();
    }

    @Test
    void createTest() {
        Assertions.assertNotNull(mass);
    }


    @Test
    void unitValTest(){
        double unit;
        unit=mass.getData1Unit().getUnitMap("kg");
        Assertions.assertEquals(1,unit);
        unit=mass.getData1Unit().getUnitMap("dag");
        Assertions.assertEquals(0.01,unit);
        unit=mass.getData1Unit().getUnitMap("g");
        Assertions.assertEquals(0.001,unit);

    }

    @Test
    void solutionTest(){
        mass.setData1(1);
        mass.setData2(1);
        Assertions.assertEquals(1,mass.solution("kg","m^3"));
        Assertions.assertEquals(0.01,mass.solution("dag","m^3"));
        Assertions.assertEquals(0.001,mass.solution("g","m^3"));

        mass.setData1(1);
        mass.setData2(2);
        Assertions.assertEquals(0.5,mass.solution("kg","m^3"));
    }
}