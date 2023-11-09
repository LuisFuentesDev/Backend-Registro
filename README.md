# Registro

Api creada para almacenar información sobre empleados y departamentos.

La entidad principal registra lo siguiente:
- Nombre Empleado
- Email

La entidad secundaria registra lo siguiente:
- Departamento

# Acceso a la base de datos

Link para acceder a la base de datos:
```
http://localhost:8080/h2-console/
```
<img width="450" alt="Captura de pantalla 2023-10-02 a la(s) 11 33 30" src="https://github.com/LuisFuentesDev/ApiRest/assets/136398930/90224bcb-3507-4ab4-992a-835ba499a43b">

En JBDC URL, ingresar lo siguiente para acceder a la base de datos:
```
jdbc:h2:mem:apidb
```
# Endpoints
Para crear un registro de departamento:

```
http://localhost:8080/api/departament
```

```JSON
{
    "departament": "Recursos Humanos"
}

```
Para obtener el listado de departamentos:
```
api/departament
```

Para obtener un departamento por el id:
```
api/departament/{id}

  Ejemplo: api/departament/3
```

Para crear un registro de empleado:

```
http://localhost:8080/api/employee
```

Se debe asociar un empleado a un departamento

```JSON
{
  "email": "nombre.apellido3@example.com",
  "nameEmployee": "Nombre Nuevo",
  "departament": {
    "id": 2,
    "departament": "Recursos Humanos"
  }
}

```
Para obtener el listado de empleados:
```
api/employee
```

Para obtener un empleado por el email:
```
api/departament/{email}

  Ejemplo: api/employee/nombre.apellido3@example.com
```
