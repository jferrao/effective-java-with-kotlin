package io.mandrake.effective.item04

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KotlinStringUtilityTest {

    @Test
    fun `replace non ascii`() {
        assertThat("João".replaceNonAscii("A")).isEqualTo("JoAo")
    }

    @Test
    fun `remove non ascii`() {
        assertThat("João".removeNonAscii()).isEqualTo("Joo")
    }

    @Test
    fun `remove emojis`() {
        assertThat("João hello world _# 皆さん、こんにちは！　私はジョンと申します。\uD83D\uDD25⭐".removeEmoji())
            .isEqualTo("João hello world _# 皆さん、こんにちは！　私はジョンと申します。")
    }

    @Test
    fun `convert diacritics`() {
        assertThat("João".convertDiacritics()).isEqualTo("Joao")
    }

    @Test
    fun `string to url friendly slug`() {
        assertThat("Køtlin extensions by João ©±† €uro \uD83D\uDD25⭐".toUrlFriendlySlug())
            .isEqualTo("ktlin-extensions-by-joao-uro")
    }

}
