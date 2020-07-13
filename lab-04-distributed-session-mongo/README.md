# lab-04-distributed-session-mongo

## start

```shell
# 只启动 mongo
cd docker
docker-compose up mongo mongo-express
```

```shell
./docker-start.sh
```

## stop

```shell
./docker-stop.sh
```

## 访问浏览器

http://127.0.0.1:8080/session/set?key=abcd&value=1234

http://127.0.0.1:8080/session/get_all