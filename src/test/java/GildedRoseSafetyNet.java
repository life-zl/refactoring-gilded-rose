import com.gildedrose.TextTestFixture;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GildedRoseSafetyNet {

    @Test
    public void should_be_able_to_use_guava_capabilities() throws IOException {

        String src = Files.toString(new File("src/test/resources/baseline.txt"), UTF_8);
        assertThat(TextTestFixture.generateOutPut(), is(src));
    }
}
