import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestWithDataProvider extends BaseTest{

    @Test(dataProvider = "decodePairs")
    public void testMethodWithDataProvider(String valueToDecode, String expectedResult) {
        System.out.println("Decoding following value: " + valueToDecode);
        decodeValue(valueToDecode, expectedResult);
    }

    @DataProvider(name = "decodePairs")
//    when running in parallel 'values To Decode' get overlapped
//    @DataProvider(name = "decodePairsodePairs", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"MTAxMDA=", "10100"},
                {"MDExMQ==", "0111"},
                {"NDgwMDA=", "48000"},
                {"MjExMDQy", "211042"},
                {"aDAwMDAw", "h00000"}
        };
    }
}
