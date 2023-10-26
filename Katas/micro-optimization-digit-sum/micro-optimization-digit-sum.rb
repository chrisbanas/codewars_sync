# # this is not fast enough!
# def digit_sum n
#   s = 0
#   while n>9 do
#     s += n%10
#     n /= 10
#   end
#   return s+n
# end

# # this is even worse
# def digit_sum n
#   n<10 ? n : n%10 + digit_sum(n/10)
# end

# convert the digits to a string, then split into an array. then iterate over each covert to an interger and add to sum

def digit_sum(n)
  sum = 0
  digits = n.to_s.split("").to_a
  
  digits.each { |digit| sum += digit.to_i }
 
  return sum
end