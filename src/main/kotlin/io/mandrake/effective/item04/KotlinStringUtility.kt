package io.mandrake.effective.item04

import java.text.Normalizer;
import java.util.Locale

fun String.replaceNonAscii(replacement: String): String = this.replace("[^\\p{ASCII}]".toRegex(), replacement)

fun String.removeNonAscii(): String = this.replaceNonAscii("")

fun String.removeEmoji(): String =
    this.replace("[^\\p{L}\\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}\\s]".toRegex(), "")

fun String.convertDiacritics(): String {
    if (!Normalizer.isNormalized(this, Normalizer.Form.NFD)) {
        val normalizedString = Normalizer.normalize(this, Normalizer.Form.NFD)
        return normalizedString.replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "")
    }
    return this
}

fun String.toUrlFriendlySlug(): String {
    return this
        .convertDiacritics()
        .removeNonAscii()
        .trim()
        .replace("\\s+".toRegex(), "-")
        .toLowerCase(Locale.ENGLISH)
}
