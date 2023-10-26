function enough(cap, on, wait) {
  let passangers = on + wait
  return passangers <= cap ? 0 : passangers - cap;
}