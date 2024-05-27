fun main() {
    val emp = Employee("rohan", 23)
    emp.name = "kartik"
    emp.age = 4

    var x: Employee = emp.apply { // points to object and returns context object
        name = "shubham"
        age = 56
    }
    println(x)
    println(emp)

    var y: String = emp.let {  //we access property by'it' and this return last line of block code
        println(it.name)
        println(it.age)
        "yahoo"
        "the name is ${it.name} and the age is ${it.age}"
    }
    println(y)

    var k: Int = with(emp) { //points to object and return last line of block code
        age = 22
        name = "pratik"
        3
    }
    println(emp)
    println(k)

    var m: Int = emp.run { //points to object and return last line of block code
        age += 20
        name = "yash"
        2*age
    }
    println(emp)
    println(m)

}

data class Employee(var name: String, var age: Int)