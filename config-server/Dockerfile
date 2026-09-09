# 1. Imagen base de Java 17 (liviana)
FROM openjdk:17-jdk-slim

# 2. Directorio de trabajo dentro del contenedor
WORKDIR /app

# 3. Copia el ejecutable JAR generado por Maven al contenedor
COPY target/config-server-0.0.1-SNAPSHOT.jar app.jar

# 4. Puerto que expone el contenedor
EXPOSE 8888

# 5. Comando para ejecutar la aplicación al arrancar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]