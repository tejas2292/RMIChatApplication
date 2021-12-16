# RMIChatApplication
LP2 Mini Project Of Distributed Systems

Open 4 CMD panels with the location of bin folder
------------------------------------------------------------------------

First Create Stub and Skeleton Files by using rmic command (rmic is Java RMI Compiler)
1) > rmic server.ChatServer
2) > rmic client.ChatClient
------------------------------------------------------------------------

The RMI registry is a simple server-side name server that allows remote clients to get a reference to a remote object
3) > rmiregistry
------------------------------------------------------------------------

start chat Server and Client with name
4) > java server.ChatServerDriver
5) > java client.ChatClientDriver name_of_chat_user
------------------------------------------------------------------------
