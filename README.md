# servicepartneronechallenge
Home assignment for ServicePartnerOne

**Description**


The assignment is done on Java 8 and spring boot. 
No additional external libraries were used. The project doesn't have input validation, 
assuming that input json has correct format. 100 structures and 100 rooms neglected, since 
it has no affect on performance.  


**Running the unit test**

To run the tests, first clone the repository:

```sh
git clone https://github.com/mariotim/servicepartneronechallenge.git
```

The test is validating examples taken from the challenge description, and couple of additional tests

To run the test you need to have pre-install maven, and run

```
mvn test
```

To run the web project, execute the following command:

```
./mvnw spring-boot:run
```

It will run the web server on port 8080. 
API to get optimal workforce
<p class="api-url"><span>POST</span>/workforce</p>
**Request Example**

```json
{
  "rooms": [35, 21, 17],
  "seniorCapacity": 10,
  "juniorCapacity": 6
}
```

**Response Example**

```json
[
  {
    "seniors":3,
    "juniors":1
  },
  {
    "seniors":1,
    "juniors":2
  },
  {
    "seniors":2,
    "juniors":0
  }
]
```

CURL example:

```curl
curl  -H "Content-Type: application/json" http://localhost:8080/workforce -X POST -d '{"rooms":[35, 21, 17], "seniorCapacity":10, "juniorCapacity":6}'
```
