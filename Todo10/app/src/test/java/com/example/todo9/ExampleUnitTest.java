package com.example.todo9;

import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {
private calculator mcal;

@Before
    public void setUp(){
    mcal = new calculator();
}
    @Test
    public void addTwoNumbers(){
        double res = mcal.add(3d,1d);
        assertThat(res,is(equalTo(4d)));
    }
    @Test
    public void subTwoNumbers(){
    double res = mcal.sub(3d,2d);
    assertThat(res, is(equalTo(1d)));
    }
    @Test
    public void subWorksWithNegativeNumbers(){
    double res = mcal.sub(2d,3d);
    assertThat(res, is(equalTo(-1d)));
    }
    @Test
    public void mulTwoNumbers(){
    double res = mcal.mul(2d,2d);
    assertThat(res, is(equalTo(4d)));
    }
    @Test
    public void mulTwoNumbersZero(){
    double res = mcal.mul(2d,0d);
    assertThat(res, is(equalTo(0d)));
    }
    @Test
    public void divTwoNumbers(){
    double res = mcal.div(4d,2d);
    assertThat(res, is(equalTo(2d)));
    }
    @Test(expected = IllegalArgumentException.class)
    public void divTwoNumbersZero(){
    double res = mcal.div(4d,0d);

    }


}




