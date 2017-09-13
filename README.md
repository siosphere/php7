# php7
Centos 7 Dockerfile with PHP 7

## Usage
Should be used to extend web-projects. Will run Apache, and pipes access log to stdout, and error log to stderr.

Can also be run alone, for generic web projects:


```
docker run -d --name webserver -v /path/to/local/public:/var/www/html siosphere/php7
```

## Future
