# RenameFilesMassive

![Java](https://shields.io)
![JavaFX](https://shields.io)
![Maven](https://shields.io)

RenameFilesMassive es una aplicación de escritorio diseñada para renombrar archivos de forma masiva dentro de un directorio. Ofrece una interfaz gráfica intuitiva construida con JavaFX para simplificar la gestión y organización de grandes volúmenes de archivos.

## Características

* **Selección de directorio:** Permite elegir la carpeta de trabajo fácilmente.
* **Procesamiento masivo:** Renombra múltiples archivos de forma simultánea.
* **Interfaz intuitiva:** Entorno gráfico limpio gracias a JavaFX y CSS personalizado.
* **Basado en Maven:** Gestión de dependencias y construcción automatizada.

## Requisitos del sistema

Antes de ejecutar o compilar el proyecto, asegúrate de tener instalado:

* **Java Development Kit (JDK) 11** o superior.
* **Apache Maven** (versión 3.6 o superior recomendada).

## Instalación y Configuración

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com
   cd RenameFilesMassive
   ```

2. **Compila el proyecto con Maven:**
   ```bash
   mvn clean compile
   ```

3. **Ejecuta la aplicación:**
   ```bash
   mvn javafx:run
   ```

## Estructura del Proyecto

* `src/main/`: Contiene el código fuente en Java y los archivos de configuración de la interfaz.
* `pom.xml`: Archivo de configuración de Maven con las dependencias de JavaFX.
* `.gitignore`: Filtro para evitar subir archivos temporales del sistema o del IDE al repositorio.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar la aplicación:
1. Haz un **Fork** del repositorio.
2. Crea una rama con tu nueva funcionalidad (`git checkout -b feature/NuevaMejora`).
3. Realiza un **Commit** con tus cambios (`git commit -m 'Añade nueva funcionalidad'`).
4. Sube la rama (`git push origin feature/NuevaMejora`).
5. Abre un **Pull Request**.

## Licencia

Este proyecto está disponible bajo la licencia MIT. Consulta el archivo de licencia correspondiente para más detalles.
