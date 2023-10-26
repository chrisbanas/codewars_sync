function twiceAsOld(dadYearsOld, sonYearsOld) {
  const son2X = sonYearsOld * 2
  
  if (son2X > dadYearsOld ){
    return son2X - dadYearsOld;
  } else {
    return dadYearsOld - son2X
  }
}