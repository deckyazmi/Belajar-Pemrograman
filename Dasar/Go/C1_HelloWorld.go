package main

import (
	"fmt"
	"rsc.io/quote"
)

func fungsi(a, b string) (string, string){
	c:=a+b
	fmt.Println(c)
	//? c=a,b <---error
	return c, quote.Go();
}

func main() {
	a,b := fungsi("Hello","World")
	fmt.Print(a+" "+b)
}