# Fleurs_Deliver

>Jassies fleur shop has created a database that is used for delivery orders. Below are some user stories that you are able to access on the database.


### User Stories

```
A Customer should be able to create a profile
A Customer should be able to update the profile
A Customer should be able to create a flower order
A Customer should be able to update a flower order
A Employee should be able to create flower order for customer using customer id
A Employee should be able to update flower order for customer using customer id
```


#### ERD Diagram 
![Startingidea](https://user-images.githubusercontent.com/44285465/152534318-a7c80eb8-6bff-4015-bd80-e44e2b10daef.png)

### Flowerid 
```
1	"Rose"	6	true	
2	"Rose"	12	true	
3	"Rose"	24	true	
4	"Tulip"	6	true	
5	"Tulip"	12	true	
6	"Tulip"	24	true	
7	"Dasies"	6	true	
8	"Dasies"	12	true	
9	"Dasies"	24	true	
10	"Lily"	6	true	
11	"Lily"	12	true	
12	"Lily"	24	true	
13	"Chrysanthemum"	6	true	
14	"Chrysanthemum"	12	true	
15	"Chrysanthemum"	24	true	
16	"Rose"	6	false	
17	"Rose"	12	false	
18	"Rose"	24	false	
19	"Tulip"	6	false	
20	"Tulip"	12	false	
21	"Tulip"	24	false	
22	"Dasies"	6	false	
23	"Dasies"	12	false	
24	"Dasies"	24	false	
25	"Lily"	6	false	
26	"Lily"	12	false	
27	"Lily"	24	false	
28	"Chrysanthemum"	6	false	
29	"Chrysanthemum"	12	false	
30	"Chrysanthemum"	24	false	
31	"Orchid"	6	true	
32	"Orchid"	12	true	
33	"Orchid"	24	true	
34	"Orchid"	6	false	
35	"Orchid"	12	false	
36	"Orchid"	24	false	
37	"Carnation"	6	true	
38	"Carnation"	12	true	
39	"Carnation"	24	true	
40	"Carnation"	6	false	
41	"Carnation"	12	false	
42	"Carnation"	24	false	
43	"Daffodil"	6	true	
44	"Daffodil"	12	true	
45	"Daffodil"	24	true	
46	"Daffodil"	6	false	
47	"Daffodil"	12	false	
48	"Daffodil"	24	false	
```

##### EndPoints

| Request Type  |      URL      | Request Body  | 
| ------------- | ------------- | ------------- |
|     GET       | /api/customers| GetCustomers  |
|     GET       | /api/customer/{customerid} | GetOneCustomer  |
|     GET       | /api/orders   |  GetOrders    |
|     GET       | api/order/{customerId}  | GetOneOrder |
|    POST       | api/customer/  | CreateCustomer  |
|    POST       | api/customer/{customerId}/order/  | CreateCustomerOrder |
|    PUT        | api/customer/{customerId}  | UpdateCustomer  |
|    PUT        | customer/{customerId}/order/{orderId}  | UpdateCustomerOrder  |
| DELETE  | api/customer/{customerId}  | DeleteCustomer |
| DELETE  | api/order/{orderId} | DeleteCustomerOrder  |


#### Technologies Used

| Tech |  
| ------------- | 
|     IntelliJ       | 
|     Postman       | 
|     PgAdmin4       |
|    Spring       | 

###### Updates to come 

I hope to be able to show all the flowers in the orders table. This way you are able to choose the specific flowerIds for the order. there is an issue with the using exception
