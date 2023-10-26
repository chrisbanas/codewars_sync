# create a variable for positive sum
# create a variable for negative sum
#itearate over the array and add positive nums to p sum and negative nums to p sum
#return the new array



def count_positives_sum_negatives(lst)
 
  p_sum = 0
  n_sum = 0
  
   if lst == []
     return []
     end
  
  
  lst.each do |num|
    if num > 0 
      p_sum += 1
    end
    if num < 0
      n_sum += num
    end
  end
   return [p_sum, n_sum]   
  
end