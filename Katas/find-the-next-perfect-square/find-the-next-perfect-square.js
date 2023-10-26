function findNextSquare(sq) {
  const num = Math.floor(Math.sqrt(sq))
  console.log(num)
  console.log(sq)
 
  if (num * num !== sq) return -1 
  
  return (num + 1) * (num +1)

}