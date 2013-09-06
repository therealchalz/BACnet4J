package com.serotonin.bacnet4j.rs485;

import java.io.InputStream;
import java.io.OutputStream;

import jssc.SerialPort;
import jssc.SerialInputStream;
import jssc.SerialOutputStream;

import com.serotonin.bacnet4j.npdu.mstp.SerialParameters;

public class PortTest {
    public static void main(String[] args) throws Exception {
        SerialParameters params = new SerialParameters();
        params.setCommPortId("COM4");
        params.setBaudrate(9600);

        SerialPort serialPort = new SerialPort(params.getCommPortId());
        InputStream in = new SerialInputStream(serialPort);
        OutputStream out = new SerialOutputStream(serialPort);

        while (true) {
            System.out.print(Integer.toString(in.read(), 16));
        }
    }
}
