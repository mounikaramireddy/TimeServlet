package com.servlet.ex;
import java.io.*;
import java.util.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class TimeServletEx extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res){
		try{
			PrintWriter pw=res.getWriter();
			Date d=new Date();
			int x=d.getHours();
			int y=d.getMinutes();
			int z=d.getSeconds();
			pw.println("<html><body>");
			pw.println(x);
            pw.println(":");
            pw.println(y);
            pw.println(":");
            pw.println(z);
			pw.println("</body></html>");
		}catch(Exception e){
			System.err.println(e);
		}
	}
}

