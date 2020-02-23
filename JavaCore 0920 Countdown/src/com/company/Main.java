package com.company;

/*
0920 Countdown
Write a countdown from 10 to 0. In the loop, use Thread.sleep (100) to delay;
Wrap a sleep call in try..catch.

Requirements:
1. The program should display a count from 10 to 0.
2. The program should display a new number every 100 milliseconds.
3. The program should use the method "Thread.sleep (100);".
4. The main method should contain a try..catch block.
5. The main method should not throw exceptions.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.util.*;


public class Main {

        public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                        Thread.sleep(100);
                }
                catch (Exception e) {}
        }
        }
    }






