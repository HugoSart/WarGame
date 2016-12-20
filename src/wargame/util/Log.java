/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.util;

import java.util.ArrayList;
import java.util.Arrays;

/** @author hugovs */
public class Log {
    
    ArrayList<String> blackList = new ArrayList<>(Arrays.asList("AUDIO"));
    
    public static void put(String tag, String message) {
        System.out.println(tag + ": " + message);
    }
    
    public static void put(String tag, String message, boolean err) {
        if (!err)
            System.out.println(tag + ": " + message);
        else
            System.err.println(tag + ": " + message);
    }
    
}
