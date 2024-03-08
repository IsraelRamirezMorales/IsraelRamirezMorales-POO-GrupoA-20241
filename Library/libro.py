import random

class Libro:
    __id=-0
    __nombre=""
    __autor=""
    __es_rentado=False
    
    def __init__(self,nombre,autor):
        self.__id=random.randint(1,1000)
        self.__nombre=nombre
        self.__autor=autor
        
    def get_nombre(self):
        return self.__nombre
    
    def get_autor(self):
        return self.__autor
    
    def get_id(self):
        return self.__id