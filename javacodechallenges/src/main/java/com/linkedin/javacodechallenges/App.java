package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args )
    {
       Person p1 = new Person("Someone", "who",27);
       Person p2 = new Person("isn't", "me", 35);
       Person p3 = new Person("aka", "swim", 42); 

       p1.introduction();
       p2.introduction();
       p3.introduction();
    }
}
