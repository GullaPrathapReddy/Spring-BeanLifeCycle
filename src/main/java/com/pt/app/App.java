package com.pt.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pt.app.voter.CheckVoteEligibility;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("com/pt/app/cfgs/applicationContext.xml");
        CheckVoteEligibility vote=null;
        vote =ctx.getBean("voter",CheckVoteEligibility.class);
        System.out.println(vote.VoteEligibilty());
        ((AbstractApplicationContext) ctx).close();
        
    }
}
