function past(h, m, s){
  const milliHour = 3600000
  const milliMinute = 60000      
  const millisecond = 1000   
  
  return h * milliHour + m * milliMinute + s * millisecond
}