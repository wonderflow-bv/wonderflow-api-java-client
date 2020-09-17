# wonderflow-api-client

This is just an example.

It shows a way to send an Http POST request to the Wonderflow API, using Java.

There is just one example request: Http POST /token.

## Usage

### Requirements

- maven
- java
- Wonderflow api keys

### Build jar

`mvn clean compile assembly:single`

### Run it

`java -jar ./target/wonderflow-api-client-0.0.1-SNAPSHOT-jar-with-dependencies.jar "YOUR_API_KEY" "YOUR_API_SECRET" `

Example of output:

```
apiKey: YOUR_API_KEY
secret: YOUR_API_SECRET
Token is: "...the token..."
```

