// INTEGRANTES:
// BYRON ALVAREZ (LIDER), ALBERTO HERRERA, STEVEN BENAVIDES, DANIEL CAMPOVERDE (PARALELO B)

// Ejercicio 1
val ListPesoTension = List(
  (72, 110),
  (76, 120),
  (78, 125),
  (81, 130),
  (89, 135),
  (95, 140),
  (108, 160),
  (115, 170),
  (120, 175),
  (130, 180)
)


val N = ListPesoTension.length

val mediaX = ListPesoTension.map(_._1).sum.toDouble / N
val mediaY = ListPesoTension.map(_._2).sum.toDouble / N

val numerador = ListPesoTension.map(row => (row._1 - mediaX) * (row._2 - mediaY)).sum

val covarianzaX = ListPesoTension.map(row => Math.pow(row._1 - mediaX, 2)).sum
val covarianzaY = ListPesoTension.map(row => Math.pow(row._2 - mediaY, 2)).sum

val r = numerador / Math.sqrt(covarianzaX * covarianzaY)


// Ejercicio 2

def add20(lists: List[List[Int]]): List[List[Int]] = {
  lists.map(_.map(_+20))
}

// Prueba de la función
val resultado = add20(List(List(1), List(2, 3)))
println(resultado) // Salida esperada: List(List(21), List(22, 23))


/*
Preguntas a resolver
1. ¿El coeficiente de correlación es positivo o negativo?
    Positivo
2. ¿Qué se puede concluir sobre la relación entre el peso y la tensión sistólica basándose en el coeficiente de correlación?
    Dado que el valor del coeficiente de correlación de Pearson (𝑟) es aproximadamente 0.9911, lo que está cerca de 1, podemos concluir que existe una correlación positiva muy
    fuerte entre el peso y la tensión sistólica en estos datos. La relación entre las 2 mediciones es que mientras una variable aumenta la otra también lo hace y de manera lineal
3. Explique detalladamente lo que sucede en la línea de código donde se calcula el numerador y el denominador de la fórmula del coeficiente de correlación de Pearson.
    En el numerador, row._1 representa los valores de Peso (xi) y row._2 representa los valores de Tensión (yi). Para cada par de valores (𝑥𝑖 , 𝑦𝑖 ) en la lista, se realiza lo siguiente:
      a) Se calcula la desviación de 𝑥𝑖 respecto a su media: (𝑥𝑖 − 𝑥‾).
      b) Se calcula la desviación de 𝑦𝑖 respecto a su media: (𝑦𝑖 − 𝑦‾ ).
      c) Se multiplica estas dos desviaciones: (𝑥𝑖 − 𝑥‾) (𝑦𝑖 − 𝑦‾).

    Denominador: Calcula el producto de las desviaciones estándar de 𝑥 𝑦 al tomar la raíz cuadrada de las sumas de los cuadrados de las desviaciones y multiplicarlas.
4. ¿Qué salida se esperaría si el coeficiente de correlación es calculado con datos donde la tensión sistólica aumenta a medida que el peso disminuye?
    En el caso de que sucediera eso sería la respuesta negativa ya que los datos son inverso uno positivo y otro negativo por ende la respuesta Pearson sería negativa
 */