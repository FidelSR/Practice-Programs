//console.log("Hello world");
var timeFormat = "Standard";
function changeTimeFormat(flag) {
    if (flag === 1) {
        timeFormat = "Military";
    }   
    if (flag === 2) {
        timeFormat = "Standard";
    }
}

function showTime() {
    const date = new Date();
    const options = {weekday: 'long', day: 'numeric', month: 'long', year: 'numeric', hour12: true};
    const time12h = date.toLocaleTimeString(undefined,options);

    if (timeFormat === "Military") {
        document.getElementById('demo').textContent = "Current time: "+ date;
    } 
    
    if (timeFormat === "Standard") {
        document.getElementById('demo').textContent = "Current time: "+ time12h;
    }
}