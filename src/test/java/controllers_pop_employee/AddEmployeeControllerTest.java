package controllers_pop_employee;

import controllers_pop_task.AddTaskController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddEmployeeControllerTest {

    @Test
    public void refBoolTest() {
        boolean notTrue = false;
        assertEquals(AddTaskController.refBool(), notTrue);
    }
}
