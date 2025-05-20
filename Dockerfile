# Используем официальный JDK 17 образ
FROM eclipse-temurin:17-jdk-alpine

# Создаем рабочую директорию в контейнере
WORKDIR /app

# Копируем собранный jar-файл в контейнер
COPY target/FinalProject-0.0.1-SNAPSHOT.jar app.jar

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]
