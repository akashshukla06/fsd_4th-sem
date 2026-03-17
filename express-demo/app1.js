function greet(name, calback){
    console.log('hello' +name);
    calback();
}
function bye(){
    console.log('godbye');
f
}
greet('john',bye);