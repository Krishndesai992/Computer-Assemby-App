import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ComputerAssemblyApp 
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            JFrame frame = new JFrame("Computer Assembly System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            // Header
            JLabel header = new JLabel("Computer Assembly System", SwingConstants.CENTER);
            header.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(header, BorderLayout.NORTH);

            // Text area for displaying instructions
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            textArea.setFont(new Font("Arial", Font.PLAIN, 14));
            frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

            // Button Panel
            JPanel buttonPanel = new JPanel();
            JButton componentsButton = new JButton("Show Components");
            JButton assemblyButton = new JButton("Show Assembly Steps");
            JButton exitButton = new JButton("Exit");

            buttonPanel.add(componentsButton);
            buttonPanel.add(assemblyButton);
            buttonPanel.add(exitButton);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            // Action Listeners
            componentsButton.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    textArea.setText("Components:\n" +
                            "- CPU\n" +
                            "- Motherboard\n" +
                            "- RAM\n" +
                            "- Storage\n" +
                            "- Power Supply\n" +
                            "- Graphics Card\n");
                }
            });

            assemblyButton.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    textArea.setText("Assembly Steps:\n" +
                            "1. Install the CPU on the motherboard.\n" +
                            "2. Attach the RAM to the motherboard.\n" +
                            "3. Mount the motherboard in the case.\n" +
                            "4. Connect the power supply.\n" +
                            "5. Install the storage drives.\n" +
                            "6. Install the graphics card.\n");
                }
            });

            exitButton.addActionListener(new ActionListener() 
            {
                @Override

                public void actionPerformed(ActionEvent e) 
                {
                    System.exit(0);
                }
            });

            // Show the frame
            frame.setVisible(true);
        });
    }
}
