fun main() {
elements()

println( names("Joele","Juma","Jaele"))

    val person1 =personObjects("Femi",20,12.0, 70.5)
    val person2 =personObjects("Janele",21, 15.1, 59.3)
    val person3 =personObjects("John",23, 18.2, 50.4)
    val person4 =personObjects("Luke",21, 13.3, 41.5)
    val person= listOf<personObjects>(person1,person2,person3,person4)
    val people=person.sortedByDescending {person->person.age}
    println(people)
    personObjects("jil",17,20.0,15.1)

    val v1 = Vehicles("KDA880K", 70)
    val v2 = Vehicles("KBM230G",50)
    val v3  =Vehicles("KCF343P",40)
    val v4 = Vehicles("KWD343V",80)
    val allVehicles= listOf(v1,v2,v3,v4)
    println(vehicleList(allVehicles))

}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
    fun elements() {
        var numbers= arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        println(numbers[1] + numbers[4])
        println(numbers.indexOf(158))
        numbers.sorted()
        for(num in numbers){
            println(num)
        }
    }


//2. Given a list of Person objects, each with the attributes, name, age, height, and weight. Sort the list in order of descending age (2 points)
class personObjects(var name:String,var age:Int,var height:Double,var Weight:Double)





//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
fun names(name: String,name1: String,name3:String) {
    val names = arrayOf(name, name1, name3)
    println(names.contentToString())
}

//4. Write a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)

data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int {
    var avg = 0
    vehicle.forEach { car ->
        car.mileage
        avg += car.mileage

    }
    val totalAvg = vehicle.count()
    return totalAvg
}