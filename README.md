# Sistema Administrador de Roles y Permisos
Sistema realizado con Java, JPA, Maven, EclipseLink y MySQL. Entre las caracteristicas principales del proyecto estan la validación de usuarios, operaciones CRUD según el tipo de usuario (rol) e interacción mediante IGU.

# Contexto del Proyecto
A partir de un Login que reciba un usuario y contraseña, y que valide estos datos, se solicita la creación de un sistema de administración de usuarios que permita las altas, bajas, modificaciones y lectura de todos los existentes en una empresa. 

Para éste, tendremos en cuenta 2 tipos de usuarios: uno administrador "admin" y otro llamado "user" para un usuario común. 

- El usuario 'admin' tendrá acceso a: 
	- Visualización de todos los usuarios sin importar su tipo. 
	- Posibilidad de alta, baja, modificación y lectura de cualquier usuario y sus permisos. 
- El usuario común (user) tendrá acceso a: 
	- Solo lectura de usuarios que sean de su mismo tipo (usuario común).

Cuando el login es válido, cada usuario dará inicio a su sesión y tendrá el acceso a las funcionalidades disponibles según su rol asignado. Si es invalido se mostrará un mensaje indicando esto.

Como extra se solicita que en la pantalla de control de cada usuario se muestre arriba a la izquierda el nombre del usuario que se encuentra actualmente en sesión. Además, en el panel de cada usuario debe haber una opción de cerrar sesión.

Por otro lado, la tabla de visualizacion de usuarios se debe actualizar automaticamente luego de una alta, edicion o eliminiacion. En caso de que una de estas acciones se realize desde dentro de la base de datos, debe existir una opcion de 'Recargar Tabla', para actualizar dicha información.

La aplicación debe ser desarrollada con una interfaz gráfica, implementando el modelo de capas y con una conexión a base de datos.

# Aplicación Desarrollada
> Al iniciar la aplicacion se muestra una ventana en la cual se llevara a cabo el ingreso de usuario y contraseña para el inicio de sesion. Si los datos son validos, se abrira una nueva ventana con el panel correspondiente al rol del usuario. En caso de ser invalido se mostrara un mensaje de error en la casilla situada debajo de los botones:

![PRINC](https://github.com/diegoceballosdev/SISTEMA-de-ROLES-y-PERMISOS/assets/122060010/83a11719-9b91-4401-a59f-9d6f863f37df)

> Si el usuario que inicia sesión es un "user"(usuario común), se mostrara la siguiente ventana con las opciones correspondientes a su tipo de rol:

![panuser](https://github.com/diegoceballosdev/SISTEMA-de-ROLES-y-PERMISOS/assets/122060010/dbee7254-5e85-4e66-b21b-00ad55824d77)

> Si el usuario que inicia sesión es un "admin"(administrador), se mostrara la siguiente ventana con las opciones correspondientes a su tipo de rol:

![VENTADM](https://github.com/diegoceballosdev/SISTEMA-de-ROLES-y-PERMISOS/assets/122060010/1f4b5943-0fd9-43b7-bcff-8c1f51a77a03)

> Al seleccionar la opcion de "Crear usuario" se abrira una ventana para el ingreso de datos y alta de los mismos. En caso de escoger "Editar Usuario", se valida que la tabla no este vacia y que se haya seleccionado un usuario como tal. Si se dan estas condiciones se abrira la ventana correspondiente para la edición:

![crearEditar](https://github.com/diegoceballosdev/SISTEMA-de-ROLES-y-PERMISOS/assets/122060010/1f720163-98b2-44e1-bc2e-05b6268c69b9)

> Por otro lado, al seleccionar "Borrar Usuario", del mismo modo que al editar, se valida que la tabla no este vacia y que se haya seleccionado un usuario como tal. Si se dan estas condiciones, se procedera con la eliminación.

> La tabla de informacion de usuarios se actualiza automaticamente tras cada una de estas operaciones, y además cuenta con una opcion para recargar la tabla en caso de que se opere desde dentro de la base de datos, permitiendo inmediatamente visualizar estos cambios.

> En cuanto a la opcion "Cerrar Sesion", justamente cumplira con su cometido de poner fin a la sesion del usuario y volver a la ventana de "Inicio de Sesion".

He tratado de resumir de forma simple y superficial los apartados de la apliación, sin embargo pueden observar los detalles de implementación en el propio codigo. Invito a todos aquellos que estan en su proceso de aprendizaje a implementar este CRUD, clonar este repositorio y jugar con el código. 

Gracias por leer esta contribución!!!
