package mvc3;

import javax.swing.JOptionPane;
 
public class Controller {
 
 private Model model;
 private View view;
 
 public Controller(Model m, View v) {
  model = m;
  view = v;
  initView();
 }
 
 public void initView() {
  view.getNameTextfield().setText(model.getName());
 }
 
 public void initController() {
  view.getNameSaveButton().addActionListener(e -> saveName());
  view.getHello().addActionListener(e -> sayHello());
  view.getBye().addActionListener(e -> sayBye());
 }
 
 private void saveName() {
  model.setName(view.getNameTextfield().getText());
  JOptionPane.showMessageDialog(null, "Name saved : " + model.getName(), "Info", JOptionPane.INFORMATION_MESSAGE);
 }
 
 private void sayHello() {
  JOptionPane.showMessageDialog(null, "Hello " + model.getName() + "!", "Info", JOptionPane.INFORMATION_MESSAGE);
 }
 
 private void sayBye() {
  System.exit(0);
 }
 
}