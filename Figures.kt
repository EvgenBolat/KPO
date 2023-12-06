abstract class Figure (val height : UInt, val len : UInt) {
    
    abstract fun ToString() : String
    abstract fun V() : Double
    abstract fun OrtagArea() : Double
    abstract fun TopArea() : Double
}

open class Cube (height : UInt, len : UInt) : Figure (height, len) {

    override fun ToString() : String {
        return "\nОбъем куба: ${V()} \nПлощадь боковой проекции: ${OrtagArea()} \nПлощадь проекции сверху: ${TopArea()}"
    }

    override fun V() : Double {
        return (len * len * height).toDouble()
    }

    override fun OrtagArea(): Double {
        return (len * height).toDouble()
    }

    override fun TopArea(): Double {
        return (len * len).toDouble()
    }
}

open class Pyramid (height : UInt, len : UInt) : Figure (height, len) {
    override fun ToString() : String {
        return "\nОбъем пирамиды: ${V()} \nПлощадь боковой проекции: ${OrtagArea()} \nПлощадь проекции сверху: ${TopArea()}"
    }

    override fun V() : Double {
        return (len * len * height).toDouble() / 3
    }

    override fun OrtagArea(): Double {
        return (len * height).toDouble() / 2
    }

    override fun TopArea(): Double {
        return (len * len).toDouble()
    }
}

open class Cone (height : UInt, len : UInt) : Figure (height, len) {
    override fun ToString() : String {
        return "\nОбъем конуса: ${V()} \nПлощадь боковой проекции: ${OrtagArea()} \nПлощадь проекции сверху: ${TopArea()}"
    }

    override fun V() : Double {
        return kotlin.math.PI * (len * len * height).toDouble() / 3
    }

    override fun OrtagArea(): Double {
        return (len * height).toDouble() / 2
    }

    override fun TopArea(): Double {
        return kotlin.math.PI * (len * len).toDouble()
    }
}