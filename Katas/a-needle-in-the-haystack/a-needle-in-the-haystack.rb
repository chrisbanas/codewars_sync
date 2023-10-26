# grab the index of needle by iterarting over the array, once needle is found return the index
# join the sentence and index


def find_needle(haystack)
  
  index = 0
  
  i =0
  
  while i < haystack.length
    if haystack[i] == "needle"
      index = i
      end
    i += 1
    end
  
  return "found the needle at position " + index.to_s
  
  
end