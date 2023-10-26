function longest(s1, s2) {

  let combo = s1 + s2;

  let arr = combo.split("");
  
  let unique = new Set(arr);

  let values = [...unique.values()];

  let sorted = values.sort();

  let word = sorted.join("");
  
  return word;
}