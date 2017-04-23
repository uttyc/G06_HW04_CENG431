package project;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class GUI {

	private JFrame frame;
	private JTextField txtTotalCost;
	private JTextField txtCalcTime;
	private JTextField txtExpTime;
	private JDateChooser pickStrtDate;
	private JDateChooser pickEndDate;
	private JSpinner spnSenAnalyst;
	private JSpinner spnJunAnalyst;
	private JSpinner spnSenDes;
	private JSpinner spnJunDes;
	private JSpinner spnSenDev;
	private JSpinner spnJunDev;
	private JSpinner spnEntDev;
	private JSpinner spnSenTester;
	private JSpinner spnTestSpec;
	private JLabel lblAnTeamResult;
	private JLabel lblDesTeamResult;
	private JLabel lblDevTeamResult;
	private JLabel lblTestTeamResult;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label1 = new JLabel("Senior Analyst:");
		label1.setBounds(12, 12, 108, 15);
		frame.getContentPane().add(label1);

		JLabel label2 = new JLabel("Junior Analyst:");
		label2.setBounds(12, 31, 108, 15);
		frame.getContentPane().add(label2);

		JLabel label3 = new JLabel("Senior Designer:");
		label3.setBounds(12, 68, 126, 15);
		frame.getContentPane().add(label3);

		JLabel label4 = new JLabel("Junior Designer:");
		label4.setBounds(12, 84, 126, 15);
		frame.getContentPane().add(label4);

		JLabel label5 = new JLabel("Senior Developer:");
		label5.setBounds(12, 118, 136, 15);
		frame.getContentPane().add(label5);

		JLabel label6 = new JLabel("Junior Developer:");
		label6.setBounds(12, 138, 136, 15);
		frame.getContentPane().add(label6);

		JLabel label7 = new JLabel("Entry Level Developer:");
		label7.setBounds(12, 156, 159, 15);
		frame.getContentPane().add(label7);

		JLabel label8 = new JLabel("Senior Tester:");
		label8.setBounds(12, 197, 108, 15);
		frame.getContentPane().add(label8);

		JLabel label9 = new JLabel("Test Specialist:");
		label9.setBounds(12, 218, 126, 15);
		frame.getContentPane().add(label9);

		spnSenAnalyst = new JSpinner();
		spnSenAnalyst.setBounds(185, 10, 28, 20);
		spnSenAnalyst.setValue(1);
		frame.getContentPane().add(spnSenAnalyst);

		spnJunAnalyst = new JSpinner();
		spnJunAnalyst.setBounds(185, 29, 28, 20);
		spnJunAnalyst.setValue(5);
		frame.getContentPane().add(spnJunAnalyst);

		spnSenDes = new JSpinner();
		spnSenDes.setBounds(185, 61, 28, 20);
		spnSenDes.setValue(2);
		frame.getContentPane().add(spnSenDes);

		spnJunDes = new JSpinner();
		spnJunDes.setBounds(185, 82, 28, 20);
		spnJunDes.setValue(4);
		frame.getContentPane().add(spnJunDes);

		spnSenDev = new JSpinner();
		spnSenDev.setBounds(185, 116, 28, 20);
		spnSenDev.setValue(2);
		frame.getContentPane().add(spnSenDev);

		spnJunDev = new JSpinner();
		spnJunDev.setBounds(185, 136, 28, 20);
		spnJunDev.setValue(7);
		frame.getContentPane().add(spnJunDev);

		spnEntDev = new JSpinner();
		spnEntDev.setBounds(185, 154, 28, 20);
		spnEntDev.setValue(10);
		frame.getContentPane().add(spnEntDev);

		spnSenTester = new JSpinner();
		spnSenTester.setBounds(185, 195, 28, 20);
		spnSenTester.setValue(4);
		frame.getContentPane().add(spnSenTester);

		spnTestSpec = new JSpinner();
		spnTestSpec.setBounds(185, 216, 28, 20);
		spnTestSpec.setValue(2);
		frame.getContentPane().add(spnTestSpec);

		JLabel lblProjectStartDate = new JLabel("Project Start Date:");
		lblProjectStartDate.setBounds(381, 138, 136, 15);
		frame.getContentPane().add(lblProjectStartDate);

		JLabel lblProjectEndDate = new JLabel("Project End Date:");
		lblProjectEndDate.setBounds(381, 174, 136, 15);
		frame.getContentPane().add(lblProjectEndDate);

		JLabel lblTotalCalculatedCost = new JLabel("Total Calculated Cost:");
		lblTotalCalculatedCost.setBounds(12, 336, 175, 15);
		frame.getContentPane().add(lblTotalCalculatedCost);

		txtTotalCost = new JTextField();
		txtTotalCost.setBounds(206, 334, 114, 19);
		frame.getContentPane().add(txtTotalCost);
		txtTotalCost.setColumns(10);

		JLabel lblExpectedTime = new JLabel("Expected Time : ");
		lblExpectedTime.setBounds(405, 278, 127, 15);
		frame.getContentPane().add(lblExpectedTime);

		JLabel lblCalculatedTime = new JLabel("Calculated Time:");
		lblCalculatedTime.setBounds(12, 278, 175, 15);
		frame.getContentPane().add(lblCalculatedTime);

		pickStrtDate = new JDateChooser();
		pickStrtDate.setBounds(522, 136, 117, 25);
		frame.getContentPane().add(pickStrtDate);

		pickEndDate = new JDateChooser();
		pickEndDate.setBounds(522, 174, 117, 25);
		frame.getContentPane().add(pickEndDate);

		JLabel lblAnalysts = new JLabel("Analysis Team : ");
		lblAnalysts.setBounds(50, 421, 121, 15);
		frame.getContentPane().add(lblAnalysts);

		JLabel lblDesignTeam = new JLabel("Design Team : ");
		lblDesignTeam.setBounds(50, 450, 121, 15);
		frame.getContentPane().add(lblDesignTeam);

		JLabel lblDeveloperTeam = new JLabel("Developer Team :");
		lblDeveloperTeam.setBounds(50, 481, 136, 15);
		frame.getContentPane().add(lblDeveloperTeam);

		JLabel lblTestTeam = new JLabel("Test Team :");
		lblTestTeam.setBounds(50, 508, 121, 15);
		frame.getContentPane().add(lblTestTeam);

		lblAnTeamResult = new JLabel("");
		lblAnTeamResult.setBounds(205, 421, 175, 15);
		frame.getContentPane().add(lblAnTeamResult);

		lblDesTeamResult = new JLabel("");
		lblDesTeamResult.setBounds(205, 450, 175, 15);
		frame.getContentPane().add(lblDesTeamResult);

	    lblDevTeamResult = new JLabel("");
		lblDevTeamResult.setBounds(206, 481, 174, 15);
		frame.getContentPane().add(lblDevTeamResult);

		lblTestTeamResult = new JLabel("");
		lblTestTeamResult.setBounds(206, 508, 174, 15);
		frame.getContentPane().add(lblTestTeamResult);

		txtCalcTime = new JTextField();
		txtCalcTime.setColumns(10);
		txtCalcTime.setBounds(206, 276, 114, 19);
		frame.getContentPane().add(txtCalcTime);

		txtExpTime = new JTextField();
		txtExpTime.setColumns(10);
		txtExpTime.setBounds(545, 276, 114, 19);
		frame.getContentPane().add(txtExpTime);

		JButton btnCalculate = new JButton("Calculate Cost and Time");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
				Team analysts = new Team("Analysis Team");
				Member senAnalyst = new Member("Senior", 95, 90, Integer.parseInt(spnSenAnalyst.getValue().toString()));
				Member junAnalyst = new Member("Junior", 65, 150,
						Integer.parseInt(spnJunAnalyst.getValue().toString()));
				
				analysts.add(senAnalyst);
				analysts.add(junAnalyst);

				Team designers = new Team("Design Team");
				Member senDesigner = new Member("Senior", 85, 90, Integer.parseInt(spnSenDes.getValue().toString()));
				Member junDesigner = new Member("Junior", 55, 210, Integer.parseInt(spnJunDes.getValue().toString()));

				designers.add(senDesigner);
				designers.add(junDesigner);

				Team developers = new Team("Developer Team");
				Member senDev = new Member("Senior", 120, 180, Integer.parseInt(spnSenDev.getValue().toString()));
				Member junDev = new Member("Junior", 90, 365, Integer.parseInt(spnJunDev.getValue().toString()));
				Member entLevDev = new Member("Entry Level Developer", 60, 730,
						Integer.parseInt(spnEntDev.getValue().toString()));

				developers.add(senDev);
				developers.add(junDev);
				developers.add(entLevDev);

				Team testers = new Team("Test Team");
				Member senTester = new Member("Senior", 100, 180, Integer.parseInt(spnSenTester.getValue().toString()));
				Member testSpec = new Member("Test Specialist", 130, 90,
						Integer.parseInt(spnTestSpec.getValue().toString()));

				testers.add(senTester);
				testers.add(testSpec);

				lblAnTeamResult.setText(analysts.display());
				lblDesTeamResult.setText(designers.display());
				lblDevTeamResult.setText(developers.display());
				lblTestTeamResult.setText(testers.display());
				
				calculateExpectedDate();

			}
		});
		btnCalculate.setBounds(440, 331, 219, 41);
		frame.getContentPane().add(btnCalculate);

	}
	
	private void calculateExpectedDate(){

		long expectedTime = pickEndDate.getDate().getTime() - pickStrtDate.getDate().getTime(); 
		
		txtExpTime.setText(Long.toString(expectedTime/ (24 * 60 * 60 * 1000))+" days");
	}
}
