#!/bin/sh

#set -x

if [ -z "$1" ]; then
	echo
	echo Usage: ./create.sh hello-world \"Hello World\"
	echo
	echo The first hello-world is your service id. A new directory will be created based
	echo on the service id.
	echo
	echo The second \"Hello World\" is the service\'s display name. The quotation marks are
	echo only needed because there is a space in the display name.

	exit 127
fi

ant -Dservice.name=$1 -Dservice.display.name=\"$2\" create

#ant deploy

exit 0
