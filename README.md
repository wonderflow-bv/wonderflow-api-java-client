# wonderflow-api-client


Here you find an example of a Java-based API client.

The example include just one request: `Http POST /token` to the Wonderflow API.

<!-- START doctoc -->
<!-- END doctoc -->


## Requirements

- maven
- java 8
- Wonderflow api keys

## Usage

### Clone the repo

```
git clone git@github.com:wonderflow-bv/wonderflow-api-java-client.git

cd wonderlfow-api-java-client
```

### Build jar

`mvn clean compile assembly:single`

### Run it

`java -jar ./target/wonderflow-api-java-client-0.0.1-SNAPSHOT-jar-with-dependencies.jar "YOUR_API_KEY" "YOUR_API_SECRET" `

Example of output:

```
apiKey: YOUR_API_KEY
secret: YOUR_API_SECRET
Status code: HTTP/1.1 200 OK
Token is: "...the token..."
```

