package system._asynchtest.scripts;

// do some status updates
functionHelper.setMessage("Starting") 
functionHelper.setProgress(0) 
sleep (1000)

functionHelper.setMessage("Starting..") 
functionHelper.setProgress(20) 
sleep (1000)

functionHelper.setMessage("Starting -- almost there") 
functionHelper.setProgress(60) 
sleep (1000)

def delay = 60..98
delay.each { p->
functionHelper.setProgress(p) 
sleep (150)
}

functionHelper.setMessage("Starting -- almost there !!!!") 
functionHelper.setProgress(99) 
sleep (4000)


functionHelper.setMessage("All OK")

printf "READY"



functionHelper.sendMessage("system:asynchtest.finishedMessage","site",null,"time",System.currentTimeMillis()+(1000*60),null)