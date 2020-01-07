package christmasTraining;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

class ChristmasTrainingTest {

    @Test
    public void sayListIsEmpty() {
        List<String> lista = null;
        Assert.assertEquals(lista, null);
    }
}