class Solution(object):
    def groupAnagrams(self, strs): # Added self
        hashmap = {}
    
        for word in strs:
            # Sorting the word creates the unique key for all its anagrams
            key = ''.join(sorted(word))
            
            if key not in hashmap:
                hashmap[key] = []
            
            hashmap[key].append(word)
    
        return list(hashmap.values()) # Using .values() is slightly cleaner