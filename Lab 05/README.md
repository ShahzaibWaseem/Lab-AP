# Lab 05: Socket Programming

## Tasks
This lab is the extension of [Lab 4](https://github.com/ShahzaibWaseem/Lab-AP/tree/master/Lab%2004). You need to add any Cryptographic Hash Function available in Java.

Your task is to implement the following protocol:

- Client sent algorithm choice and a random cryptographic key (length of the key depends on the cryptographic algorithm used) to a server.
- Server sent an acknowledged message back to client.
- Client then take any random message string (not more than 64 bits long), encrypts the message, hash the encrypted message, display the contents on the console and send to server the encrypted message and the hash of the encrypted message and displayed the contents on the console.
- Server take hash of the encrypted message, decrypt the encrypted message and compare the hash calculated by the server with the one received from the client.
- If both are same, sever sent the acknowledgement to the client.
- Else if not then ask client to send the message again.