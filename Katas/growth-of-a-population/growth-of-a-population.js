function nbYear(p0, percent, aug, p) {
    let pop = p0;
    let years = 0;

    if (percent !== 0 ){
      const change = percent/100 + 1;
    } else {
      const change = 1;
    }
    const change = percent/100 + 1;
  console.log(p0, percent, aug, p)

    while (pop < p) {
      pop = Math.floor(pop * change + aug);
      years++;
    }
  
  
  return years;
}