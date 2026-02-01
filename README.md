# 🧪 Tabla Periódica Java - Gestor de Elementos Químicos

Este proyecto es una herramienta de consola desarrollada en Java que permite cargar, procesar y consultar información detallada de la tabla periódica a partir de un archivo de datos CSV.

---

## 🚀 Funcionalidades Incorporadas

* **Carga Dinámica:** Importación de 28 campos científicos desde un archivo `tabla_periodica.csv`.
* **Búsqueda Avanzada:**
    * Por **Nombre o Símbolo** (insensible a mayúsculas).
    * Por **Año de descubrimiento** (incluyendo términos como "Ancient").
* **Filtros Químicos:**
    * Clasificación por **Tipo** (Metales, No Metales y Metaloides).
    * Clasificación por **Fase/Estado** (Sólido, Líquido, Gas).
* **Reportes Detallados:** Generación de una ficha técnica completa con los 28 atributos.
* **Interfaz Visual:**  Menu visual y fácil de usar por consola.


---

## 🏗️ Decisiones de Diseño

1. **Modelo de Objetos:** Clase `Elemento` con 28 atributos y encapsulamiento (`private` + `getters`).
2. **Separación de Lógica:** El cargador CSV está separado del menú principal.
3. **Formateo:** Uso de `System.out.println` para tablas alineadas.

---

## 🛠️ Dificultades Encontradas

* **Parseo de CSV:** Manejo de comas internas en los nombres de los descubridores.
* **Tipos de Datos:** Conversión de texto a números manejando excepciones como "Ancient".
* **Seguridad:** Configuración de **Tokens de Acceso (PAT)** para la conexión con el IDE.

---

## 🎓 Conclusiones y Aprendizaje

* **Estructuras de Datos:** Uso eficiente de `List<Elemento>`.
* **Limpieza de Datos:** Importancia de limpiar espacios con `.trim()` y manejar nulos.
* **Documentación:** El valor de `@Override toString()` para reportes automáticos.
