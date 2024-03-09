import random
class Usuario:
    __id=0
    __nombre=""
    __edad=0
    
    def __init__(self, nombre,edad):
        self.__id=random.randint(1,1000)
        self.__nombre=nombre
        self.__edad=edad
    
    def get_nombre(self):
        return self.__nombre
    
