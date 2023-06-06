# Setup

1. Run DockerDesktop
2. Run postgres in docker-compose.yml
3. Run SpringOlesyaApplication.java

## Add entity Product by endpoint 
Go to Postman and send request http://localhost:8080/admin/product/add with body:
```json
{
    "title":"title",
    "description":"description",
    "price":1
}
```
Response should be:
```
Product is add
```

## View list products
1. Open browser on http://localhost:8080/admin/products
2. List of added products should be visible