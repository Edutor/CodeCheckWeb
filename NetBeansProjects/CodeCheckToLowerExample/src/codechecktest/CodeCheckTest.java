/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechecktest;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Tobias Grundtvig
 */
public class CodeCheckTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Try some illegal stuff
        File f = new File("c:\\tmp\\dead.txt");
        f.delete();
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine().toLowerCase());
    }
    
}
