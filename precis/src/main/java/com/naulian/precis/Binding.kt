@file:Suppress("unused")

package com.naulian.precis

//Temporary class to destroy it later
class Binding<T> {

    private var binding: T? = null
    val value get() = binding!!

    fun assign(binding: T) {
        this.binding = binding
    }

    fun destroy() {
        binding = null
    }

    operator fun invoke(action: T.() -> Unit) = action(value)
    operator fun invoke() = value

}
