function digitize(n) {
  if (n < 10) return [n];
  let number = n;
  let array = [];
  
  while (number > 10) {
    array.push(Math.floor(number % 10));
    number = number / 10;
  }
  array.push(Math.floor(number));
  
  return array;
  
}