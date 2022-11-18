## Tarea Universidad
Se requiere automatizar el entorno administrativo de una Universidad, para ello debe considerar una serie de factores

Una Universidad está compuesta de varias Facultades, donde cada facultad debe contener su nombre, ubicación geográfica (considere latitud / longitud) y departamentos asociados.

Cada Facultad agrega varios Departamentos especializados para cada carrera universitaria, cada departamento debe indicar su nombre, administrativos, profesores asociados y las carreras universitarias que están vinculadas a ella.

Los trabajadores asociados a la Universidad debe contener un título profesional, nombre, dirección, estado civil, rut y horario. En el caso de los Administrativos, se debe especificar el horario de atención mediante una cadena de texto. Los profesores deben especificar si son contratados a jornada parcial, media jornada o jornada completa.

La Universidad debe especificar su nombre, direcciones asociadas y el tipo de Universidad (Estatal o privada).

Para el desarrollo de la solución, considere el siguiente esquema UML, donde debe especificar el tipo de relación, encapsulamiento, multiplicidad, roles y donde la clase "Trabajador" es una clase abstracta. Como sugerencia, realice un método abstracto llamado getTipo() para saber si un trabajador corresponde a un Profesor o a un Administrativo.

Para efectos de la solución, la Universidad requiere:

Obtener todos los profesores de una facultad, de acuerdo al nombre del profesor.
Obtener todos las carreras univesitarias de una facultad.
Obtener todos los profesores contratados a jornada parcial, media jornada o jornada completa de un departamento (se decide por parámetro).
Obtener todos los profesores de una Universidad.
Obtener todos los administrativos de una Universidad.