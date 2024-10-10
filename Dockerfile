# Use a imagem do OpenJDK 17 como base
FROM openjdk:17-oracle

# Define o diretorio de trabalho onde algums comandos ou instruções onde esses comandos vao rodar
# é criado entao pode dar o nome que quiser
WORKDIR /app

# Define uma variavel que pode ser passada em tempo de build essa pega o nome do jar criado
ARG JAR_FILE

# Copiar o caminho do arquivo que esta na nossa api para o destino no container
COPY target/${JAR_FILE} /app/api.jar
COPY wait-for-it.sh /wait-for-it.sh

# Executar o arquivo
RUN chmod +x /wait-for-it.sh

# Qual porta o container vai escutar 
# Para documentacao para quando outra pessoa for usar
EXPOSE 8081

# Comando que vai rodar quando o container levantar
CMD ["java", "-jar", "api.jar"]

