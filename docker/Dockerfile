# 베이스 이미지로 Temurin OpenJDK 17을 사용합니다.
FROM eclipse-temurin:17 AS builder

ARG JAR_FILE=build/libs/*.jar
# 작업 디렉토리를 설정합니다.
WORKDIR /app

# 호스트의 JAR 파일을 컨테이너의 /app 디렉토리로 복사합니다.
COPY ${JAR_FILE} app.jar

# 컨테이너에서 실행할 명령을 지정합니다.
CMD ["java", "-jar", "/app/app.jar"]
