<h1>CONVERSOR DE MONEDAS</h1>
<h2>Conectado a la API: https://www.exchangerate-api.com/</h2>

<h3>¿Qué hace?</h3>
Esta aplicación se conecta a la API exchangerate-api, en donde le podemos pedir datos con el método HTPPS GET
Esta nos devolvera los valores convertidos de de una moneda base y de una moneda a convertir de acuerdo a la norma: ISO 4217 codes on Wikipedia.

<h2>Ejecutar:</h2>
Ejecuta el archivo llamado 'Principal'en la siguiente ruta: .../ConversorDeMonedas/src/principal/Pricipal.java

<h1>Implementos</h1>
1. Se usó manejo de errores en partes sencibles del codigo, para poder ejecutarse sin inconvenientes
2. Se usó URI, HttpClient, HttpResponse, para el manero de la API
3. Se usaron diferentes Clases para una ejecución más limnpia y acoplandose inicialmente a los estandares de codigo limpio
4. Se implemento lalibreria de java.time, para el manejo de Historial de consultas, almacenando el momento de consulta
5. Se implemento una Clase Record para el manejo de los datos Json
6. Se usó el archivo JAR Gson para el manejo de método GET y su respuesta en .Json
7. finalmente se acopló el codigo para ejecutarse dentro del main de la clase 'Principal.java'


