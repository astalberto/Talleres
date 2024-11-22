val employees = List(
  ("Alice", 30, "IT", 5000.00, "New York"),
  ("Bob", 45, "HR", 3000.50, "Los Angeles"),
  ("Charlie", 25, "Finance", 4500.75, "Chicago")
)
def findEmployeeSalary(name: String): Option[Double] = {
  employees.find(_._1 == name).map(_._4)
}
println(findEmployeeSalary("Alice")) // Some(5000.0)
println(findEmployeeSalary("Bob")) // Some(3000.5)
println(findEmployeeSalary("David")) // None

import scala.util.{Try,   Success, Failure}

def safeSqrt(x: Double): Try[Double] = {
  if (x < 0) Failure(new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo"))
  else Success(Math.sqrt(x))
}

println(safeSqrt(16)) // Success(4.0)
println(safeSqrt(0)) // Success(0.0)
println(safeSqrt(-9)) // Failure(java.lang.IllegalArgumentException: No se puede calcular la raíz cuadrada de un número negativo)
