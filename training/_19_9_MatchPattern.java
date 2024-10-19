package com.yash.training;

class MatchPatternUtil
{
    public  int[] matchabSequence(String string){
        int count=0;
        for(int i=0; i<string.length()-1; i++)
        {
            if(string.substring(i,i+2).equals("ab"))
            {
                count++;

            }
        }
        int result[]=new int[count];
        int indx=0;
        for(int i=0; i<string.length()-1; i++)
        {
            if(string.substring(i,i+2).equals("ab"))
            {
                result[indx++]=i;
            }
        }
        return result;
    }

    public  int[] findDigitLocation(String string){
        int count=0;

        for(int i=0; i<string.length(); i++)
        {
            if(Character.isDigit(string.charAt(i)))
            {
                count++;
            }
        }
        int[] result=new int[count];
        int index=0;
        for(int i=0; i<string.length(); i++)
        {
            if(Character.isDigit(string.charAt(i)))
            {
                result[index++]=i;

            }
        }
        return result;

    }

    public  int[]findWhiteSpaces(String string){
        int count=0;
        for(int i=0; i<string.length()-1; i++)
        {
            if(string.charAt(i)==' ')
            {
                count++;
            }
        }
        int[] result=new int[count];
        int index=0;

        for(int i=0; i<string.length(); i++)
        {
            if(string.charAt(i)==' ')
            {
                result[index++]=i;
            }
        }
        return result;
    }

    public static int[]findPattern(String string){
        int count=0;

        for(int i=0; i<string.length()-2; i++)
        {
            if(string.charAt(i)=='0'&&(string.charAt(i+1)=='x' || string.charAt(i+1)=='X') &&Character.toString(string.charAt(i+2)).matches("[0-9a-fA-F]")) // we are using regression expression here where we simply uses the .matches
            {
            count++;
            }
        }
        int[] result=new int[count];
        int index=0;
        for(int i=0; i<string.length()-2; i++)
        {
            if(string.charAt(i)=='0'&&(string.charAt(i+1)=='x' || string.charAt(i+1)=='X') &&Character.toString(string.charAt(i+2)).matches("[0-9a-fA-F]"))  // 0-9=0 1 2 3...9  a-f=,A-F=
            {
                result[index++]=i;
            }
        }

        return result;
    }
}



public class _19_9_MatchPattern {
    public static void main(String[] args) {
        MatchPatternUtil m=new MatchPatternUtil();
        int[] MatchSeqresult=m.matchabSequence("abaaaba");
        System.out.println("The index which hold the match pattern 'ab' is: ");
        for(int r:MatchSeqresult)
        {
            System.out.print(r+" ");
        }

        System.out.println();
        System.out.println();

        System.out.println("The Digit location of the string is: ");
        int[] digitLocResult=m.findDigitLocation("a12c3e456f");
        for(int r:digitLocResult)
        {
            System.out.print(r+" ");
        }

        System.out.println();
        System.out.println();


        System.out.println("The index which holds whitespaces is: ");
        int [] countSpaces=m.findWhiteSpaces("a 1 56 _Z");
        for(int r:countSpaces)
        {
            System.out.print(r+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("");
        int[] matches=m.findPattern("12 0x 0x120Xf 0Xg");
        for(int r:matches)
        {
            System.out.print(r+" ");
        }
    }
}
