package connector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dataconnector
{
    private String fileName;

    public Dataconnector()
    {
        fileName = "";
    }

    public Dataconnector(String fileName)
    {
        this.fileName = fileName;
    }

    public ArrayList<String> readFile(){
        FileReader fileReader = null;
        ArrayList<String> listOfData = new ArrayList<>();
        try
        {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String infoLine = "";
            while((infoLine = bufferedReader.readLine()) != null)
            {
                listOfData.add(infoLine);
            }
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
        return listOfData;
    }
}
