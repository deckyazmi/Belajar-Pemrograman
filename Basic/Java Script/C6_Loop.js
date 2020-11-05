// ! Coming soon
var x = 0;
function tambah(x, n) {
  return n == 0 ? x : tambah(x + (x + 1), n - 1);
}

console.log(tambah(x, 10));
