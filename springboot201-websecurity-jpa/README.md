# spring-security-jpa
How to implement spring security by using WebSecurityConfigurerAdapter and connecting with database

1. After running, create few users with diffrent roles (ADMIN and USER) by following in postman 
http://localhost:8080/api/users
{
  "user_id": 2,
  "username": "Alex",
  "password": "pwd1",
  "email": "alex@gmail.com",
  "roles": [
    {
        "role": "USER"
    }
  ]
}

2. Go to borwser and use foloiwng and test ((user name and password are required to login)
a) http://localhost:8080/secure/auth/welcome 
b) localhost:8080/secure/auth/users?username=<name you created> 

NOTE: PreAuthorize functionality has not been tested .
