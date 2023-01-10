package com.harsh.testartifactory

class PnbStringClass {

    fun toPnb(stringValue: String): String {
        return stringValue.replace("\\w+", "Pnb")
    }
}