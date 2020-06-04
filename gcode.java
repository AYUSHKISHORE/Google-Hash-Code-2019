import java.io.*;
import java.util.*;
class Sol
{
public static void main(String[]args)throws Exception
{
File file = new File("C:\\Users\\nEW u\\Desktop\\Google\\a_example.txt");
File file1 = new File("C:\\Users\\nEW u\\Desktop\\Google\\b.txt");
BufferedReader br = new BufferedReader(new FileReader(file));
BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
int t=Integer.parseInt(br.readLine());
int z=t;
long a[]=new long[t];
long b[]=new long[t];
int k=0;
long k111=0;
int countH=0;
int flag=0;
int countV=0,take2=0,pic=0,extra=0,pic1=0;
while(t-->0)
{
String n[]=br.readLine().trim().split(" ");
if(n[0].equals("H"))
{
	//System.out.println("hello\n");
	a[k]=k111;
	b[k]=0;
	countH++;
}
else
{
	flag=1;
	//System.out.println("hello1\n");
	countV++;
	a[k]=k111;
	b[k]=1;
}
k++;
k111++;
//System.out.println(k);
}
//System.out.println(countV);
if(countV%2==0)
{
	take2=1;
	pic1=countV/2;
	extra=countV%2;
}
else
{
	take2=0;
	pic1=countV/2;
	extra=countV%2;
}
int count=countH+pic1+extra;
bw.write(count+"\n");
for(int i=0;i<z;i++)
{
	
	if(b[i]==0)
	{
		bw.write(i+"\n");
		count++;
	}
}
if(flag==1)
{
	int k1=0;
	long g[]=new long[pic1*2];
for(int i=0;i<z;i++)
{
	if(b[i]==1)
	{
		g[k1]=a[i];
		k1++;
	}
}
int j=0;
for(int i=0;i<pic1;i++)
{
	bw.write(g[j]+" "+g[j+1]+"\n");
	bw.flush();
	j=j+2;
}
}
br.close();
bw.close();
}
}