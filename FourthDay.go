package main

import( "fmt"
        "os"
        "sort"
        "strings"
)
func main(){
  list := strings.Split(os.Args[1], "\n")
  valid := 0
  for _, element := range list {
    if !(containsDouplicats(element)) {
      valid++
    }
  }
  fmt.Println(valid)
}
func containsDouplicats(s string)(isTrue bool){
  elist := strings.Split(s, " ")
  sort.Strings(elist)
  for index, element := range elist {
    for _, e := range elist[index+1:] {
        if (isAnagram(e, element)){
          return true
        }
    }
  }
  return false;
}
func isAnagram(s, checker string)(isTrue bool){
  if len(s)!=len(checker) {
    return false
  }
  list:= strings.Split(s, "")
  elist:= strings.Split(checker, "")
  sort.Strings(list)
  sort.Strings(elist)
  fmt.Println(list)
  fmt.Println(elist)
  for index, element := range list {
      if 0!=strings.Compare(element, elist[index]) {
          return false;
      }
  }
  return true
}
