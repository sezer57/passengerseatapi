# Passenger Seat API
The Passenger Seat API is a RESTful API created with Spring Boot, PostgreSQL, and Java that allows developers to manage passenger seat reservations for a transportation service. With this API, you can easily create and view passenger seat reservations.

# Database Model Diagram
![diagram](https://user-images.githubusercontent.com/36985898/220201936-679ab498-8bc2-4449-b70e-8e2993a49e8f.jpg)

# Endpoints
__GET__ /v1/ticket/seats<br>
__POST__ /v1/ticket/passenger/add<br>
__GET__ /v1/ticket/passengers<br>
__GET__ /v1/ticket/passengers_seats<br>
## Retrieve a list of all available seats:

__GET__ /v1/ticket/seats__<br>
```
[
    {
        "id": 2,
        "numbers": 2,
        "seatsIsTaken": "false"
    },
    {
        "id": 3,
        "numbers": 3,
        "seatsIsTaken": "false"
    },
    {
        "id": 4,
        "numbers": 4,
        "seatsIsTaken": "false"
    }
    .
    .
    .
]
```

## For create passenger and take seat:

__POST__ /v1/ticket/passenger/add<br>
Content-Type: application/json
```
{
    "name":"aaaa",
    "tc":"111111111",
    "numbers":"12"
}
```

## For get passenger:
__GET__ /v1/ticket/passengers
```
   [
    {
        "id": 1,
        "name": "yasin"
    },
    {
        "id": 2,
        "name": "asd"
    }
}
```
Note:not include tc for security


## For get passenger and seats together:

__GET__ /v1/ticket/passengers_seats
```
[
    {
        "id": 1,
        "passengers": {
            "id": 1,
            "name": "yasin",
        },
        "seats": {
            "id": 1,
            "numbers": 1,
            "seatsIsTaken": "yes"
        }
    },
    {
        "id": 2,
        "passengers": {
            "id": 2,
            "name": "asd"
        },
        "seats": {
            "id": 9,
            "numbers": 9,
            "seatsIsTaken": "yes"
        }
    }
]
```
