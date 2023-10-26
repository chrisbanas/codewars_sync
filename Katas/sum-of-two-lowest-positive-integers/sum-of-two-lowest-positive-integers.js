function sumTwoSmallestNumbers(numbers) {  
  let lowest = Infinity;
  let li = 0
  let secondLowest = Infinity;
  
  for ( let i = 0; i < numbers.length; i++){
    let num = numbers[i]
     if (num < lowest) {
      lowest = num;
       li = i
    }
  }
  
  for ( let i = 0; i < numbers.length; i++){
    let num = numbers[i]
     if (num < secondLowest && li !== i) {
      secondLowest = num;
    }
  }

  
  return lowest + secondLowest
}