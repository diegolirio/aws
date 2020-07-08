if [ $# -eq 0 ];
then
  mvn clean install docker:build
  exit 0
fi

if [ "$1" = "pushImage" ] || [ "$1" = "push" ] ;
then
  push="$1"
  mvn clean install docker:build -D${push}
  exit 0
fi