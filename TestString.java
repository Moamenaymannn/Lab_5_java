import lab5Package.StringInterFace;
public class TestString{

public static void BetterString (String first,String second,StringInterFace obj){
if(obj.compare(first,second)==true)
System.out.println(first);
else
System.out.println(second);
}
public static void main(String args[]){
StringInterFace obj = ( first, second ) -> (first.length()>second.length());
String name1 ="Hello";
String name2 = "java";
BetterString(name1,name2,obj);

}}

