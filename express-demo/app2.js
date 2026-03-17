const EventEmitter = require("events");
const event = new EventEmitter();
    event.on('greet',() =>{
        console.log("hello");
    });
    event.emit('greet');