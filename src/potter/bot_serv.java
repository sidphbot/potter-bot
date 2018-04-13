package potter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.alicebot.ab.*;
import org.alicebot.ab.Bot;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bot_serv
 */
@WebServlet("/bot_serv")
public class bot_serv extends HttpServlet {

	private static final long serialVersionUID = 1L;
	//private static String root=this.getServletConfig().getServletContext().getRealPath(".");
	private static String botname="potter"; 
    private static String path="C:/appdata";
    private static String outputpath="C:/appout/chatlog.txt";
    
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bot_serv() {
        super();
        /*
        String root=this.getServletConfig().getServletContext().getRealPath(".");
        String botname="alice-en"; String path="T:/aiml/program-ab-0.0.4.3/"; Bot bot = new Bot(botname, path);
    	chatSession = new Chat(bot);
    	*/
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("\n in ervlet");
        String output,input;
        File f = new File(outputpath);
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
		
		input=request.getParameter("input_text");
		try{
		Bot bot = new Bot(botname, path);
		Chat chatSession = new Chat(bot);  
		
	//	for(int count=0; count<10; count++){
		output=chatSession.multisentenceRespond(input);
response.setContentType("text/plain");
		
		System.out.println("\n"+output);
		response.getWriter().write("<br>"+output);
		//response.getWriter().write(input);
		bw.write("\n user   : " + input );
		bw.newLine();
		bw.write("\n potter : " + output);
		bw.newLine();
		
		
	//	input=output;
	//	}
		//response.getWriter().write("done");
		}
		catch(Exception e){e.printStackTrace();}
		bw.close();
		fw.close();
	
		
		
	}

}
