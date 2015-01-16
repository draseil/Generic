#!/bin/sh

#
# ~/.xinitrc
#
# Executed by startx (run your window manager from here)
#

export GTK2_RC_FILES="$HOME/.gtkrc-2.0"

#DEFAULT_SESSION=xfce4-session
#case $1 in
#  xfce) exec dbus-launch xfce4-session ;;
#  *) exec dbus-launch  $DEFAULT_SESSION ;;
#esac

compton &
xbindkeys &
mpd &
nm-applet &
xrdb ~/.Xresources
feh --bg-fill ~/Pictures/Wallpapers/DanganRonpa01.jpg
while :; do sleep 120; ~/bin/checkBattery; done &
while :; do echo $(wname $(lsw)) %{r}$(date); sleep 1; done | bar -pd -g 1920x20+0+0 -B#FF303438 -F#FFDDDDDD &
focus_watcher &
# exec dwm
# exec i3
exec swm
