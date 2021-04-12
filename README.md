# virtual-agent

```bash
sudo docker run --net="host" --name=va-server virtual-agent/server:0.1
sudo docker run --net="host" -it -v mongodata:/data/db --name mongodb -d mongo
```