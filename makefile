HOME_FOLDER = "$(HOME)/Desktop/JTetris"

RM_FLAGS = "-f"

game:
	javac GameCode/Panel.java;

gameclean:
	cd GameCode;
	rm $(RM_FLAGS) *.class *~;
	cd ${HOME_FOLDER}

run:
	java GameCode/Panel