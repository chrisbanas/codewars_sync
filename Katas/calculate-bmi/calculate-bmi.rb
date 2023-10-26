# calculate bmi with the formula provided and then use a layered if statement to get our output



def bmi(weight, height)
  
  if weight / height**2 <= 18.5
    return "Underweight"
  elsif weight / height**2 <= 25.0
    return "Normal"
  elsif weight / height**2 <= 30.0
    return "Overweight"
  else weight / height**2 > 30
    return "Obese"
  end
  
end