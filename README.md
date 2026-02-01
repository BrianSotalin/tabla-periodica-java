 Tabla Periódica Java - Gestor de Elementos Químicos
Este proyecto es una herramienta de consola desarrollada en Java que permite cargar, procesar y consultar información detallada de la tabla periódica a partir de un archivo de datos CSV.
🚀 Funcionalidades Incorporadas
El sistema ofrece una interfaz interactiva para realizar las siguientes operaciones:
Carga Dinámica: Importación de 28 campos científicos desde un archivo tabla_periodica.csv.
Búsqueda Avanzada:
Por Nombre o Símbolo (insensible a mayúsculas).
Por Año de descubrimiento (incluyendo términos como "Ancient").
Filtros Químicos:
Clasificación por Tipo (Metales, No Metales y Metaloides).
Clasificación por Fase/Estado (Sólido, Líquido, Gas).
Reportes Detallados: Generación de una ficha técnica completa con los 28 atributos de cada elemento gracias a la sobrescritura del método toString().
Interfaz Visual en Consola: Menu visual y fácil de usar por consola.

🏗️ Decisiones de Diseño
Modelo de Objetos (Clase Elemento): Se decidió crear una clase con 28 atributos específicos para mantener la integridad de los datos científicos, utilizando tipos de datos adecuados (boolean para propiedades químicas, double para masas y int para números atómicos).
Encapsulamiento: Uso estricto de modificadores de acceso private y métodos getter, asegurando que los datos solo se lean una vez cargados.
Separación de Lógica: Se separó la lógica de carga (Parser de CSV) de la lógica de presentación (Menú), facilitando el mantenimiento del código.
Formateo de Salida: Se optó por el uso de String.format y System.out.printf para garantizar que los datos se presenten en tablas alineadas y legibles, simulando una interfaz profesional.

🛠️ Dificultades Encontradas
Parseo de CSV Complejo: El archivo original contenía nombres de descubridores separados por comas (ej. "Gahn, Scheele"), lo que rompía el split(",") estándar. Se solucionó refinando la lógica de separación de columnas.
Tipos de Datos Inconsistentes: Algunos campos numéricos en el CSV estaban vacíos o contenían texto (como el año "Ancient"), lo que provocaba errores de ejecución (NumberFormatException). Se implementaron bloques try-catch y validaciones de texto para manejar estas excepciones.
Autenticación de GitHub: La transición de contraseñas normales a Tokens de Acceso Personal (PAT) supuso un reto inicial para la conexión del IDE Eclipse con el repositorio remoto.

🎓 Conclusiones y Aprendizaje
Este proyecto ha sido fundamental para consolidar conocimientos en:
Manejo de Estructuras de Datos: El uso de List<Elemento> y ArrayList para gestionar grandes volúmenes de objetos en memoria.
Flujo de Trabajo Git: Aprendizaje real sobre el ciclo de vida de un archivo (Staging, Commit, Push) y la resolución de errores de permisos en repositorios remotos pero fue un buen aprendizaje para trabajar en equipo.
Limpieza de Datos: Entender que los datos reales rara vez son perfectos y que un buen programador debe anticipar "ruido" o errores en la entrada de datos.
Personalización de Java: El poder de @Override para transformar un objeto complejo en un reporte visual elegante y útil para el usuario final.
