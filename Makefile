MAKEFLAGS += --silent

init:
	docker compose up -d
	diesel migration run

start-server:
    echo "TODO"

start-client:
    echo "TODO"

stop:
	docker compose down
