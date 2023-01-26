# Password-Call-back-handler

When you are engage with Rampart or WSS4J for WS-Security,  you may need to create a password callback class to achieve one of the requirement when sending messagess.

1. Get the password to build the username token 

2. Get the private key password to create signture or decryption

So, You can use this handler to achieve the  second requirement within WSO2 ESB.
