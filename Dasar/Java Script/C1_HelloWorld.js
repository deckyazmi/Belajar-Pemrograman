function fungsi(a, b) {
  c = a + b;
  console.log(c);
  (c = a), b;
  return c;
}

console.log(fungsi("Hello", "World!!"));
