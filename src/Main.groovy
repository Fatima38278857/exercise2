def countElements(list) {
    def countMap = [:]

    list.each { num ->
        countMap[num] = (countMap[num] ?: 0) + 1
    }
    return countMap
}
def list = [1, 3, 4, 5, 1, 5, 4]
println countElements(list)