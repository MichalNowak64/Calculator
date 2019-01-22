package model.formula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MassFormulaTest {
    private MassFormula mass;



        @BeforeEach
        public void before(){
            mass=new MassFormula();
        }

        @Test
        void createTest() {
            Assertions.assertNotNull(mass);
        }


        @Test
        void unitValTest(){
            double unit;
            unit=mass.getData2Unit().getUnitMap("m^3");
            Assertions.assertEquals(1,unit);

        }

        @Test
        void solutionTest(){
            mass.setData1(1);
            mass.setData2(1);
            Assertions.assertEquals(1,mass.solution("kg/m^3","m^3"));

            mass.setData1(1);
            mass.setData2(2);
            Assertions.assertEquals(2,mass.solution("kg/m^3","m^3"));

            mass.setData1(2);
            mass.setData2(2);
            Assertions.assertEquals(4,mass.solution("kg/m^3","m^3"));
        }
    }
