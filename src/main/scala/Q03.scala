@main def Question_03: Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(formatNames(name1, toUpper))
    println(formatNames(name2, toUpper))
    println(formatNames(name3, toLower))
    println(formatNames(name4, toLower))
}


def toUpper(str: String): String = {
    str.toUpperCase()
}

def toLower(str: String): String = {
    str.toLowerCase()
}

def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
}