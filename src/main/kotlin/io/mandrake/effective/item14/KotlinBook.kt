package io.mandrake.effective.item14

class KotlinBook(title: String) {

    var title: String = title
        get() = "$field using Kotlin"

}
