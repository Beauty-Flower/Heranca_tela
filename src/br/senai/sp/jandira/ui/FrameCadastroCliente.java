 package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class FrameCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtDataNascimento;
	private final ButtonGroup buttonGroupGenero = new ButtonGroup();
	private final ButtonGroup buttonGroupLinguagens = new ButtonGroup();
	private final JScrollPane scrollPane = new JScrollPane();

	public FrameCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnSalvar = new JButton("Salvar contato");
		btnSalvar.setBounds(191, 227, 233, 23);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 31, 233, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 69, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 89, 233, 20);
		contentPane.add(txtEmail);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_1.setBounds(10, 120, 110, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(10, 139, 110, 20);
		contentPane.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		JRadioButton radioFeminino = new JRadioButton("F");
		buttonGroupGenero.add(radioFeminino);
		radioFeminino.setBounds(126, 138, 31, 23);
		contentPane.add(radioFeminino);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(126, 120, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton radioMasculino = new JRadioButton("M");
		buttonGroupGenero.add(radioMasculino);
		radioMasculino.setBounds(173, 138, 39, 23);
		contentPane.add(radioMasculino);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 170, 46, 14);
		contentPane.add(lblCidade);
		
		JComboBox comboCidade = new JComboBox();
		comboCidade.setModel(new DefaultComboBoxModel(new String[] {"Itapevi", "Jandira", "Barueri", "Osasco", "Carapicu\u00EDba", "Santana de Parna\u00EDna", "Pirapora", "Cotia"}));
		comboCidade.setBounds(10, 195, 202, 22);
		contentPane.add(comboCidade);
		scrollPane.setBounds(291, 32, 97, 145);
		contentPane.add(scrollPane);
		
		JList lsMeses = new JList();
		lsMeses.setModel(new AbstractListModel() {
			String[] values = new String[] {"Janeiro", "Fevereiro", "Mar\u00E7o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(lsMeses);
	}
}
