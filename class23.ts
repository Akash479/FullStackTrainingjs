// Non parameterized Function

function add1(){
	var a:number=25;
	var b:number =35;
	
	return a*b;
}
console.log(this.add1());
 // parameterized function
 function add( name:string,name2:string ){

	
	return name +name2;
}
console.log(this.add('ashok','kumar'));

var array1:[number]=[1,12,5,4];
 var processarray=[];
array1.forEach(i=>{
	
	this.processarray.push(i*2);
})
console.log(this.processarray)
 
 

var tuple:[number,number,string,number]=[1,12,"String",4];
 console.log(tuple[2])
 tuple.push(555);
 var processarray1=[];
 tuple.forEach(i=>{
	
	this.processarray1.push(i+"2");
})
console.log(this.processarray1)
 
 class demo{
	a:number=15;
	 constructor(){
		 
	 }
	 display(){
		console.log("parent")
	 }
	 
 }
 
 class child  extends demo{
	 
	 display(){
		console.log("Child")
	 }
	 
	 
 }
 
var ch= new child();
 ch.display();




interface IStudent{
	fisrtName:string,
	lastname:string
}

var student1:IStudent ={
	fisrtName:"xyz",
	lastname:"234"
}

console.log(student1.fisrtName)



