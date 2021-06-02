import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestWithFactory extends BaseTest {

    @Factory
    public Object[] factoryMethod() {
        Object[] data = new Object[5];
        data[0] = new DependencyTest("MTAxMDA=", "10100");
        data[1] = new DependencyTest("MDExMQ==", "0111");
        data[2] = new DependencyTest("NDgwMDA=", "48000");
        data[3] = new DependencyTest("MjExMDQy", "211042");
        data[4] = new DependencyTest("aDAwMDAw", "h00000");
        return data;
    }

    class DependencyTest {
        private String valueToDecode;
        private String expectedResult;

        public DependencyTest(String valueToDecode, String expectedResult) {
            this.valueToDecode = valueToDecode;
            this.expectedResult = expectedResult;
        }

        @Test
        public void testMethodWithFactory() {
            System.out.println("Decoding following value: " + this.valueToDecode);
            decodeValue(this.valueToDecode, this.expectedResult);
        }

//        @Test
//        public void testMethod_2() {
//            System.out.println("Decoding following value: " + this.valueToDecode);
//            decodeValue(this.valueToDecode, this.expectedResult);
//        }
//
//        @Test
//        public void testMethod_3() {
//            System.out.println("Decoding following value: " + this.valueToDecode);
//            decodeValue(this.valueToDecode, this.expectedResult);
//        }
//
//        @Test
//        public void testMethod_4() {
//            System.out.println("Decoding following value: " + this.valueToDecode);
//            decodeValue(this.valueToDecode, this.expectedResult);
//        }
//
//        @Test
//        public void testMethod_5() {
//            System.out.println("Decoding following value: " + this.valueToDecode);
//            decodeValue(this.valueToDecode, this.expectedResult);
//        }
    }

}

