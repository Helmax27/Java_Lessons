package Lesson27;

import com.fazecast.jSerialComm.*;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task4 {
    public static SerialPort serialPort;
    static InputStream in;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SerialPort ports[] = SerialPort.getCommPorts();
        for (SerialPort port: ports){
            System.out.println(port.getSystemPortName());
        }
        serialPort = ports[0];
        //serialPort = SerialPort.getCommPort("COM2");
        serialPort.openPort(0);
        in = serialPort.getInputStream();
        String command = "{\"command\" : \"get_test_list\",\"suite_name\" : \"testSuite\"}";
        byte[] byteArray = command.getBytes();
        serialPort.writeBytes(byteArray, byteArray.length);

        try {
            while(true){
                while (serialPort.bytesAvailable() == 0){
                    Thread.sleep(20);
                }

                byte[] inputButes = new byte[serialPort.bytesAvailable()];
                serialPort.readBytes(inputButes, inputButes.length);
                String s = new String(inputButes, StandardCharsets.UTF_8);
                System.out.println( " message: " + s);
                serialPort.closePort();
                break;


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
