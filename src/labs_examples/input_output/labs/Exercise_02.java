package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, read back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */

class FileEncryption {

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new FileReader("src/labs_examples/input_output/files/char_data.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter("src/labs_examples/input_output/files/char_enc.txt"))) {

            int c = 0;

            while ((c = br.read()) != -1) {

                if ((char) c == 'a') {

                    c = 45;
                } else if ((char) c == 'e') {

                    c = 126;
                }

                bw.write(c);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader br = new BufferedReader(new FileReader("src/labs_examples/input_output/files/char_enc.txt"))) {

            int c = 0;

            while ((c = br.read()) != -1) {

                if (c == 45)
                    c = 97;
                else if (c == 126)
                    c = 101;

                System.out.print((char) c);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}