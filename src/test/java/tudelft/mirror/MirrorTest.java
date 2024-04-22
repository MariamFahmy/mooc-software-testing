package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    Mirror mirrorObject;

    @BeforeEach
    public void initialize() {
        this.mirrorObject = new Mirror();
    }

    @Test
    public void inputIsNull() {
        String result = this.mirrorObject.mirrorEnds(null);
        Assertions.assertEquals("", result);
    }

    @Test public void oddLengthPalindrome() {
        String result = this.mirrorObject.mirrorEnds("aba");
        Assertions.assertEquals("aba", result);
    }

    @Test
    public void evenLengthPalindrome() {
        String result = this.mirrorObject.mirrorEnds("abba");
        Assertions.assertEquals("abba", result);
    }

    @Test
    public void oddLengthInputAndNotPalindrome() {
        String result = this.mirrorObject.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void evenLengthInputAndNotPalindrome() {
        String result = this.mirrorObject.mirrorEnds("abca");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void inputHasNoMirror() {
        String result = this.mirrorObject.mirrorEnds("abcd");
        Assertions.assertEquals("", result);
    }

    @Test
    public void inputIsSingleLetter() {
        String result = this.mirrorObject.mirrorEnds("z");
        Assertions.assertEquals("z", result);
    }
}
