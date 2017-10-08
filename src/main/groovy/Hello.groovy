class Hello {
     static void main(String[] args) {
         println "hello"
         def array = $getCallSiteArray()
         println array
     }
}
