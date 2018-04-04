package mvc3;

import java.awt.BorderLayout;
 
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
 
public class View {
 
 // View uses Swing framework to display UI to user
 private JFrame frame;
 private JLabel nameLabel;
 private JTextField nameTextfield;
 private JButton nameSaveButton;
 private JButton hello;
 private JButton bye;
 
 // Create frame
 public View(String title) {
  frame = new JFrame(title);
  frame.getContentPane().setLayout(new BorderLayout());
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 120);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
 
  // Create UI elements
  nameLabel = new JLabel("Enter Name :");
  nameTextfield = new JTextField();
  nameSaveButton = new JButton("Save Name");
  hello = new JButton("Hello!");
  bye = new JButton("Good-Bye!");
 
  // Add UI element to frame
  GroupLayout layout = new GroupLayout(frame.getContentPane());
  layout.setAutoCreateGaps(true);
  layout.setAutoCreateContainerGaps(true);
  layout.setHorizontalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameLabel))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameTextfield))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameSaveButton))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(hello)
    .addComponent(bye)));
  layout.setVerticalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(nameLabel)
    .addComponent(nameTextfield).addComponent(nameSaveButton).addComponent(hello))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    .addComponent(bye)));
 
  layout.linkSize(SwingConstants.HORIZONTAL, nameSaveButton);
  layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
  frame.getContentPane().setLayout(layout);
 }
 
 public JFrame getFrame() {
  return frame;
 }
 
 public void setFrame(JFrame frame) {
  this.frame = frame;
 }
 
 public JLabel getNameLabel() {
  return nameLabel;
 }
 
 public void setNameLabel(JLabel nameLabel) {
  this.nameLabel = nameLabel;
 }
 
 public JTextField getNameTextfield() {
  return nameTextfield;
 }
 
 public void setNameTextfield(JTextField nameTextfield) {
  this.nameTextfield = nameTextfield;
 }
 
 public JButton getNameSaveButton() {
  return nameSaveButton;
 }
 
 public void setNameSaveButton(JButton nameSaveButton) {
  this.nameSaveButton = nameSaveButton;
 }
 
 public JButton getHello() {
  return hello;
 }
 
 public void setHello(JButton hello) {
  this.hello = hello;
 }
 
 public JButton getBye() {
  return bye;
 }
 
 public void setBye(JButton bye) {
  this.bye = bye;
 }
 
}