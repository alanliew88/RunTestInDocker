# How to run Selenium Test in Docker Container

First, we start off with pulling a docker image using :

` docker pull seleniarm/standalone-chromium  `


Then, we run a docker container using the docker image :

` docker run -d -p 4444:4444 --name testagain2 seleniarm/standalone-chromium  `

Lastly, we run the test using normal method.(right click and run)