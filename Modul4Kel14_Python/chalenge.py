# non return, tanpa parameter
def Judul():
    print("Chalenge 1")

# return, pakai parameter
def diketahui (panjang, lebar):
    keliling_persegi_panjang = (2 * panjang) + (2 * lebar)
    return keliling_persegi_panjang

# non return
Judul()

# return 
panjang = 30
lebar = 15
keliling = diketahui(panjang, lebar)
print(f"Persegi panjang dengan panjang : {panjang} dan lebar : {lebar}")
print(f"memiliki keliling : {keliling}")