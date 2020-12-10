package $package;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MainAppTest
{
    @Test
    public void rigorousCheck()
    {
        assertThat("Hello").startsWith("H").endsWith("o");
    }
}
