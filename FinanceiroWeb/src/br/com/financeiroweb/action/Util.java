package br.com.financeiroweb.action;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * M�todos para manipular o HttpSession
 * @author Helder
 *
 */
public class Util{

	public static HttpSession getSession(){
        return (HttpSession)
          FacesContext.
          getCurrentInstance().
          getExternalContext().
          getSession(false);
      }
       
      public static HttpServletRequest getRequest(){
       return (HttpServletRequest) FacesContext.
          getCurrentInstance().
          getExternalContext().getRequest();
      }
 
      public static String getUserName(){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return  session.getAttribute("login").toString();
      }
       
      public static String getUserId(){
        HttpSession session = getSession();
        if ( session != null ){
            return (String) session.getAttribute("userid");
        }else{
            return null;
        }
      }
	
}
