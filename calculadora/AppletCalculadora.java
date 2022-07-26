
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class AppletCalculadora implements ActionListener {

    JFrame frame = new JFrame();
    Panel panel1, panel2;
    BorderLayout borderLayout = new BorderLayout();
    Button Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button0, ButtonSumar, ButtonRestar, ButtonMultiplicar, ButtonDividir, ButtonIgual, ButtonC, ButtonCE, ButtonPunto;
    TextField textFieldResultado;
    private double numero = 0.0;
    private String calc;
    private String operacion;

    public AppletCalculadora() {
        frame.setTitle("AppletCalculadora");
        frame.setLayout(borderLayout);
        panel1 = new Panel(new GridLayout(1, 1, 5, 5));
        panel2 = new Panel(new GridLayout(6, 3, 5, 5));

        textFieldResultado = new TextField();
        //textFieldResultado.setEditable(false);
        panel1.add(textFieldResultado);

        ButtonSumar = new Button("+");
        ButtonRestar = new Button("-");
        ButtonMultiplicar = new Button("*");
        ButtonDividir = new Button("/");
        ButtonCE = new Button("CE");
        ButtonC = new Button("C");
        ButtonIgual = new Button("=");
        Button1 = new Button("1");
        Button2 = new Button("2");
        Button3 = new Button("3");
        Button4 = new Button("4");
        Button5 = new Button("5");
        Button6 = new Button("6");
        Button7 = new Button("7");
        Button8 = new Button("8");
        Button9 = new Button("9");
        Button0 = new Button("0");
        ButtonPunto = new Button(".");

        panel2.add(Button1);
        panel2.add(Button2);
        panel2.add(Button3);
        panel2.add(Button4);
        panel2.add(Button5);
        panel2.add(Button6);
        panel2.add(Button7);
        panel2.add(Button8);
        panel2.add(Button9);
        panel2.add(ButtonPunto);
        panel2.add(Button0);
        panel2.add(ButtonCE);
        panel2.add(ButtonSumar);
        panel2.add(ButtonRestar);
        panel2.add(ButtonIgual);
        panel2.add(ButtonMultiplicar);
        panel2.add(ButtonDividir);
        panel2.add(ButtonC);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonSumar.addActionListener(this);
        ButtonRestar.addActionListener(this);
        ButtonMultiplicar.addActionListener(this);
        ButtonDividir.addActionListener(this);
        Button1.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        Button4.addActionListener(this);
        Button5.addActionListener(this);
        Button6.addActionListener(this);
        Button7.addActionListener(this);
        Button8.addActionListener(this);
        Button9.addActionListener(this);
        Button0.addActionListener(this);
        ButtonCE.addActionListener(this);
        ButtonC.addActionListener(this);
        ButtonIgual.addActionListener(this);
        ButtonPunto.addActionListener(this);
    }

    public static void main(String args[]) {
        new AppletCalculadora();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button1) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "1");
        } else if (e.getSource() == Button2) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "2");
        } else if (e.getSource() == Button3) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "3");
        } else if (e.getSource() == Button4) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "4");
        } else if (e.getSource() == Button5) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "5");
        } else if (e.getSource() == Button6) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "6");
        } else if (e.getSource() == Button7) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "7");
        } else if (e.getSource() == Button8) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "8");
        } else if (e.getSource() == Button9) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "9");
        } else if (e.getSource() == Button0) {
            calc = textFieldResultado.getText();
            textFieldResultado.setText(calc + "0");
        } else if (e.getSource() == ButtonPunto) {
            calc = textFieldResultado.getText();
            if (calc.length() == 0) {
                calc = "0.";
            } else if ("0".equals(calc)) {
                calc = "0.";
            } else if (!calc.contains(".")) {
                calc += ".";
            }
            textFieldResultado.setText(calc);
        } else if (e.getSource() == ButtonSumar) {
            Operacion("Sumar");
        } else if (e.getSource() == ButtonRestar) {
            Operacion("Restar");
        } else if (e.getSource() == ButtonMultiplicar) {
            Operacion("Multiplicar");
        } else if (e.getSource() == ButtonDividir) {
            Operacion("Dividir");
        } else if (e.getSource() == ButtonIgual) {

            clicIgual();
        } else if (e.getSource() == ButtonCE) {
            textFieldResultado.setText("");
        } else if (e.getSource() == ButtonC) {
            textFieldResultado.setText("");
            calc = "";
            numero = 0;
            operacion = "";
        }
    }

    void Operacion(String Operador) {
        if (!"".equals(textFieldResultado.getText())) {
            numero = Double.parseDouble(textFieldResultado.getText());
            textFieldResultado.setText("");
            operacion = Operador;
        }
    }

    void clicIgual() {
        if (!"".equals(textFieldResultado.getText())) {
            Double calcDouble = Double.parseDouble(textFieldResultado.getText());
            switch (operacion) {
                case "Sumar" -> {
                    calcDouble += numero;
                    textFieldResultado.setText(calcDouble.toString());
                    operacion = "";
                }
                case "Restar" -> {
                    calcDouble = numero - calcDouble;
                    textFieldResultado.setText(calcDouble.toString());
                    operacion = "";
                }
                case "Multiplicar" -> {
                    calcDouble = numero * calcDouble;
                    textFieldResultado.setText(calcDouble.toString());
                    operacion = "";
                }
                case "Dividir" -> {
                    calcDouble = numero / calcDouble;
                    textFieldResultado.setText(calcDouble.toString());
                    operacion = "";
                }
                default -> {
                    break;
                }
            }
            numero = calcDouble;
            calc = "0";
        }
    }
}
