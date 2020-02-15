class Demo
{
public static void main(String args[])
{
String s,w;
char ch;
int i,l;

System.out.println("Enter a sentence");

s=" ";
l=s.length();
for(i=0;i<l;i++)
{
w=" ";
while(s.charAt(i)!=' ')
{
w=w+s.charAt(i);
i++;
}
ch=w.charAt(0);
ch-=32;
w=ch+w.substring(1);

System.out.print(w+" ");
}

}
}