# PlayCrudAPIs

PlayFramework-CRUD-APIs
-> curl localhost:9000/users []

-> curl localhost:9000/register/users -H 'Content-Type: application/json' -d '{"name":"user","password":"developer" }' { "id": "1","name": "user","password": "developer"}

-> curl localhost:9000/register/users { "id": "1","name": "user","password": "developer"}

-> curl localhost:9000/register/users?id=1 -X DELETE

-> curl localhost:9000/register/users []
