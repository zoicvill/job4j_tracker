package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenValidateTestFirstFalse() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput valInput = new ValidateInput(out, in);
        int selected = valInput.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidateTestAllTrue(){
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0","1","2"});
        ValidateInput input = new ValidateInput(out,in);
        for (int j = 0; j < 3; j++) {
            int i = input.askInt("Enter");
            assertThat(i,is(j));
        }
    }
    @Test
    public void whenValidateTestTrue(){
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"5"});
        ValidateInput input = new ValidateInput(out,in);
        int i = input.askInt("Ent");
        assertThat(i,is(5));
    }

    @Test
    public void whenValidateTestNegativ(){
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"-5"});
        ValidateInput input = new ValidateInput(out,in);
        int i = input.askInt("Ent");
        assertThat(i,is(-5));
    }

}