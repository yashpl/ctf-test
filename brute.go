package main

import (
	"bufio"
	"fmt"
	"os"
	"os/exec"
)

func main() {
	key := make(chan string)
	go genkey(key)
	workdisp(key)

}
func workdisp(key chan string) {
	print("Started Brute forcing.")
	num := 0
	for value := range key {
		num++
		//print("\rTotal keys tried - ", num)
		go testkey(value)
	}
}

func genkey(key chan string) {
	for i := 1; i < 10; i++ {
		key <- "yash"
	}
	close(key)
}

func testkey(key string) {
	cmd := exec.Command("java RE", key)
	ok, err := cmd.StdoutPipe()
	scanner := bufio.NewScanner(ok)

	if scanner.Text() == "true" {
		fmt.Println(key)
		os.Exit(3)

	} else {
		fmt.Println(scanner.Text())
	}
	if err != nil {
		fmt.Println("could not get stdout pipe: " + err.Error())
	}

}
