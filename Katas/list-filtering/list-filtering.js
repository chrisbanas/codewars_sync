function filter_list(l) {
  let arr = [];
  l.forEach(function (item) {
    if (typeof item === 'number') {
      arr.push(item);
    }
  });
  return arr;
}