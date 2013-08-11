lazy val fibs: Stream[Int] = {
  def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a + b)
  fib(0, 1)
}

println(fibs.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum) // => 4613732
