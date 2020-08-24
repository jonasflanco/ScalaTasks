/*
 * Цель задачи Отличие этой задачи от всех остальных в том, что требуется сгенерировать правильные тесты к задаче 
 * вместо того, чтобы решать саму задачу. В задаче нет входных данных, от вас требуется просто вывести тесты к задаче, 
 * удовлетворяющие Формату входных данных и критериям, описанным в секции Задача. Посмотрите Разбор для инструкций 
 * по тестированию.
 *
 * Рассмотрим следующую задачу:
 *
 * Профессор преподаёт курс лекций по предмету Дискретная Математика группе из N студентов. 
 * Его раздражает отсутствие дисциплины студентов, поэтому он решил отменить занятие, если 
 * после его начала соберётся менее чем K студентов.
 * Дано время прибытия каждого студента. Ваше задание состоит в том, чтобы определить, будет занятие отменено или нет. 
 *
 * Формат входных данных
 * Первая строка входных данных содержит число T, количество тестов.
 * Каждый тест состоит из двух строк. В первой строке каждого теста записаны два целые числа, разделённые пробелом: N и K.
 * Следующая строка содержит N целых чисел, разделённых пробелами время прибытия каждого студента.
 * 
 * Если время прибытия студента неположительное число (<= 0), то студент зашёл в аудиторию до начала занятия. 
 * Если же время прибытия положительно (> 0), то студент зашёл в аудиторию после начала занятия.
 * Занятие начинается во момент времени 0.
 * Если студент заходит в аудиторию в момент времени 0, то считается, что он зашёл в аудиторию до начала занятия.
 * 
 * Формат выходных данных
 * Для каждого теста выведите YES если занятие будет отменено и NO в противоположном случае. 
 *
 * Выведите один или более тестов для вышеописанной задачи, которые удовлетворяют следующим критериям: 
 * T <= 5
 * 1 <= N <= 200
 * 1 <= K <= N
 * -1000 <= a[i] <= 1000 для 1 <= i <= N
 * Значения N должны быть различными для разных тестов.
 * a должен иметь как минимум ноль, 1 положительное число и 1 отрицательное число. 
 */
 
object Solution{
  def main(args: Array[String]): Unit = {
    println(5)
    println("6 6")
    println("0 0 0 0 -1 1")
    println("7 6")
    println("0 0 1 -1 0 0 0")
    println("4 4")
    println("0 -1 0 4")
    println("3 2")
    println("0 -2 2")
    println("5 4")
    println("0 2 -1 0 0")
  }
}