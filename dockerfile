# Usar una imagen base adecuada
FROM openjdk:17-jdk-alpine

# Definir el directorio de trabajo
WORKDIR /app

# Copiar el JAR de tu aplicación al contenedor
COPY target/bff-router-0.0.1-SNAPSHOT.jar /app/bff-router-0.0.1-SNAPSHOT.jar

# Exponer el puerto de la aplicación (si es necesario)
EXPOSE 9091

# Ejecutar la aplicación Java
CMD ["java", "-jar","bff-router-0.0.1-SNAPSHOT.jar"]

