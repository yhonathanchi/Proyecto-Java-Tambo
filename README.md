# 🏪 Sistema de Gestión - Tambo (Java Console App)

Este es un sistema de consola en Java diseñado para gestionar empleados, sedes, ventas y bonificaciones para la cadena de tiendas **Tambo**. El proyecto ha sido reestructurado y optimizado con archivos de configuración para una experiencia de desarrollo fluida en **Visual Studio Code** y está listo para ser publicado en **GitHub**.

---

## 🚀 Características del Sistema

1. **Gestión de Empleados:** Registro de nuevos empleados con puesto, sueldo base y asignación de sede.
2. **Gestión de Sedes:** Registro de sedes con nombre, ubicación y registro de ventas mensuales.
3. **Cálculo de Bonificaciones:** Si una sede supera la meta mensual establecida (por defecto S/ 10,000), se aplica automáticamente un **15% de bonificación** al sueldo de todos los empleados adscritos a dicha sede.
4. **Modificación Dinámica:**
   * Cambiar sede de un empleado.
   * Modificar el sueldo de un empleado.
   * Actualizar las ventas mensuales de una sede.
   * Ajustar la meta de ventas global.
5. **Reportes Generales:** Visualización completa de ventas por sede y el cumplimiento de las metas comerciales.

---

## 🛠️ Conceptos de Programación Orientada a Objetos (POO) Utilizados

* **Herencia:** La clase `Empleado` hereda propiedades básicas (como el nombre) de la clase base `Persona`.
* **Encapsulamiento:** Atributos protegidos y privados (`protected`, `private`) accesibles de forma segura mediante métodos públicos `get` y `set`.
* **Colecciones (Collections Framework):** Uso de `ArrayList` para gestionar y consultar de forma dinámica los listados de sedes y empleados.
* **Modularidad:** Separación de responsabilidades mediante controladores (`AdminTambo`), modelos (`Persona`, `Empleado`, `Sede`) y la vista/consola principal (`Aplicacion`).

---

## 📁 Estructura del Proyecto

La estructura organizada para VS Code es la siguiente:

```text
Sistema Tambo Java/
├── .vscode/                   # Configuración del entorno de VS Code
│   ├── launch.json            # Configuración para ejecutar/depurar con F5
│   └── settings.json          # Rutas de compilación y origen
├── bin/                       # Carpeta generada automáticamente con archivos compilados (.class)
├── src/                       # Código fuente del proyecto
│   └── com/
│       └── mycompany/
│           └── poofinal/
│               ├── AdminTambo.java
│               ├── Aplicacion.java
│               ├── Empleado.java
│               ├── Persona.java
│               └── Sede.java
├── .gitignore                 # Exclusión de archivos basura y compilados en Git
└── README.md                  # Presentación y documentación del proyecto
```

---

## 💻 Instrucciones para Ejecutar en Visual Studio Code

### 1. Requisitos Previos en tu VS Code
Asegúrate de tener instalada la extensión oficial de Java de Microsoft:
* **Extension Pack for Java** (puedes buscarlo en la barra lateral de Extensiones `Ctrl+Shift+X` e instalarlo).

### 2. Pasos para Abrir y Correr el Proyecto
1. Abre VS Code.
2. Ve a **File > Open Folder...** (o *Archivo > Abrir carpeta...*) y selecciona la carpeta raíz **`Sistema Tambo Java`**.
3. Abre el archivo principal del programa: `src/com/mycompany/poofinal/Aplicacion.java`.
4. Ejecuta el programa de cualquiera de estas formas:
   * Presiona **`F5`** en tu teclado.
   * Haz clic en el botón **`Run`** (o *Ejecutar*) que aparece flotando sobre la línea del método `public static void main`.
   * Haz clic en el botón de reproducción ▶️ en la esquina superior derecha de VS Code.

> [!IMPORTANT]
> El proyecto está configurado para ejecutarse directamente en la **Terminal Integrada** de VS Code (`console: integratedTerminal`), garantizando que la entrada de texto por teclado con la clase `Scanner` funcione a la perfección.

---

## ⌨️ Compilación y Ejecución desde la Consola (Manual)

Si deseas compilar y ejecutar el proyecto manualmente desde PowerShell o CMD, utiliza los siguientes comandos dentro de la carpeta raíz del proyecto:

1. **Compilar las clases:**
   ```bash
   javac -d bin src/com/mycompany/poofinal/*.java
   ```

2. **Ejecutar el programa:**
   ```bash
   java -cp bin com.mycompany.poofinal.Aplicacion
   ```

---

## 📤 Instrucciones para Subirlo a GitHub

Para subir este proyecto a tu cuenta de GitHub de manera limpia y sin archivos temporales innecesarios (gracias al `.gitignore` configurado):

1. **Inicializar el repositorio Git local:**
   ```bash
   git init
   ```
2. **Agregar los archivos al área de preparación:**
   ```bash
   git add .
   ```
3. **Crear el primer commit:**
   ```bash
   git commit -m "Initial commit: Estructura del proyecto Tambo y archivos de configuración para VS Code"
   ```
4. **Vincular tu repositorio remoto de GitHub y subirlo:**
   *(Reemplaza la URL con la de tu repositorio de GitHub)*
   ```bash
   git branch -M main
   git remote add origin https://github.com/TU_USUARIO/TU_REPOSITORIO.git
   git push -u origin main
   ```
