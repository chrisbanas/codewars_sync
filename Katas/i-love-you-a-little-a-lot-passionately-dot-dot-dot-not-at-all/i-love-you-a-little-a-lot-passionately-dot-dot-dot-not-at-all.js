function howMuchILoveYou(nbPetals) {
    const last = nbPetals % 6;
    const phrases = { 0 : "not at all", 
                     1 : "I love you", 
                     2 : "a little", 
                     3 : "a lot",
                     4 : "passionately",
                     5 : "madly",
                     6: "not at all"};
  
  return phrases[last];
}