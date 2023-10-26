function fakeBin(x) {
  let newString = []
  for (let i = 0; i < x.length; i++) {
    const char = x[i]
    if (Number(char) >= 5) {
      newString.push("1")
    } else {
      newString.push("0")
    }
  }
  
  return newString.join("")
}