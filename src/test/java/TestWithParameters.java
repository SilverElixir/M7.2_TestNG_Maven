import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * https://examples.javacodegeeks.com/enterprise-java/testng/testng-parameters-annotation-example/
 */
public class TestWithParameters extends BaseTest {

    @Test
    @Parameters({"valueToDecode", "expectedResult"})
    public void testMethodWithParameters(@Optional("MTAxMDA=") String valueToDecode,
                                         @Optional("10100") String expectedResult) {
        System.out.println("Decoding following value: " + valueToDecode);
        decodeValue(valueToDecode, expectedResult);
    }
}
