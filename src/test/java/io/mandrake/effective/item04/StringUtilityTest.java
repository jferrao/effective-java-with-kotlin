package io.mandrake.effective.item04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringUtilityTest {

    @Test
    void testReplaceNonAscii() {
        final String replacedAscii = StringUtility.replaceNonAscii("João", "A");
        assertThat(replacedAscii).isEqualTo("JoAo");
    }

    @Test
    void testRemoveNonAscii() {
        final String removedAscii = StringUtility.removeNonAscii("João");
        assertThat(removedAscii).isEqualTo("Joo");
    }

    @Test
    void testRemovedEmoji() {
        final String removedEmoji = StringUtility.removeEmoji("João hello world _# 皆さん、こんにちは！　私はジョンと申します。\uD83D\uDD25⭐");
        assertThat(removedEmoji).isEqualTo("João hello world _# 皆さん、こんにちは！　私はジョンと申します。");
    }

    @Test
    void testNoDiacritics() {
        final String noDiacritics = StringUtility.convertDiacritics("João");
        assertThat(noDiacritics).isEqualTo("Joao");
    }

    @Test
    void testToUrlFriendlySLug() {
        final String url = StringUtility.toUrlFriendlySLug("Køtlin extensions by João ©±† €uro \uD83D\uDD25⭐");
        assertThat(url).isEqualTo("ktlin-extensions-by-joao-uro");
    }

}
