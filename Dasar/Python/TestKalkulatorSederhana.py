# 
# ! Use tkinter As GUI
import tkinter as tntr
from math import *

def evaluate():
    usrinput = inpt.get()
    if usrinput[-1] == "=":
        usrinput = usrinput[:-1]
    try:
        res.configure(text = "Hasil: " + str(eval(usrinput)))
    except:
        res.configure(text = 'ada yang salah dengan inputan anda, \nsilahkan cek kembali!!')
    
    
windw = tntr.Tk()
windw.title("Calculator Sederhana")
windw.minsize(250,100)
tntr.Label(windw, text="Silahkan Input Perhitunganya:").pack()
inpt = tntr.Entry(windw)
inpt.pack()
tntr.Button(windw, text='Hitung', command=evaluate).pack()
res = tntr.Label(windw)
res.pack()
windw.mainloop()