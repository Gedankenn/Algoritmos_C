#http://www.lfd.uci.edu/~gohlke/pythonlibs/#pyhook
#pip install pypiwin32

#https://github.com/SavinaRoja/PyUserInput
#pip install pyuserinput
from pymouse import PyMouse
from pykeyboard import PyKeyboard
import time
import datetime

m = PyMouse()
k = PyKeyboard()
agora=datetime.datetime.now()

print(agora.minute)
x_dim, y_dim = m.screen_size()
m.click(1439, 899,1)
time.sleep(0.1)
m.click(712,885,1)
time.sleep(0.5)
m.click(700,707,1)
time.sleep(0.1)
k.type_string('fiz as conta')
time.sleep(0.1)
k.tap_key(k.enter_key)
aux=0
while aux<15:
	#m.click(1300,710,1)
	k.type_string('tudo puta e viado')
	time.sleep(1)
	k.tap_key(k.enter_key)
	#m.click(1300,710,1)
	aux++