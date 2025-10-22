all: build

build:
	javac -d out src/br/com/misto/Main.java


run:
	java -cp out br.com.misto.Main

jar:
	jar --create --file out.jar --main-class br.com.misto.Main -C out .
