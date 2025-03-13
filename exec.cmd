@echo off
mode 85, 30
color A
javac -s ./src/ -d ./dist/ ./src/model/BaixadorModel.java ./src/controller/BaixadorController.java ./src/view/Baixador.java
java -classpath dist view/Baixador
pause