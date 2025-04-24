
def suma():
    x = int(input("Ingrese numero 1 de suma: "))
    y = int(input("Ingrese numero 2 de suma: "))
    suma = x+y
    print("El resultado de la suma es: ", suma)
    
def resta():
    
    x = int(input("Ingrese numero 1 de resta: "))
    y = int(input("Ingrese numero 2 de resta: "))
    resta = x-y
    print("El resultado de la resta es: ", resta)

def validacion(Usuario, Password):
    if Usuario == "Admin" and Password == "A123@":
        return True
    else:
        return False
    
def main():
    Usuario = input("Ingrese Usuario: ")
    Password = input("Ingrese Password: ")
    resultado = validacion(Usuario, Password)
    if resultado == True:
        print("Credenciales Correctas")
        print("Bienvenido Usuario")
        suma()
        resta()
    else:
        print("Las Credenciales No son Correctas")

if __name__ == "__main__":
    main()