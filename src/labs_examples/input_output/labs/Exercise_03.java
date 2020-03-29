package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class Variety {

    public static void main(String[] args) throws IOException {


        int data = 0;

        try(SequenceInputStream sis = new SequenceInputStream(new FileInputStream("src/labs_examples/input_output/files/byte_data"),new FileInputStream("src/labs_examples/input_output/files/byte_data_out")))
        {


            while((data = sis.read())!=-1) {

                System.out.print((data));

            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte [] ba = {121,122,123,124,125,126};

        data = 0;

        ByteArrayInputStream bas = new ByteArrayInputStream(ba);

        while((data=bas.read())!=-1) {

            System.out.println("Ascii value of " + data + " is " + (char) data);

        }



        StringReader sr = new StringReader("Hello how are you doing ?");

        StringWriter sw = new StringWriter();

        data = 0;

        while((data = sr.read())!=-1) {

            sw.write(data);

        }

        System.out.println(sw.toString());

        char [] buf = {'H','A','B','I','T','S'};

        CharArrayReader cr = new CharArrayReader(buf);

        data =0;

        while((data=cr.read())!=-1) {

            System.out.println((char) data);

        }

        try(FileInputStream fileInputStream = new FileInputStream("src/labs_examples/input_output/files/byte_data");BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream))
        {

            byte[] buff = new byte[5];

            data = 0;

            while((data = bufferedInputStream.read(buff))!=-1) {

                System.out.print(new String(buff,0,data));

            }

        }

        catch (IOException exc) {
            exc.printStackTrace();
        }

        try(BufferedReader inputStream = new BufferedReader(new FileReader("src/labs_examples/input_output/files/char_data.txt"));BufferedWriter outputStream = new BufferedWriter(new FileWriter("src/labs_examples/input_output/files/char_data3.txt")))
        {

            String l;

            while((l=inputStream.readLine()) != null) {

                outputStream.write(l);
                outputStream.write("\n");


            }


        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("src/labs_examples/input_output/files/byte_data"));DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/labs_examples/input_output/files/byte_data2")))
        {
            data = dis.available();

            byte[] array = new byte[data];

            for(byte bt: array) {

                char k = (char) bt;

                System.out.print(k);

                dos.write(bt);
            }



        }
        catch (IOException exc) {
            exc.printStackTrace();
        }



    }

}