# app-appgate-coding-challenge
Prueba técnica para la empresa appgate, la prueba deberá resolver un Coding Challenge tomado de LeetCode que puede encontrar en el siguiente enlace https://leetcode.com/problems/distinct-subsequences/.


# Descripción del contexto donde se ejecutaría el programa

## Descripción

Este microservicio se encarga de resolver el reto de LeetCode titulado Distinct Subsequences, el cual consiste en calcular el número de subsecuencias distintas en una cadena s que puedan generar una cadena t. La solución a este problema debe ser eficiente, ya que se trata de calcular múltiples subsecuencias de cadenas grandes en un tiempo razonable, lo que requiere un enfoque optimizado.

---

## Propósito y Funcionamiento:

El servicio toma dos cadenas de texto, s y t, y determina cuántas subsecuencias de s coinciden exactamente con t. El enfoque empleado es el programa dinámico, que permite resolver el problema de manera eficiente en términos de tiempo y espacio. La solución implementa un algoritmo basado en matrices de programación dinámica que almacena los resultados de subproblemas para evitar cálculos repetidos.

---

## Escenarios de Uso

El microservicio se utilizaría en una variedad de escenarios donde el cálculo de subsecuencias sea necesario, como:

### 1. Procesamiento de grandes volúmenes de texto:

- Se puede utilizar para resolver problemas de procesamiento de texto en aplicaciones que necesitan encontrar subsecuencias dentro de grandes volúmenes de datos. Ejemplo: Análisis de logs, búsqueda de patrones dentro de grandes datasets o incluso en sistemas de procesamiento de texto en tiempo real.

### 2. Verificación de similitudes de texto:

En sistemas de análisis de contenido, como comparadores de texto, buscadores, herramientas de verificación de similitud de documentos o incluso sistemas de reconocimiento de patrones.

### 3. Aplicaciones de cadenas o secuencias:

Se podría usar en cualquier tipo de aplicación que implique trabajar con secuencias de caracteres, procesamiento de datos textuales o incluso en juegos o simulaciones que impliquen el uso de cadenas.

--- 
## Ambiente de Ejecución:

- **Escalabilidad**: El servicio puede ser desplegado en un entorno en la nube (AWS, GCP, Azure) y orquestado mediante Kubernetes para garantizar la alta disponibilidad y escalabilidad. Esto es especialmente útil en escenarios donde se puedan recibir múltiples peticiones concurrentes, ya que la solución al problema podría implicar una carga computacional significativa en cadenas largas.

- **Manejo eficiente de recursos**: Gracias a su diseño asincrónico y a la optimización de los cálculos mediante el uso de programación dinámica, el servicio maneja de manera eficiente los recursos, evitando bloqueos innecesarios y optimizando la memoria y el tiempo de procesamiento.

- **Microservicio RESTful**: El servicio está diseñado como un microservicio RESTful que recibe dos cadenas a través de una solicitud HTTP. Las respuestas se generan de forma rápida y eficiente, utilizando la capacidad asincrónica de Java a través de CompletableFuture, para garantizar que el servicio pueda manejar múltiples peticiones simultáneamente sin sacrificar el rendimiento.

- **Interoperabilidad**: El microservicio está diseñado para interactuar con otros servicios a través de API REST. Puede integrarse fácilmente en un ecosistema más grande de microservicios, siendo consumido por otras aplicaciones que necesiten este tipo de cálculo (como aplicaciones de análisis de texto o procesamiento de datos).



## Alto Rendimiento:

La solución está optimizada para manejar grandes cadenas, aplicando la programación dinámica para evitar la recalculación de subproblemas. Esto reduce significativamente el tiempo de ejecución en comparación con enfoques de fuerza bruta, lo que lo hace adecuado para entornos de alto rendimiento.

- **Optimización de espacio y tiempo**: El algoritmo implementa una matriz de programación dinámica, donde el espacio y el tiempo son optimizados. Con una complejidad temporal de O(m * n), donde m y n son las longitudes de las cadenas s y t, respectivamente, el sistema puede manejar grandes entradas sin comprometer el rendimiento.

- **Escalabilidad**: A medida que el servicio recibe un número creciente de solicitudes, el sistema está preparado para escalar horizontalmente, agregando más instancias del microservicio de manera automática con Kubernetes. Esto asegura que el servicio pueda manejar cargas altas sin afectar la latencia de las respuestas.

## Seguridad y Acceso:

El servicio está diseñado para ser fácilmente extensible en cuanto a seguridad. Si es necesario, se le puede implementar autenticación y autorización utilizando estándares como OAuth2 o JWT. Esto garantizaría que solo los clientes autenticados y autorizados puedan acceder a los recursos del microservicio. Esta integración de seguridad podría ser aplicada dependiendo de los requisitos específicos del entorno de producción o del cliente.

Además, el servicio está preparado para incorporar validación de entradas y sanitización de datos para prevenir vulnerabilidades como inyección de SQL, ataques XSS y otros riesgos de seguridad comunes, asegurando que las entradas del usuario sean correctamente procesadas y validas.
