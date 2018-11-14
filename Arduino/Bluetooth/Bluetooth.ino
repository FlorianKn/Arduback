/*
  Software serial multple serial test

 Receives from the hardware serial, sends to software serial.
 Receives from software serial, sends to hardware serial.

 The circuit:
 * RX is digital pin 10 (connect to TX of other device)
 * TX is digital pin 11 (connect to RX of other device)

 Note:
 Not all pins on the Mega and Mega 2560 support change interrupts,
 so only the following can be used for RX:
 10, 11, 12, 13, 50, 51, 52, 53, 62, 63, 64, 65, 66, 67, 68, 69

 Not all pins on the Leonardo and Micro support change interrupts,
 so only the following can be used for RX:
 8, 9, 10, 11, 14 (MISO), 15 (SCK), 16 (MOSI).

 created back in the mists of time
 modified 25 May 2012
 by Tom Igoe
 based on Mikal Hart's example

 This example code is in the public domain.

 */
#include <SoftwareSerial.h>

#define RESISTOR 10000 //This should be the same value of the used resistor  
#define RUBBERCORDPIN A0  //This is the pin where the cord is connected tp

SoftwareSerial mySerial(11, 10); // RX, TX

void setup() {
  // Open serial communications and wait for port to open:
  Serial.begin(57600);
  while (!Serial) {
    ; // wait for serial port to connect. Needed for native USB port only
  }


  Serial.println("Goodnight moon!");

  // set the data rate for the SoftwareSerial port
  mySerial.begin(9600);
  mySerial.println("Hello, world?");
}

void loop() { // run over and over
  if (mySerial.available()) {
    Serial.println(mySerial.read());
  }
  /*  while (Serial.available() > 0) {
    char inByte = Serial.read();
    
    mySerial.write(inByte);
  }*/
  if (Serial.available()) {
    char inByte = Serial.read();
    mySerial.println(inByte);
  }

    // put your main code here, to run repeatedly:
     int value; 
     value = analogRead(RUBBERCORDPIN);     //Read value
     //mySerial.print("Analog reading ");  
     mySerial.println(value);                 //Print value
     delay(2000);
     
  /*int value = 12345;Serial.read
  String valueS = String(value);
  mySerial.println(valueS);*/
  
  /*mySerial.println("12345");*/
}
