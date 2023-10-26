function powersOfTwo(n){
  if (n === 0) return [1]
  let arr = [1]
  for (let i = 1; i <= n; i++) {
    arr.push(Math.pow(2, i));
  }
  
  return arr
}