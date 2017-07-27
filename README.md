ToDo:
Program like grep (in Linux).
Take the input stream and search there sting.
example: df -h | java -jar Grep.jar usr
Ignore case of string.
example: df -h | java -jar Grep.jar USR

How works examples:
woltes@linux-16xv:~> df -h | java -jar Grep.jar usr
/dev/sda2           62G          12G   50G           19% /usr/local

woltes@linux-16xv:> df -h | java -jar Grep.jar USR
/dev/sda2           62G          12G   50G           19% /usr/local
