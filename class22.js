var x = 3;
if (x > 10) {
    console.log("Number Greater than 10");
}
else if (x > 5) {
    console.log("Number less than 5");
}
else if (x < 2) {
    console.log("Number less than 2");
}
else {
    console.log("Number greater  than 2");
}
var numbers = [1, 2, 3, 4, 5, 6];
for (var x = 1; x < numbers.length; x++) {
    console.log(numbers[x]);
}
var len = 0;
while (len < 4) {
    if (len === 2) {
        console.log(len);
    }
    len++;
}
function add(x1, x2) {
    return x1 * x2;
}
console.log(add(5, 3));
var addFun1 = function (x1, x2) { return x1 * x2; };
console.log(addFun1(2, 2));
