

function democlick(){
	var data={
		"name":"Ashok",
		"city":"hyderabad",
		print: function (){
			console.log(this.name);
			
		}
		};
		data.print();
		
	console.log(data.name); // To access Static Data
	console.log(data["city"]); // To access Dynamic Data
	
	
	
	var b=true;
	var c=[];
	console.log(typeof(data));
	console.log(typeof(b));
	console.log(typeof(c));
	var x=2;
	var y="2";
	var y=26;
	console.log(x == y);
	console.log(x === y);
	console.log(x !== y);
	console.log(typeof(y));
	
	
	var x=65;
	var x= x <18 ? "Your are able to Vote" : x>60 ?'ddgas':'sfsagsag';
	console.log(x);
	
	var x=25,y=29;
	
	if(x >20 && y>30){
		
		console.log("Condition Satified");
	}
	if(x >20 || y>30){
		
		console.log("Condition Satified");
	}
	
//	if(x >18){
//		console.log("Your are able to Vote");
	//}else{
	//	console.log("Your are  not able to Vote");
//	}
	
	
}