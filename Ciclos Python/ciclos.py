

# FOR pero solo con in
for x in "HOLA QUINTO":
    print(x)

for x in "HOLA QUINTO":
    if x == "O":
        print("LETRA O ENCONTRADA")
    
contador = 0
for x in "HOLA QUINTO":
    if x == "o" or x == "A" or x=="E" or x=="I" or x=="U":
        contador+=1
print("VOCALES EN CADENA SON: ", contador)
   


#WHILE
contador = 1
while contador<=5:
    print("Numero ",contador)
    contador+=1


count =1
while True:
    print("HOLA",count)
    if count > 5:
        break
    count+=1
