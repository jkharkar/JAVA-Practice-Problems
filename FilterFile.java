/*
 How to filter specific types of file while getting the information related with file.
 */

import java.io.File;
import java.io.FilenameFilter;

public class FilterFile {

	public static void main(String a[])
	{
        File fobj = new File("C:\\Java Practice Problems");				// path of folder

        String[] files = fobj.list
        (
            new FilenameFilter() 	
            {
                           @Override
                           
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){		// specify file type
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
	
}

