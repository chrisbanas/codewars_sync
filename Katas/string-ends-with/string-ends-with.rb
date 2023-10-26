# we take the length of the ending and isolate that index from the end of the str. if both match, true, otherwise false



def solution(str, ending)
  
  i = ending.length
  
  
  if str[-i..-1] == ending || ending == ""
    return true
    else
    return false
    end
    
end