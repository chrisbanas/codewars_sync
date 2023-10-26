def better_than_average(arr, points)
 sum = 0
  
  arr.each { |num| sum += num }
  
  if (sum.to_f / arr.length) > points
    return false
    end
  
  return true
  
end