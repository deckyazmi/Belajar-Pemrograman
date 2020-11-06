// ! Coming soon

const performance = require("perf_hooks").performance;

// var x = 0;
// function tambah(x, n) {
//   return n == 0 ? x : tambah(x + (x + 1), n - 1);
// }

// console.log(tambah(x, 10));

// var tmp = 0;
function solution1(n) {
  let hasil = 0;
  for (let i = 0; i < n; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      hasil += i;
    }
  }
  return hasil;
}

//! rekursif

function solution2(n) {
  let tmp = 0;
  function add(x) {
    // console.log(tmp + "==>" + x);
    return x <= 2
      ? tmp
      : x % 3 == 0 || x % 5 == 0
      ? ((tmp += x), add(--x))
      : add(--x);
  }
  return add(n - 1);
}

// function solution3(n) {
//   let output = 0;
//   let arrayRule = [3, 5];
//   for (let i = 0; i < arrayRule.length; i++) {
//     if (n > arrayRule[i]) {
//       let tmp = arrayRule[i];
//       while (tmp < n) {
//         output += tmp;
//         console.log(tmp + "=>" + output);
//         tmp += arrayRule[i];
//       }
//     }
//   }
//   return output;
// }
console.log("------------------------");
var t0 = performance.now();
console.log(solution1(16));
var t1 = performance.now();
console.log(t1 - t0);
var t0 = performance.now();
console.log(solution2(16));
var t1 = performance.now();
console.log(t1 - t0);
// var t0 = performance.now();
// console.log(solution3(16));
// var t1 = performance.now();
// console.log(t1 - t0);
