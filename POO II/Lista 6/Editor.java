package Lista6;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.UndoManager;

public class Editor extends JFrame {
	
	private UndoManager undoManager = new UndoManager();
	private JTextArea texto = new JTextArea(30, 70);
	private JFileChooser escolhe = new JFileChooser();
	JScrollPane scroll;
	FileFilter filter;
	int tamanhoSalvo = 0;
	
	Editor(){
		scroll = new JScrollPane(texto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		filter = new FileNameExtensionFilter("Texto Puro", "txt");
		escolhe.setFileFilter(filter);
		
		add(scroll);
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);
		JMenu arquivo = new JMenu("Arquivo");
		menu.add(arquivo);
		arquivo.add(Abrir);
		arquivo.add(Salvar);
		arquivo.addSeparator();
		arquivo.add(Sair);
		
		texto.getDocument().addUndoableEditListener(undoManager);
		
		JMenu desfaz = new JMenu("Comandos");
		menu.add(desfaz);
		desfaz.add(Desfazer);
		desfaz.add(Refaz);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	Action Desfazer = new AbstractAction("Desfazer") {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(undoManager.canUndo()) {
				undoManager.undo();
			}
		}
	};
	
	Action Refaz  = new AbstractAction("Refazer") {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(undoManager.canRedo()) {
				undoManager.redo();
			}
		}
	};
	Action Abrir = new AbstractAction("Abrir um arquivo") {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(escolhe.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				abrirArquivo(escolhe.getSelectedFile().getAbsolutePath());
			}
		}
	};
	
	Action Salvar = new AbstractAction("Salvar um arquivo") {
		@Override
		public void actionPerformed(ActionEvent e) {
			salvaArquivo();
		}
	};
	
	Action Sair = new AbstractAction("Sair") {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(texto.getText().length() > tamanhoSalvo) {
				int opc = JOptionPane.showConfirmDialog(null, "Deseja salvar?");
				if (opc == JOptionPane.YES_OPTION) {
					salvaArquivo();
					System.exit(0);
				} else {
					System.exit(0);
				}
			} else {
				System.exit(0);
			}
		}
	};
	
	public void abrirArquivo(String nomeArquivo) {
		FileReader leitor = null;
		try {
			leitor = new FileReader(nomeArquivo);
			texto.read(leitor, null);
			leitor.close();
			setTitle(nomeArquivo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void salvaArquivo() {
		if (escolhe.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			FileWriter gravador = null;
			try {
				gravador = new FileWriter(escolhe.getSelectedFile().getAbsolutePath() + ".txt");
				texto.write(gravador);
				gravador.close();
				tamanhoSalvo = texto.getText().length();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Editor meuEditor = new Editor();
		meuEditor.setTitle("Java Notepad");
	}

}
