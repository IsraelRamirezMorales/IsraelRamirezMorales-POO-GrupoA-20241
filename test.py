print("Hola");

numero=10
palabra="hola"
double=11123123

if numero == double:
    print("HOla")
else:
    print("xd")


numbers= [1,2,3,4,'Hola','hola']
length=len(numbers)

for i in range(0,length):
    print(i)
 #.append(): Para agregar un dato al conjunto
 #.pop(): Para eliminar el ultimo dato del conjunto   
numbers.append(4)
numbers.pop()

name=input("Ingresa tu nombre: ")
age=int(input("Ingresa tu edad: "))

print(name)
print(age)

i=0

while i< 10:
    print(i)
    i+=1
    
oracion="tu nombre es: "+name+" tu edadd es: "+str(age)
print (oracion)

oracion2=f"Tu nombre es: {name} y tu edad es: {age}"

print(oracion2)

print(f"Tu nombre es: {name} y tu edad es: {age}")


counter=0

"""
while True:
    print(counter)
    counter+=1
    if counter==10000:
        print("Fin del loop")
        
        break
"""

class Test:
    name=""
    age=0
    

test=Test()

print(test.name)

def __init__(self,name,age):
    self.name=name
    self.age=age
    
    
def suma():
    return 1+1

def suma(valor_uno,valor_dos):
    return valor_dos+valor_uno

print(suma(1,2))

def show_data(self):
    print(f"Tu nombre es: {self.name} y tu edad es: {self.age}")
    











