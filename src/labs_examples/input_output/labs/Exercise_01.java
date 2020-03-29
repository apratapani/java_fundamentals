package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 * <p>
 * Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 * Make sure you close the connections to both files.
 */

class Example {
    public static void main(String[] args) {


        try (BufferedInputStream bs = new BufferedInputStream(new FileInputStream("src/labs_examples/input_output/files/byte_data_an")); BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("src/labs_examples/input_output/files/byte_data_out"))) {
            byte[] buffer = new byte[5];

            int bytesRead = 0;

            while ((bytesRead = bs.read(buffer)) != -1) {
                //System.out.print(new String(buffer,0,bytesRead));
                bout.write(buffer, 0, bytesRead);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}