function greet(name, calback){
    console.log('hello' +name);
    calback();
}
function bye(){
    console.log('godbye');

}
greet('john',bye);