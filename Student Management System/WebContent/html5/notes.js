var myName = { 1: "Chris" };
console.log(myName);

var myObject = new Object();
var myOtherObject = {};
myObject['1'] = "Chris";
myObject['2'] = "Sally";
console.log(myObject);

var myOtherObj = {
   firstName: "Chris",
    lastName: "Sally",
    age: 50,
    phone: "555-555-5555",
};

myOtherObj['unique value'] = "Ashley";
console.log(myOtherObj['age']);

//var myObj = {
 //   firstName: "Chris",
 //   lastName: "Smith",
 //   age: 50,
 //   numbers: {
   //     mobile: "555-1234",
   //     home: "555-5555",
   // },
   // address: "123 Fake St.",
//}

//console.log(myObj.numbers.home);


var donut = {
    type: "coconut",
    glazed: true,
    sweetness: 8,
    hasChocolate: false,
    sayType : function() {
        console.log("Type: "+ this.type);
    }
}
donut.sayType();


var myNamesArray = new Array();
myNamesArray[0] = "Chris";
myNamesArray[1] = "Newt";
myNamesArray[2] = "Brian";
console.log(myNamesArray[40]);



var myNamesArray = ["Chris", "Hell", "John", "jane"];
myNamesArray.push(["Corey", "Sally", "Jimbo"]);
console.log(myNamesArray[4]);

var myNamesArray = ["Chris", "Hell", "John", "Jane"];
var sorteArray = myNamesArray.sort();
console.log(sorteArray);



var myOtherArray = ["Jake", "Amy", "Timmy"];
var joinedArray = myNamesArray.join("-");

console.log(joinedArray);


var coconutDonut = new Donut("coconut", false, 8, true);
var vanillaDonut = new Donut("vanilla", true, 10, false);

var myDonuts = [coconutDonut, "dashd", "sajhdf", vanillaDonut];
var donutLength = myDonuts.length;
var lastDonut = myDonuts[donutLength-1];
lastDonut.showSweetness();


var myNamesArray = ["Chris", "Hell", "John", "Zane"];
var slicedArray = myNamesArray.slice(myNamesArray.length-1);
console.log(slicedArray);


var myName = "Bob";

function sayHi() {
    console.log("Hi" + " " + myName);
}
sayHi();


var count = 1;
function increase() {
  count += 1;
  console.log(count)
}
increase();


var myName = 'Chris';

function sayNewName() {
  var $myName = 'Bob'
  console.log($myName)
}
sayNewName()


function sayHi() {
    var shouldSayHi = false; //use let
    
  
    if(shouldSayHi === true) //can be written as (shouldSayHi) only 
    {
        myName = "Cris";
        console.log("Hi" + myName)
    }
    else{
      myName = "Bob";
      console.log("Hi" + " " + myName)
    }
  }
  sayHi();


  const myArray = [1, 2, 3];
console.log(myArray);
myArray.push(4);
console.log(myArray);


const numberFive = 5;

const stringFive = "5";
const stringConversion = parseInt(stringFive);

console.log(numberFive == stringConversion);


const bAB = 123;
const cOI = 123;

if(bAB >= cOI) {
    console.log("You can purchase this item!")
}

let myNumber = 100;

function addTwenty(num) {
    return num + 20;
}

console.log(addTwenty(myNumber))
console.log(myNumber);


let myString = "I am here";

function addString(string) {
    return "Hello " + myString;
}
console.log(addString(myString));


function squareAndMultiply(num1, num2) {
    function squarer(x) {
        return x * x;
    }
    function multiplyBy10(y) {
        return y * 10;
    }
    return squarer(num1) * squarer(num2);
}

    const first = squareAndMultiply(2, 2);
    const second = squareAndMultiply(3, 3);
    const third = squareAndMultiply(4, 4);

    console.log(third)


    function personFormatter(firstName, lastName, age) {
        function formatNames(arg1, arg2) {
            return arg1 + " " + arg2;
        }
        const formattedName = formatNames(firstName, lastName);
        return formattedName;
    }
    console.log(personFormatter("Chris", "Jones", 20))


    // const multiplier = (num1, num2) => {
    // return num1 * num2;
// }

// console.log(multiplier(5, 10));

const users = [
    {name: "Chris", age: 60},
    {name: "Chris", age: 60},
    {name: "Chris", age: 60},
];

const userNameList = users.map(function(user) {
    return user.name;
});
console.log(userNameList);

let contrA = "I am a string";

console.log(contrA)


const users = [ 
    {name: "Billy", age: 18},
    {name: "Chris", age: 20},
    {name: "Lilly", age: 22}
];

const mapUserNames = (myArr) => myArr.map((user) => {
    return user.name;
});
console.log(mapUserNames(users));


const num = [1,2,3,4,5,6,7,8,9,10];

const filteredNumbers = num.filter(function(num) { // can remove funtion keyword too. need practice
    return num % 2 === 0;
});
console.log(filteredNumbers);



const num = [1,2,3,4,5,6,7,8,9,10];

const filteredNumbers = num.filter((num) => 
                        num % 2 === 0
);

const doubledNumbers = (num) => {
    const numberContainer = [];
    num.forEach((n) => {
        const doubled = n * 2;
        numberContainer.push(doubled);
    }
    );
    return numberContainer;
}

console.log(doubledNumbers(num));



function numberMultiplier(x, y)     {  //can put directly here x and y//
    x = x || 5;
    y = y || 10;
    return x * y;
}
const initialString = "How are you?"
function stringSplitter(str=initialString) {
    return str.split(" ");
}
console.log(stringSplitter("I am in control, I am doing great"));


const bankAccount = {
    canSpendMoney: true,
    balance: 100
}

function purchaseItem(price, acct=bankAccount) {
    if(acct.canSpendMoney) {
        acct.balance -= price;
        if(acct.balance <= 0) {
            acct.canSpendMoney = false;
        }
        return true;
    } else {
        return false;
    }
}
console.log(purchaseItem(10))
console.log(purchaseItem(1))

//statement is returned false after the total balance goes 0



const bankAccount = {
    canSpendMoney: true,
    balance: 100
}

function purchaseItem(price, acct=bankAccount) {
    if(acct.canSpendMoney) {
        acct.balance -= price;
        if(acct.balance <= 0) {
            acct.canSpendMoney = false;
        }
        return true;
    } else {
        return false;
    }
}
console.log(purchaseItem(100))
console.log(purchaseItem(9))


//statement is returned false after the total balance goes 0


function logAllArguments(x) {
    const args = Array.prototype.slice.call(arguments, logAllArguments.length);
    console.log(args);
}

logAllArguments(6, 5, 2, 10, 6);


function multiply(multiplier, ...nums) {
    return nums.map((n) => multiplier * n)
}

console.log(multiply(19, 5, 6))



function Dog(years, breed) {
    this.age = years;
    this.type = breed;
    setInterval(() => {
        this.age += 1;
        console.log(this);
    }, 1000)

}

const spike = new Dog(3, "Chihuahua");
const dilo = new Dog(2, "Sheperd");


function numChecker(num) {
    let value;
    switch(num) {
        case 0:
        case 1:
        case 2:
            value = "Low range";
            break;
        case 3:
        case 4:
        case 5:
            value = "Mid range";
            break;
        case 6:
        case 7:
        case 8:
            value = "High range";
            break;
            default:
            value = "Input number between 0-8";
            console.log(value);
                return;
    }
    setVolume(value);
}
function setVolume(n) {

    console.log("Volume set at " + n);
}
numChecker(8);


let num1 = 0;
let num2 = 0;
while(num1 < 8) {
    num1 += 1;
    num2 += num1;
    console.log(num2);
}

const names = ["Chris", "Joe", "Bob", "Jean", "Amy"];
let index = 0;

while(true) {
    if(names[index] === "Joe") {
        // console.log(names[index]);
        break;
    }
    index += 1;
}


const names = ["Chris", "Bob", "Joe", "Jane", "Amy"];

function nameLooper(arr, userName) {
    let index = 0;
    while(index < arr.length)
        if(arr[index] === userName) {
            console.log(arr[index]);
            break;
        }
        index += 1;
}
nameLooper(names, "Chris");
}

for(var i = 0; i < 10; i += 1) {
    console.log(i);
}

const iceCreams = ["Vanilla", "Chocolate", "Strawberry", "Sunday"];
for(var i = 0; i < iceCreams.length; i+=1) {
    console.log(iceCreams[i]);
}

let x = 0;
while (x < 10) {
    x += 1;
    if(x === 5) {
        console.log("I am being skipped :(")
        break;
    }
    console.log(x);
    
}

outerLoop:
for(let i = 0; i < 10; i += 1) {
    console.log("Loop #" + i);
    innerLoop:
    for (let a = 0; a < 10; a += 1) {
        console.log("Inner loop #" +a)
        if (a === 3) {
            break innerLoop;
        }
    }
}

//set timed message output

setTimeout(function(){
    console.log("ONe second has PASsed")
}, 1000)


function looper(value) {
    setTimeout(function() {
        console.log(value);
    }, value * 1000);
}

for(var i = 0; i < 10; i++) {
    looper(i);
}

//let is block bound and not function bound

for(let i = 0; i < 10; i += 1) {
    setTimeout(() => {
        console.log(i);
    }, i * 1000);
}



const users = { 1: "Sally", 2: "Billy", 3: "Ashley", 4: "John"};

for(let i in users) {
    console.log(i);
}

const users = { 1: "Sally", 2: "Billy", 3: "Ashley", 4: "John"};

for(let i in users) {
 let newUser = users[i];
 newUser = "Redacted";
 console.log(newUser);
}

const users = { 1: "Sally", 2: "Billy", 3: "Ashley", 4: "John"};

for(let i in users) {
 if (users[i] === "Sally") {
     users[i] = "Unknown";
 }
 console.log(users[i]);
}

const drinks = ["coffee", "sprite", "tea", "coke"];
drinks.forEach((d) => {
    console.log(d);
})


//So this one is a new loop in yes six

// used to loop over iterable objects i.e. arrays strings.

// There's also this concept of maps sets which we're not really going to get into at this point but just


//For in loop

//loop through the objects properties in arbitrary order

const drinks = ["coffee", "sprite", "tea", "coke", "pepsi"];
for(const d of drinks) {
    // console.log(d);
}

const myString = "Hello!";
for(const character of myString) {
    // console.log(character)
}

const originalArray = [10, 15, 20, 25, 30];

function numIncreaser(arr, numToIncBy) {

    for(let num of arr){
    num += numToIncBy;
    console.log(num)
    }
}
numIncreaser(originalArray, 30)


const originalArray = ["Chris", "Chris"]