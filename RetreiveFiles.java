/*
 How to retrieve the details of all the files available inside a folder.
 */

import java.io.File;

public class RetreiveFiles {
	
	public static void main(String[] aa)
    {
        File fobj = new File("C:\\Java Practice Problems");			// path of folder
        String[] filelist = fobj.list();

        for(String name:filelist)
        {
            System.out.println(name);
        }
    }
}
