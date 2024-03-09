class Libreria:
    __usuarios=[]
    __libros=[]
    
    def agregar_libro(self,libro):
        self.__libros.append(libro)
    
    def agregar_usuario(self,usuario):
        self.__usuarios.append(usuario)
    
    def mostrar_usuarios(self):
        print("** USUARIOS **\n")
        for i in range(0,len(self.__usuarios)):
            
            print(f"Usuario {i+1}: ", self.__usuarios[i].get_nombre())
            
    
    def mostrar_libros(self):
        print("** LIBROS **\n")
        for libro in self.__libros:
            
            print("Nombre: ",libro.get_nombre())
            print("Autor: ",libro.get_autor())
            print("ID: ",libro.get_id())
            print("*******************")