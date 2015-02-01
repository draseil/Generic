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
ssh-agent
xrdb ~/.Xresources
feh --bg-fill ~/Pictures/wallpapers/photos/01.png
while :; do sleep 120; ~/bin/checkBattery; done &
while :; do echo " `window_names` %{c}`date_format` %{r}`now_playing` "; sleep 1; done | bar -pd -g 1920x20+0+0 -B#FF303440 -F#FFDDDDDD -f -*-terminus-medium-*-*-*-*-*-*-*-*-*-*-* &

focus_watcher &
# exec dwm
# exec i3
exec swm
