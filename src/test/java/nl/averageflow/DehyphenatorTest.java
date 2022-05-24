package nl.averageflow;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

public class DehyphenatorTest {

    @Provide("Business supported radix")
    Arbitrary<Integer> supportedRadixes(){
        return Arbitraries.of(10, 32, 36);
    }

    @Property
    boolean dehyphenator3AlwaysWorks(@ForAll final String zipcode,
                                @ForAll("Business supported radix") final int radix){
        final int sut = Dehyphenator.dehyphenZipToInt3(zipcode, radix);
        return sut == Dehyphenator.INVALID_ZIPCODE_VALUE || sut >= 0;
    }

    @Property
    void dehyphenator3AlwaysWorks2(@ForAll final String zipcode,
                                    @ForAll("Business supported radix") final int radix){
        final int sut = Dehyphenator.dehyphenZipToInt3(zipcode, radix);
        assert sut == Dehyphenator.INVALID_ZIPCODE_VALUE || sut >= 0;
    }
}
