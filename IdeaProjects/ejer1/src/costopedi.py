nombre = input("Escriba su nombre: ")
descripcion = input("Escriba la descripcion del articulo: ")
cantidad = int(input("Escribe la cantidad a pedir: "))
precio = float(input("Escribe el precio:  "))
subtotal = precio * cantidad

if cantidad > 50:
    descuento = subtotal * 0.15
else:
    descuento = 0

total = subtotal - descuento
print("Nombre articulo: ")
print("Descripcion articulo: ")
print(f"El subtotal es: ${subtotal: ,.2f}")
print(f"Su descuento será de: ${descuento: ,.2f}")
print(f"El total es: ${total: ,.2f}")
