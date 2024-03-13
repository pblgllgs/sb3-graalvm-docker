# Graalvm

## Build native-images with Graalvm and Spring Boot

## Generate native file with

```bash
mvn native-compile -Pnative
```

### Paketobuildpacks and tiny image using pom with plugin graalvm

```bash
mvn spring-boot:build-image
```

### Paketobuildpacks and tiny image using pom without plugin graalvm

```bash
mvn -f pom-jvm.xml spring-boot:build-image
```