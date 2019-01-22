package model.formula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PercentMassConcentrationTest {


    private PercentMassConcentration mass;

    @BeforeEach
    public void before(){
        mass=new PercentMassConcentration();
    }


    @Test
    void createTest() {
        Assertions.assertNotNull(mass);
    }

    @Test
    void unitValTest(){
        Assertions.assertEquals(1,mass.getData1Unit().getUnitMap("kg"));
        Assertions.assertEquals(0.01,mass.getData1Unit().getUnitMap("dag"));
        Assertions.assertEquals(0.001,mass.getData1Unit().getUnitMap("g"));

    }

    @Test
    void solutionTest(){
        mass.setData1(2);
        mass.setData2(2);
        Assertions.assertEquals(100,mass.solution("kg","kg"));
    }
}