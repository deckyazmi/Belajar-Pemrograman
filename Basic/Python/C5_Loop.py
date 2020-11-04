#
tinggi=3
symbol='*'
#! for
for i in range(1, tinggi+1, +1):
    for j in range(tinggi-1, i-1, -1):
        print(" ", end='')
    for k in range(1, i+1, +1):
        if(i != 1 and k==i):
            for l in range(1, i+1, +1):
                print(symbol, end='')
        else:
            print(symbol, end='');
    print("");


#! while
if tinggi >= 2:
    whl=1
    whl2=0
    while whl <= tinggi:
        whl2=1
        while whl2 <= tinggi-whl:
            print(" ", end='')
            whl2=whl2+1
        whl2=1
        while(whl2 <= whl*2-1):
            print(symbol, end='')
            whl2=whl2+1
        print("")
        whl=whl+1
    whl=tinggi-1
    while(whl>0):
        whl2=1
        while(whl2<=tinggi-whl):
            print(" ", end='')
            whl2=whl2+1
        whl2=1;
        while(whl2<=whl*2-1):
            print(symbol, end='')
            whl2=whl2+1
        print("");
        whl=whl-1
else:
    print("Tidak bisa membuat Belah ketupat")