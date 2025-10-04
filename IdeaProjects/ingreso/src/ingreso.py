nombre = input("Ingresa el nombre del aspirante: ")
promedio = int(input("Escriba el promedio del aspirante"))
print("Ingrese el tipo de bachillerato")
tipon = int(input("1 Fisico mate 2econ admin 3quimico bio 4ciencias soc 5carpinteria"))

if (promedio > 90) or (promedio > 80 and (tipon == 1)):
    print("Puedes ingresar a la carrera Ingenieria industrial y de sistemas")
else:
    print("No es suficiente para ingresar")

    