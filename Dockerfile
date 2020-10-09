FROM openjdk:11 as builder

COPY . /products-back
WORKDIR /products-back
RUN ./gradlew clean build

FROM openjdk:11

COPY --from=builder /products-back/build/libs/products-back-0.0.1-SNAPSHOT.jar /products-back/
WORKDIR /products-back
RUN chmod +x products-back-0.0.1-SNAPSHOT.jar

EXPOSE 8080
CMD java -jar products-back-0.0.1-SNAPSHOT.jar

