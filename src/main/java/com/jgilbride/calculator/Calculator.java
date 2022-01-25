package com.jgilbride.calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator implements ActionListener
{
    int c;
    int currentValue, storedValue;
    Frame f;
    Button[] bNum;
    Button bAdd, bSub, bMul, bDiv, bEqu, bCle;
    Panel p;
    public TextField textField;
    GridLayout g;

    Calculator(int width, int height)
    {
        f = new Frame("Calculator");
        f.setLayout(new FlowLayout());
        p = new Panel();

        textField = new TextField(width / 10);
        clear();
        f.add(textField);

        g = new GridLayout(4,4);
        p.setLayout(g);

        bNum = new Button[10];
        for (int i = 0; i < bNum.length; i++)
        {
            bNum[i] = createButton(String.valueOf(i), this);
        }

        bAdd = createButton("+", this);
        bSub = createButton("-", this);
        bMul = createButton("*", this);
        bDiv = createButton("/", this);
        bEqu = createButton("=", this);
        bCle = createButton("C", this);

        f.add(p);
        f.setSize(width, height);
        f.setVisible(true);
        f.setBackground(Color.lightGray);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < bNum.length; i++)
        {
            if (e.getSource() == bNum[i])
            {
                int buttonValue = Integer.parseInt(textField.getText());

                String currentString = textField.getText();

                if (buttonValue == 0)
                {
                    currentString = "";
                }

                String buttonString = bNum[i].getLabel();
                String finalString = currentString + buttonString;

                currentValue = Integer.parseInt(finalString);

                textField.setText(finalString);
            }
        }

        if (e.getSource() == bAdd)
        {
            storedValue = Integer.parseInt(textField.getText());
            clear();
            c = 1;
        }

        if (e.getSource() == bSub)
        {
            storedValue = Integer.parseInt(textField.getText());
            clear();
            c = 2;
        }

        if (e.getSource() == bDiv)
        {
            storedValue = Integer.parseInt(textField.getText());
            clear();
            c = 3;
        }

        if (e.getSource() == bMul)
        {
            storedValue = Integer.parseInt(textField.getText());
            clear();
            c = 4;
        }

        if (e.getSource() == bEqu)
        {
            currentValue = Integer.parseInt(textField.getText());
            switch(c)
            {
                case 1:
                    addValues(storedValue, currentValue);
                    break;
                case 2:
                    subtractValues(storedValue, currentValue);
                    break;
                case 3:
                    divideValues(storedValue, currentValue);
                    break;
                case 4:
                    multiplyValues(storedValue, currentValue);
                    break;
            }
        }

        if (e.getSource() == bCle)
        {
            clear();
        }
    }

    private Button createButton(String label, ActionListener actionListener)
    {
        Button button = new Button(label);
        button.addActionListener(actionListener);
        p.add(button);

        return button;
    }

    public void addValues(int valueOne, int valueTwo)
    {
        System.out.println(String.valueOf(valueOne) + " + " + String.valueOf(valueTwo));

        int value = valueOne + valueTwo;
        textField.setText(String.valueOf(value));
    }

    public void subtractValues(int valueOne, int valueTwo)
    {
        System.out.println(String.valueOf(valueOne) + " - " + String.valueOf(valueTwo));

        textField.setText(String.valueOf(valueOne - valueTwo));
    }

    public void multiplyValues(int valueOne, int valueTwo)
    {
        System.out.println(String.valueOf(valueOne) + " * " + String.valueOf(valueTwo));

        textField.setText(String.valueOf(valueOne * valueTwo));
    }

    public void divideValues(int valueOne, int valueTwo)
    {
        System.out.println(String.valueOf(valueOne) + " / " + String.valueOf(valueTwo));

        if (valueOne == 0 || valueTwo == 0)
        {
            textField.setText("Infinity");
        }
        else
        {
            textField.setText(String.valueOf(valueOne / valueTwo));
        }
    }

    public void clear()
    {
        textField.setText("0");
    }

    public static void main(String[] args)
    {
        Calculator c = new Calculator(120, 180);
    }
}
