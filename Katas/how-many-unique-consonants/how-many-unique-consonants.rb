# we will iterate over each char of the sting and use a hash to store the count of the char in the string 
# we will then return the count of the constants that only had a count of 1 in the string



def count_consonants(s)
  normalized_str = s.downcase.chars.select { |c| c.ord.between?(32, 126) }
  
  consonants = ('a'..'z').to_a - ['a', 'e', 'i', 'o', 'u']
  
  unique_consonants = Set.new
  
  normalized_str.each do |char|
    unique_consonants << char if consonants.include?(char)
  end
  
  unique_consonants.size
end