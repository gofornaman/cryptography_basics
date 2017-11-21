import java.util.*;
import java.lang.*;
public class GridCrypt{
public static void main(String[] args)
{
String plainText="";
String
secretKey="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

System.out.println("Enter Password : ");
Scanner s=new Scanner(System.in);
plainText=s.next().toUpperCase();

System.out.println("Password before encryption : "+plainText);
String encryptedText=encrypt(plainText,secretKey);
System.out.println("Password after encryption : "+encryptedText);
String decryptedText=decrypt(encryptedText,secretKey);
for(int i=0;i<decryptedText.length();i++)
{
if(decryptedText.charAt(i)=='[')
{
StringBuilder decryptBuilder=new StringBuilder(decryptedText);
decryptBuilder.setCharAt(i,'A');
decryptedText=decryptBuilder.toString();
}
}
System.out.println("Password after decryption : "+decryptedText);
}
private static String encrypt(String plainText,String secretKey)
{
StringBuffer encyptedString=new StringBuffer();
int encryptedInt;
for(int i=0;i<plainText.length();i++)
{
int plainTextInt=(int)(plainText.charAt(i)-'A');
int secretKeyInt=(int)(secretKey.charAt(i)-'A');
encryptedInt=(plainTextInt+secretKeyInt)%26;
encyptedString.append((char)((encryptedInt)+(int)'A'));
}
return encyptedString.toString();
}
private static String decrypt(String decryptedText,String secretKey)
{
StringBuffer decryptedString=new StringBuffer();
int decryptedInt;
for(int i=0;i<decryptedText.length();i++)
{
int decryptedTextInt=(int)(decryptedText.charAt(i)-'A');

int secretKeyInt=(int)(secretKey.charAt(i)-'A');
decryptedInt=decryptedTextInt-secretKeyInt;
if(decryptedInt<1)
decryptedInt+=26;
decryptedString.append((char)((decryptedInt)+(int)'A'));
}
return decryptedString.toString();
}
}