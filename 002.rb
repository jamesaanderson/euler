def fib(n)
 n < 2 ? n : fib(n-1) + fib(n-2) 
end

puts (1..Float::INFINITY).lazy.map { |i| fib(i) }.take_while { |i| i <= 4000000 }.select(&:even?).reduce(:+) # => 4613732
