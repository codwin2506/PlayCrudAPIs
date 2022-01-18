# PlayCrudAPIs

PlayFramework-CRUD-APIs
-> curl localhost:9000/users []

-> curl localhost:9000/register/getusers -H 'Content-Type: application/json' -d '{"id": "1","name":"user","password":"developer" }' { "id": "1","name": "user","password": "developer"}



GET     /register/getuser                             controllers.RegisterController.getAll
GET     /register/getById                          controllers.RegisterController.getById(id:String)
DELETE  /register/delete                            controllers.RegisterController.delete(id:String)
#PUT     /register/updatepassword/:id/:changedPassword    controllers.RegisterController.update(id:String,changedPassword:String)
POST    /register/adduser                               controllers.RegisterController.addNewUser
