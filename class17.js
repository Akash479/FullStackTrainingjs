

function democlick(){
	
	
	
	console.log(0 & 0);
	console.log(1 & 0);
	console.log(0 & 1);
	console.log(1 & 1);
	console.log(0 | 0);
	console.log(1 | 0);
	console.log(0 | 1);
	console.log(1 | 1);
	var x=5;
	var y=1;
	console.log(5 & 1);
	 
	  
	  var s="hyderabad";
	  var s1= 'hyderabad';
	  var s3= new String("hyderabad");
	  console.log(s1 == s3);
	    console.log(s1 === s3);
	  console.log(typeof(s), typeof(s1),typeof(s3));
	   console.log(s1.length);
	   console.log(s1.indexOf('a'));
	     console.log(s1.search('a'));
		 var s4=s.replace('d','b');
		 console.log(s4);
		  var s5=s.slice(2,5);
		   console.log(s5);
		    console.log(s.toUpperCase());
			var fistName='          Ashok                                    ';
			var lastNmae='Lakkamraju';
			console.log(fistName.concat(lastNmae));
			console.log(fistName+'  '+lastNmae);
			console.log(fistName);
			console.log(fistName.trim());
			console.log(lastNmae.charAt(5));
			
			
			
			
	var n=10.5;
	var z=n.toString();
	console.log(typeof(z));
	var n1=10.55555;
	console.log(n1.toExponential(2));
	console.log(n1.toFixed(2));
	console.log(n1.toPrecision(5));
	
	var ar=['a','b','c','e','f'];
	console.log(ar[1]);
	console.log(ar.toString());
	ar.pop();
	console.log(ar);
	ar.push('d');
	console.log(ar);
//	ar.splice(2);
	console.log(ar);
	var slicear =ar.slice(2);
	console.log(slicear);
	var ar=['d','b','a','f','e'];
	console.log(ar.sort());
	
	var objArray=[
	{"name":'z',
		"number":5
	},
	{"name":'e',
		"number":25
	},
	{"name":'a',
		"number":9
	},
	{"name":'k',
		"number":1
	},
	];
	 var sortedArray=objArray.sort((a,b)=> a.number - b.number );
	 console.log(sortedArray);
	 sortedArray.forEach(element=>{
		 console.log(element.number);
	 })
	 console.log(sortedArray.map(item=> item.number *2));
	  console.log(sortedArray.filter(item=> item.number >5));
	   console.log(sortedArray.every(item=> item.number >0));
	     console.log(sortedArray.find(item=> item.number =1));
	   
	
	
	
	
		  
		  
		 
	  
	
	
	
	
	
	
	
	
}