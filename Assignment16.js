function democlick(){
		//to Find the Factorial of a Number 
		var x = 5;
		console.log(x*4*3*2*1);

		//to Display the Multiplication Table 
		var y = 10;
		console.log(y*1);
		console.log(y*2);
		console.log(y*3);
		console.log(y*4);
		console.log(y*5);
		console.log(y*6);
		console.log(y*7);
		console.log(y*8);
		console.log(y*9);
		console.log(y*10);

		//to Find the Factors of a Number 
		var z =20;
		for (let i = 1; i<=z; i++){
			if (z%i==0){
		console.log(i);}
					}

		//to Count Duplicate Letters
			var s="abcedfefc"
			count=0;
			for( var i =0; i<s.length; i++){
			if(s.charAt(i)==='c'){
				count++;
						}
							}
			console.log(count);

			count=0;
			for( var i =0; i<s.length; i++){
			if(s.charAt(i)==='f'){
				count++;
						}
							}
			console.log(count);

			count=0;
			for( var i =0; i<s.length; i++){
			if(s.charAt(i)==='e'){
				count++;
						}
							}
			console.log(count);

		//to Sort Names 
		var x=["Joe", "Alex", "Tom", "Bosch", "Cat"];		
		console.log(x.sort());

		//to Display Math Marks
		const student = {name: 'John', age: 20,
			marks: {
        				science: 70,
        				math: 75
    					}
							}
			console.log(student.marks.math);
}