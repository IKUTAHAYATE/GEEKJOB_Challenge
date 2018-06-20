import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author triveransaruku
 */
public class method7 extends HttpServlet {

    public String[] user_plofile(String id){
        String[] user ={"1","技育太郎","東京",null,"プログラマー"};
        String[] user2 ={"2","技育花子",null,"女","システムエンジニア"};
        String[] user3 ={"3","技育三郎","大阪","男",null};
        
        if(id == user[0]){
            return user;
        }
        else if(id == user2[0]){
                return user2;
        }
        else if(id==user3[0]){
            return user3;   
        }    
        else{ 
            return null;
        }
    }
            
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String[] info = user_plofile("1");
            
            //呼び出し処理
            for(int i=0;i<5;i++){
                if(i==0){
                    continue;
                  
                }
                if(info[i]==null){
                    continue;
                }
                out.print(info[i]);
                
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
