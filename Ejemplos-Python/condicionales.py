# CONDICIONALES 

# Condicionales son estructuras de control que permiten ejecutar un bloque de código si se cumple una condición determinada.

# Condicional If
# La estructura básica de un condicional if es la siguiente:
print("\nCondicional If")
x = 10
y = 5
if x > y:
    print ("X es mayor a Y")


# Condicional If-Else
# La estructura básica de un condicional if-else es la siguiente:
print("\nCondicional If-Else")
x = 1
y = 5
if x > y:
    print ("X es mayor a Y")
else:
    print ("X no es mayor a Y")
    

# Condicional If-Elif-Else
# La estructura básica de un condicional if-elif-else es la siguiente:
print("\nCondicional If-Elif-Else")
x = 10
y = 50
z = 1
if x > y:
    print ("X es mayor a Y")
elif x == z:
    print ("X es igual a Z")
else:
    print ("X no es mayor a Y y no es igual a Z")