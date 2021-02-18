// Non parameterized Function
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var _this = this;
function add1() {
    var a = 25;
    var b = 35;
    return a * b;
}
console.log(this.add1());
// parameterized function
function add(name, name2) {
    return name + name2;
}
console.log(this.add('ashok', 'kumar'));
var array1 = [1, 12, "string", 4];
var processarray = [];
array1.forEach(function (i) {
    _this.processarray.push(i * 2);
});
console.log(this.processarray);
var tuple = [1, 12, "String", 4];
console.log(tuple[2]);
tuple.push(555);
var processarray1 = [];
tuple.forEach(function (i) {
    _this.processarray1.push(i + "2");
});
console.log(this.processarray1);
var demo = /** @class */ (function () {
    function demo() {
        this.a = 15;
    }
    demo.prototype.display = function () {
        console.log("parent");
    };
    return demo;
}());
var child = /** @class */ (function (_super) {
    __extends(child, _super);
    function child() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    child.prototype.display = function () {
        console.log("Child");
    };
    return child;
}(demo));
var ch = new child();
ch.display();
var student1 = {
    fisrtName: "xyz",
    lastname: "234"
};
console.log(student1.fisrtName);
