import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Combo;

public class TelaDeCadastro {

	protected Shell shlCadastroDeCliente;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaDeCadastro window = new TelaDeCadastro();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCadastroDeCliente.open();
		shlCadastroDeCliente.layout();
		while (!shlCadastroDeCliente.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCadastroDeCliente = new Shell();
		shlCadastroDeCliente.setSize(555, 412);
		shlCadastroDeCliente.setText("Cadastro de Cliente");
		
		Label lblNome = new Label(shlCadastroDeCliente, SWT.NONE);
		lblNome.setBounds(10, 10, 55, 15);
		lblNome.setText("Nome");
		
		text = new Text(shlCadastroDeCliente, SWT.BORDER);
		text.setBounds(10, 31, 195, 24);
		
		Label lblDataDeNascimento = new Label(shlCadastroDeCliente, SWT.NONE);
		lblDataDeNascimento.setBounds(10, 69, 158, 15);
		lblDataDeNascimento.setText("Data de Nascimento");
		
		DateTime dateTime = new DateTime(shlCadastroDeCliente, SWT.BORDER);
		dateTime.setBounds(10, 90, 80, 24);
		
		Label lblEmail = new Label(shlCadastroDeCliente, SWT.NONE);
		lblEmail.setBounds(295, 10, 55, 15);
		lblEmail.setText("Email");
		
		text_1 = new Text(shlCadastroDeCliente, SWT.BORDER);
		text_1.setBounds(295, 31, 195, 24);
		
		text_2 = new Text(shlCadastroDeCliente, SWT.BORDER);
		text_2.setBounds(10, 147, 195, 24);
		
		Label lblTelefone = new Label(shlCadastroDeCliente, SWT.NONE);
		lblTelefone.setBounds(10, 126, 55, 15);
		lblTelefone.setText("Telefone");
		
		Button btnNewButton = new Button(shlCadastroDeCliente, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(350, 293, 105, 70);
		btnNewButton.setText("Finalizar");
		
		Button button = new Button(shlCadastroDeCliente, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button.setText("Cancelar");
		button.setBounds(461, 317, 68, 46);
		
		Label lblEndereo = new Label(shlCadastroDeCliente, SWT.NONE);
		lblEndereo.setBounds(10, 246, 55, 15);
		lblEndereo.setText("Endere\u00E7o");
		
		text_3 = new Text(shlCadastroDeCliente, SWT.BORDER);
		text_3.setBounds(10, 267, 195, 24);
		
		Label lblEndereo_1 = new Label(shlCadastroDeCliente, SWT.NONE);
		lblEndereo_1.setBounds(10, 297, 80, 15);
		lblEndereo_1.setText("Endere\u00E7o 2");
		
		text_4 = new Text(shlCadastroDeCliente, SWT.BORDER);
		text_4.setBounds(10, 318, 195, 24);
		
		Label lblEstado = new Label(shlCadastroDeCliente, SWT.NONE);
		lblEstado.setBounds(10, 185, 55, 15);
		lblEstado.setText("Estado");
		
		Combo combo = new Combo(shlCadastroDeCliente, SWT.NONE);
		combo.setBounds(10, 206, 105, 15);

	}
}
