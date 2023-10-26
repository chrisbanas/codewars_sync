function openOrSenior(data){
  let output = [];
  
  for (let i = 0; i < data.length; i++) {
    const age = data[i][0];
    const handicap = data[i][1];
    if ( age >= 55 && handicap > 7) {
      output.push("Senior");
    } else {
      output.push("Open");
    }
  }
  
  return output;
}