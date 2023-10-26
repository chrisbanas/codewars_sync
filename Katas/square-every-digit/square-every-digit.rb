def square_digits num

 arr = num.to_s.split("")
  
 return arr.map {|x| ((x.to_i)**2).to_s }.join("").to_i
  
  
  
end