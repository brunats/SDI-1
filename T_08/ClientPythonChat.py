from SOAPpy import SOAPProxy
url = 'http://localhost:8080/WebChat_T/ChatService?wsdl'
server = SOAPProxy(url)
server.config.dumpSOAPOut = 1
server.config.dumpSOAPIn = 1

if server.sendMsg2('test'):
    print "ok"
    server.sendMsg2('test2')
else:
    print "notok"

