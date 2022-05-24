package nl.averageflow;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

import java.util.List;

class FooBarTest {
    @Property
    boolean everyGivenElementIsCorrectlyIncrementedBy3(@ForAll final int i){
        final int sut = FooBar.addThree(i);
        return sut == i + 3;
    }

    @Property
    boolean lengthOfConcatenatedStringIsGreaterThanLengthOfEach(
            @ForAll String string1, @ForAll String string2
    ) {
        final String sut = FooBar.customConcat(string1, string2);

        // you might expect concatenation of 2 strings to result in a string
        // which its length will always be bigger than the origin params
        return sut.length() >= string1.length() &&
                sut.length() >= string2.length();

        // but what about empty string situations ? >= / >
    }

}
