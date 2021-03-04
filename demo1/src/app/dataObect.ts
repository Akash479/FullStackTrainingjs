 export class employee {

    x: any;
    y: any;
    z: any;
    constructor() {
        this.x = 10;
        this.y = 20;
        this.z = 25;
    }

    add() {
        console.log(this.x + this.y + this.z);
    }
    substract() {
        console.log(this.x - this.y - this.z);
    }
    multiply() {
        console.log(this.x * this.y + this.z);
    }
}