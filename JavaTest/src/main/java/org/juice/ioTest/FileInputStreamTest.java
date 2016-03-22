package org.juice.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2016/3/22.
 */
public class FileInputStreamTest {
    public static void main ( String[] args ) throws IOException {
        File file = new File("aaa.txt");
        FileInputStream fis = new FileInputStream(file);

        byte[] bbuf = new byte[1024];

        int hasRead = 0;

        while((hasRead = fis.read(bbuf))>0 ) {
            System.out.print(new String(bbuf,0,hasRead));
        }

        fis.close();
    }
}
