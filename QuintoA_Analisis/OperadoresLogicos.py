#Declaracion de variables
edad1 = 21
edad2 = 14
cuenta1_activa = True
cuenta2_activa = False

print("Operador AND")
'''
V V   V
V F   F
F V   F
F F   V
'''
print(edad1<24 and cuenta1_activa == False)
print(edad1<24 and cuenta1_activa == True)

print("\nOperador OR")
'''
V V   V
V F   V
F V   V
F F   F
'''
print(edad2>15 or cuenta2_activa == False)
print(edad2>15 or cuenta2_activa == True)

print("\nOperador NOT")
'''
v   f
f   v
'''
print(not edad1<15)
print(not edad1<25)