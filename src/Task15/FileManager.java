package Task15;

import java.io.*;

public class FileManager {

    public void copyText(String copyFrom, String copyTo) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(copyFrom);
            outputStream = new FileWriter(copyTo);

            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }

    public void copyBuffered(String copyFrom, String copyTo) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(copyFrom));
            outputStream = new PrintWriter(new FileWriter(copyTo));

            int i;
            while((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }

    }

}
