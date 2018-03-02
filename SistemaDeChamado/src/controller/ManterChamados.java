package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Chamado;
import service.ChamadoService;

/**
 * Servlet implementation class ManterClienteController
 */
@WebServlet("/ManterChamados.do")
public class ManterChamados extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	String pAcao = request.getParameter("acao");
    	String pId_Chamado = request.getParameter("id_Chamado");
    	String pDescricao = request.getParameter("descricao");
        String pFila = request.getParameter("id_Fila");
        int id_Chamado = -1;
		try {
			id_Chamado = Integer.parseInt(pId_Chamado);
		} catch (NumberFormatException e) {
		}
        
        //instanciar o javabean
        Chamado chamado = new Chamado();
        chamado.setId_Chamado(id_Chamado);
        chamado.setDescricao(pDescricao);
        chamado.setId_Fila(pFila);;
        
        //instanciar o service        
        ChamadoService cs = new ChamadoService();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
        
        if (pAcao.equals("Criar")) {
        	cs.abrirChamado(chamado);
        	chamado = cs.consultarChamado(chamado.getId_Chamado());
        	view = request.getRequestDispatcher("home.jsp");
        }
        view.forward(request, response);
        
    }
}