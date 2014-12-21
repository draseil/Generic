# .bashrc

# Source global definitions
if [ -f /etc/bashrc ]; then
	. /etc/bashrc
fi

JAVA_HOME=/usr/java/jdk1.8.0_25
PATH=/bin:/usr/bin:/usr/local/bin:/usr/share/bin:/usr/sbin:$JAVA_HOME/bin:$JAVA_HOME/jre/bin:~/bin:~/bin/eclipse:~/bin/sublime_text_3
DEV=~/Documents/dev/Programming/Standard/Java
PS1='──── $ '
LD_LIBRARY_PATH=/usr/local/lib

# Uncomment the following line if you don't like systemctl's auto-paging feature:
# export SYSTEMD_PAGER=

# User specific aliases and functions
