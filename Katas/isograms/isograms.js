function isIsogram(str) {
  let count = {};

  for (let i = 0; i < str.length; i++) {
    const char = str[i].toLowerCase();
    if (!count[char]) {
      count[char] = true;
    } else {
      return false;
    }
  }

  return true;
}