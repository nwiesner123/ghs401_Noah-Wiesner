package org.thewiesners;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int x = Integer.parseInt(JOptionPane.showInputDialog("what number?"));
	int z = 1;
	for(int i = 2; i <= x; i++)
    {
        z = z*i;
        if(i==x)
        {
            System.out.println(z);
        }
    }
    }
}
