/*------------------------------------------------
 * Autor: Diogo Souza
 * Data:30/06/2018
 *------------------------------------------------
 * Descri��o: Tela de Cadastro de Gerente,
 * feito pelo administrador
 *------------------------------------------------
 * Hist�rico de modifica��o
 * Data             Autor                   Descri��o
 *
 *----------------------------------------------------------------------*/
 
package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Gerente;
import excecoes.CPFNaoEncontradoException;
import negocio.ClasseAssistente;
import negocio.Fachada;
import negocio.Mensagem;
import negocio.ValidarDados;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TelaCadGerente extends JFrame {

	private JPanel contentPane;
	private static TelaCadGerente instance;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldEmail;
	
	public static TelaCadGerente getInstance() {
		if (instance == null)
			instance = new TelaCadGerente();
		return instance;
	}
	
	public void limparcampos() {
		textFieldNome.setText("");
		textFieldCPF.setText("");
		textFieldEmail.setText("");
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadGerente frame = new TelaCadGerente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadGerente() {
		setTitle("An\u00E1lise de Vendas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 135, 594, 437);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(76, 63, 46, 14);
		panel.add(lblNome);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(175, 62, 250, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(76, 116, 46, 14);
		panel.add(lblCPF);
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(175, 115, 140, 20);
		panel.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(76, 175, 46, 14);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(175, 174, 250, 20);
		panel.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void ActionPerformed(ActionEvent arg0) throws CPFNaoEncontradoException {
			if(ValidarDados.validarCampoVazio(textFieldNome.getText(),textFieldCPF.getText(),textFieldEmail.getText()))	{
				try {
					Gerente gerentecadastrado;
					Gerente gerente = new Gerente(textFieldNome.getText(),textFieldCPF.getText(),
							textFieldEmail.getText(),ClasseAssistente.gerarSenha(),"Gerente");
					gerentecadastrado = (Gerente)Fachada.getInstance().procurarFunc(textFieldCPF.getText());
					if(gerentecadastrado == null) {
						Fachada.getInstance().cadastrar(gerente);
						JOptionPane.showMessageDialog(null, Mensagem.CADGERENTESUC);
						limparcampos();
					}else {
						Popup.GerenteCadErro();
					}
					
				}catch(NumberFormatException nfe) {
					Popup.numberFormat();
				}
			}
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		btnCadastrar.setBounds(326, 254, 99, 23);
		panel.add(btnCadastrar);
		
		JLabel lblCadastroGerente = new JLabel("Cadastro de gerente");
		lblCadastroGerente.setBounds(10, 82, 173, 25);
		lblCadastroGerente.setForeground(Color.WHITE);
		lblCadastroGerente.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblCadastroGerente);
		
		JButton btnAjuda = new JButton("Informa\u00E7\u00F5es de Ajuda");
		btnAjuda.setBounds(10, 48, 152, 23);
		btnAjuda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAjuda.setIcon(new ImageIcon(TelaCadGerente.class.getResource("/imagem/question.png")));
		btnAjuda.setForeground(Color.BLACK);
		btnAjuda.setBorder(null);
		btnAjuda.setBorderPainted(false);
		btnAjuda.setBackground(Color.WHITE);		
		contentPane.add(btnAjuda);
	}
}
