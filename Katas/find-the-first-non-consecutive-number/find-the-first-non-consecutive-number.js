function firstNonConsecutive (arr) {
  for (let i = 1; i < arr.length; i++){
    const current = arr[i];
    const post = arr[i - 1];
    const dif = current - post;
    if (dif !== 1) return current;
  }
  
  return null;
}