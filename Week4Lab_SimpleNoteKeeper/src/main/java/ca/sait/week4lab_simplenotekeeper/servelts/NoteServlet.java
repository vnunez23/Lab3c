
package ca.sait.week4lab_simplenotekeeper.servelts;

import ca.sait.week4lab_simplenotekeeper.javabeans.Note;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author VNune
 */
public class NoteServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String query = request.getQueryString();
        
        if(query != null && query.contains("edit")){
            //display the edit form
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
        }
        else{
            //Display the note
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            // to read files
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            String title = br.readLine();
            String contents = br.readLine();

            Note note = new Note(title, contents);

            request.setAttribute("note", note);

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(title);
        pw.println(contents);
        pw.close();
        
        
        response.sendRedirect("note");
    }
}
