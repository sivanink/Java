class StringIndexOutOfBound
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = "apple";
            char c = a.charAt(5); 
            System.out.println(c); 
        } 
        catch(Exception e) { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
} 
