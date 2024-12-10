# **Sistema de Denuncias por Violencia contra la Mujer**
Un sistema diseñado para registrar y gestionar denuncias por violencia contra la mujer, enfocado en proporcionar un entorno accesible y eficiente para usuarios y administradores.

---
## **Índice**
1. [Descripción del Proyecto](#descripción-del-proyecto)
2. [Características](#características)
3. [Requisitos](#requisitos)
4. [Uso](#uso)
5. [Arquitectura del Sistema](#arquitectura-del-sistema)
6. [Contribuciones](#contribuciones)


---

## **Descripción del Proyecto**
El sistema tiene como objetivo apoyar en la lucha contra la violencia de género mediante un registro seguro y confidencial de denuncias. Está diseñado bajo la arquitectura **MVC (Modelo-Vista-Controlador)** e implementa patrones de diseño como **Factory Method**, **Decorator** y **Facade**, entre otros.

---

## **Características**
- Registro de usuarios con diferentes roles: administrador, usuario denunciante.
- Gestión de denuncias con asignación de identificadores únicos.
- Carga de configuración mediante un archivo `config.properties` para credenciales de base de datos.
- Seguimiento de denuncias en tiempo real mediante patrones de diseño como **Observable**.
- Código estructurado con Maven y soporte para generar JAR ejecutables.

---

## **Requisitos**
- **Java**: Versión 10 o superior.
- **Apache Maven**: Para la gestión del proyecto.
- **Base de datos SQLServer**: Con configuración de credenciales en `config.properties`.
- **IDE recomendado**: NetBeans.

---

## **Uso**
1. Ejecuta la aplicación.
2. Accede al sistema con un usuario registrado o crea uno nuevo.
3. Registra una nueva denuncia llenando el formulario correspondiente.
4. Los administradores pueden consultar y gestionar todas las denuncias registradas.

---

## **Arquitectura del Sistema**
### MVC (Modelo-Vista-Controlador)
El sistema está dividido en tres capas:

- **Modelo**: Gestiona los datos y la lógica del negocio.
- **Vista**: Interfaz gráfica del usuario (GUI) que permite interactuar con el sistema.
- **Controlador**: Maneja la interacción entre la vista y el modelo, controlando la lógica de las operaciones.

---

### Patrones de Diseño

- **Factory**: Este patrón se utiliza para crear instancias de controladores específicos, permitiendo la creación dinámica y flexible de objetos.

- **Decorator**: Se emplea para añadir funcionalidades dinámicas a las notificaciones, sin alterar la clase base.

- **Facade**: Simplifica las operaciones del sistema proporcionando un único punto de acceso para las interacciones entre el modelo y la vista.

- **Observer**: Implementado para permitir que el sistema reaccione a cambios en el estado de las denuncias, notificando a los usuarios registrados de eventos importantes.

- **Memento**: Utilizado para guardar y restaurar el estado de los objetos, permitiendo la recuperación de datos anteriores de una denuncia o usuario.

- **Proxy**: Este patrón se utiliza para acceder de manera controlada a las clases que gestionan las denuncias y los usuarios, añadiendo una capa de protección y control de acceso.

- **Singleton**: Garantiza que haya una única instancia de la conexión a la base de datos a lo largo de la ejecución del sistema, proporcionando un punto de acceso global a la misma.

---

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras un problema o tienes una idea para mejorar el sistema, abre un **Issue** o envía un **Pull Request**.
