def disemvowel(str)
  new_str = ""
  vowels = "AEIOUaeiou"
  
  str.each_char do |char|
    if vowels.include?(char)
      new_str += ""
    else
      new_str += char
    end
    end
  return new_str
end