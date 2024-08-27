FastTrack August 2024 Cohort

Having trouble with a stack overflow error where the Parent and Child entities are stuck in a circular loop because of their hashcode methods. Not sure why this method is being called though.

This repository is a minimum reproducible example to demonstrate the problem.

Make a request to the localhost:8080/create endpoint with the following request body:

```json
{
    "id": null,
    "children": [
        {
            "id": null,
            "parent_id": null
        }
    ]
}
```

It might not stack overflow, but it will limit the generation of entities to 1000. It probably reaches that limit because the entity size is small in this example.

Current workaround is to exclude the relationship references from the hashcode method.
