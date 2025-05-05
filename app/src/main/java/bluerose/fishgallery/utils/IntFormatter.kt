package bluerose.fishgallery.utils

fun Int.getFormatted(): String {
    var res = ""
    var tmp = this
    while (tmp > 0) {
        val toAdd = if (tmp % 1000 == 0) "000" else "${tmp % 1000}"
        res = "$toAdd $res"
        tmp /= 1000
    }
    return res.trim()
}