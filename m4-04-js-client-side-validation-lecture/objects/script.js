

/*
   Object creation using new keyword
   - dot notation 
   - bracket notation
*/
console.log("1.  Let's look at object creation using new Object():"); 
console.log("-");
var dog = new Object();
dog.name = "Bailey";                         //dot notation
dog.breed = "Golden Retriever";
dog.age = 10;
dog.color;                                   //undefined
console.log("dog name: " + dog.name); 
console.log("dog breed: " + dog.breed);              
      
dog["isSmart"] = false;                       //bracket notation
dog["isStubborn"] = true;
console.log("dog isSmart?: " + dog["isSmart"]); 
console.log("dog isStubborn?: " + dog["isStubborn"]); 
	   
	   
/*
   Object literal
*/
console.log("-");
console.log("2.  Let's look at Object literals:"); 
console.log("-");

var dog2 = {
	name: "Bailey", 
	breed: "Golden", 
	age:10, 
	color: "Golden",  
	legs: {front: 2, back: 2}
};

console.log("dog2 name: " + dog2["name"]); 
console.log("dog2 breed: " + dog2["breed"]); 
console.log("dog2 front legs: " + dog2["legs"].front);  
console.log("dog2 back legs: " + dog2["legs"].back);  


/*
   Object creation using constructor function
*/
console.log("-");
console.log("3.  Let's look at constructor function approach:"); 
console.log("-");  

function Dog (name, breed, age, color)  {
	this.name = name;
	this.breed = breed;
	this.age = age;
	this.color = color;
}

var myDog = new Dog("Bailey", "Golden Retriever", 10, "Golden");
console.log(myDog["name"]);
console.log(myDog["breed"]);
console.log(myDog["age"]);
console.log(myDog["color"]);

 //adding a new property to a previously defined object
 myDog.eyes = "blue";  
console.log("Don't forget my eyes: " + myDog["eyes"]); 

/*
   Object creation using Object.create()
*/
console.log("-");
console.log("4.  Let's look at Object.create() approach:"); 
console.log("-");  

var Dog =   {
    classification: "Canine",
    display:  function()  {
        console.log("My classification is: " + this.classification)
    }
};

var anotherDog = Object.create(Dog);
anotherDog.display();

var snoopDog = Object.create(Dog);
snoopDog.classification = "Rapper"
snoopDog.display();

/*
   Looping through objects ... 
*/
console.log("-");
console.log("Finally....  Let's loop through an object."); 
console.log("-");  

function showPropsAndValues(obj, objName) {
	var result = "";
	for (var i in obj) {
		result += objName + "." + i + " = " + obj[i] + "\n";
	}
	return result;
}	
  
console.log(showPropsAndValues(dog, "dog"));






 