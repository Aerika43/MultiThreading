/*we can create string with three types

1.String
- string is immutable(non-changeable) they can create new object if we do any changes in the string
ex : string name = "nothing"+"hello";
name.concat("is the best");
if we can concat the name with some string so new object will create in the memory

2.String Buffer
-string buffer is mutable they can change the vale of the string
-it has all the synchronized (can run continuously) methods

3.String Builder
-string builder is also mutable they can change the value of the string
-it has all the non+-synchronized (cant run continuously) methods

all the methos are same in StringBuffer and StringBuilder
*/
package String;

public class buffer_builder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        //sb.append ("Hello");
        System.out.println(sb.capacity()); //16
        
         //sb.append ("World");
        System.out.println(sb.capacity()); //16
        
         //sb.append ("Nothing Java");
        System.out.println(sb.capacity()); //34    (old capacity*2)+2 or (old capacity+1)*2
        
        //append method
        sb.append("Nothing is the Java");  
        System.out.println(sb);
        
        //delete
        sb.delete(2,5);
        System.out.println(sb);
        
        //delete a specific character
        sb.deleteCharAt(5);
        System.out.println(sb);
        
        //reverse the string 
        System.out.println(sb.reverse());
        
        //replace the string
        System.out.println(sb.replace(2, 3, "not"));
        
        //subsequence
        System.out.println(sb.subSequence(2, 6));
        
        //to set the capacity
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        
        //set the character at any position
        sb.setCharAt(2, 'a');
        System.out.println(sb);
        
        //to set the maximum length of the string
        sb.setLength(10);
        System.out.println(sb);
        
        //trim the capacity of the string
        sb.ensureCapacity(100);
        sb.append("hello");        
        sb.trimToSize();
        System.out.println(sb);
        System.out.println(sb.capacity());
        
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello");
        System.out.println(sb1);      
    }
}
