package Lesson27;

import com.fazecast.jSerialComm.SerialPort;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task5 {
    public static SerialPort serialPort;
    static InputStream in;
    public String answer;

    public static void main(String[] args) throws InterruptedException {
        SerialPort ports[] = SerialPort.getCommPorts();
        for (SerialPort port : ports) {
            System.out.println(port.getSystemPortName());
        }

        serialPort = ports[0];
        serialPort.openPort(0);
        Connect connect = new Connect(serialPort);
        connect.start();
        in = serialPort.getInputStream();
        Map<String, String> commandHashMap = new HashMap<String, String>() {{
            put("{\"command\" : \"connection_data\",\"server_ip\":\"127.0.0.1\",\"server_port\":\"8002\"}",
                    "{\"answer\" :\"connection_data\",\"status\":\"pass\"}");
            put("{\"command\" : \"get_test_suites\"}",
                    "{\"answer\" :\"get_test_suites\",\"status\":\"pass\",\"list\": [\"testSuite1\", \"testSuite2\" ]}");
            put("{\"command\" : \"get_test_list\",\"suite_name\" : \"testSuite\"}",
                    "{\"answer\" : \"get_test_list\",\"suite_name\":\"TestSuite1\",\"status\":\"pass\",\"list\" :[{\"test_name\":\"test1\", \"description\": \"description 1\",\"parameters\":[{\"param_name\":null, \"description\":null, \"value\":null}, {\"param_name\":null, \"description\":null, \"value\":null}]},{\"test_name\":\"test2\",\"description\": \"description 2\",\"param_name\": [{\"param_name\":null, \"description\":null, \"param_value\":null}] }] }");
            put("{\"command\" : \"set_global_param\",\"param\" : [\"param_name\":\"log_level\", \"param_value\":\"debug\"]}",
                    "{\"answer\" : \"set_ global _param\",\"status\":\"pass\"}");
            put("{\"command\" : \"run_test\",\"suite_name\" : \"testSuite1\",\"test_name\" : \"test1\",\"exec_id\":\"23456\",\"parameters\" : [\"param_name\":\"mem\", \"param_value\":\"all off 2000\"]}",
                    "{\"answer\" : \"run_test\",\"suite_name\" : \"testSuite1\",\"test_name\" : \"test1\",\"exec_id\":\"23456\",\"status\":\"finished\",\"test_result\" : \"pass\",\"start_time\" : \"122\",\"duration\" : \"1444\",\"logs\" : [{\"time\":\"10\",\"level\": \"info\",\"message\" : \"started\"},{\"time\": \"12\",\"level\": \"debug\",\"logs\" : \"deep test\"},{\"time\":\"125\",\"level\": \"exception\",\"message\" : \"cannot write address 0x3333 as expected\"},{\"time\":\"130\",\"level\": \"info\",\"message\" : \"finished\"}");
            put("{\"command\" : \"get_last_test\",\"suite_name\" : \"testSuite1\",\"test_name\" : \"test1\",\"exec_id\":\"23456\"}",
                    "{\"answer\" : \"get_last_test\",\"suite_name\" : \"testSuite1\",\"test_name\" : \"test1\",\"exec_id\":\"23456\",\"status\":\"runnin\",\"test_result\" : \"pass\",\"start_time\" : \"122\",\"duration\" : \"1444\",\"log\" : [{\"time\":\"10\",\"level\":\"info\",\"logs\" : \"started\"},{\"time\": \"12\",\"level\": \"debug\",\"message\" : \"deep test\"},{\"time\":\"125\",\"level\": \"exception\",\"message\" : \"cannot write address 0x3333 as expected\"},{\"time\":\"130\",\"level\": \"info\",\"message\" : \"finished\"}]}");
            put("{\"command\" : \"async_run_test\",\"suite_name\" : \"testSuite1\",\"test_name\" : \"test1\",\"exec_id\":\"23456\",\"parameters\" : [\"param_name\":\"mem\", \"param_value\":\"all off 2000\"]}",
                    "{\"answer\" : \"async_run_test\",\"suite_name\" : \"testSuite1\",\"test_name\" : \"test1\",\"exec_id\":\"23456\",\"status\":\"finished\",\"test_result\" : \"pass\",\"start_time\" : \"122\",\"duration\" : \"1444\",\"logs\" : [{\"time\":\"10\",\"level\": \"info\",\"message\" : \"started\"},{\"time\": \"12\",\"level\": \"debug\",\"logs\" : \"deep test\"},{\"time\":\"125\",\"level\": \"exception\",\"message\" : \"cannot write address 0x3333 as expected\"},{\"time\":\"130\",\"level\": \"info\",\"message\" : \"finished\"}]}");
            put("", "{\"answer\" : \"async_run_test\",\"suite_name\" : \"testSuite1\",\"test_name\" : \"test1\",\"exec_id\":\"23456\",\"status\" : \"running\"}");
        }};
        for (String st: commandHashMap.keySet()) {
            Thread.sleep(350);
            String command = st;
            byte[] byteArray = command.getBytes();
            serialPort.writeBytes(byteArray, byteArray.length);

            if (connect.answer.equals(commandHashMap.get(st))) {
                System.out.println(connect.answer);
                System.out.println(st);
                System.out.println("Test Pass");
            }
            else {
                System.out.println(connect.answer);
                System.out.println(st);
                System.out.println("Test fail");
            }
        }
    }
}

class Connect extends Thread {
    SerialPort serialPort;
    String answer = "";
    public Connect(SerialPort serialPort) {
        this.serialPort = serialPort;
    }

    public void run() {
        while (true) {
            while (serialPort.bytesAvailable() == 0) {
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("===============================");

            byte[] inputButes = new byte[serialPort.bytesAvailable()];
            serialPort.readBytes(inputButes, inputButes.length);
            String s = new String(inputButes, StandardCharsets.UTF_8);
            answer=s;
            System.out.println(" message: " + s);
        }


    }
}
