function sumArray(array) {
  if (!Array.isArray(array) || array.length <= 1) {
    return 0;
  }

  const sorted = array.sort((a, b) => a - b);
  let sum = 0;

  for (let i = 1; i < sorted.length - 1; i++) {
    sum += sorted[i];
  }

  return sum;
}