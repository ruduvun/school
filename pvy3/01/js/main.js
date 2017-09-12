function listOfAnimals(data, start, count){
    try {
        if(isNaN(start)||isNaN(count)) throw "Is not a number";
        if(start < 0) throw "cannot be less than zero";
        if(start > data.length-1 || start+count > data.length-1) throw "cannot be greater than animal list";
    }
    catch(err) {
        return '<div>Error: ' + err + '</div>';
    }
    var list = [];
    for(var i = start; i < start+count; i++){
        list.push(data[i]);
    }
    return (list.length > 0) ? list : '<p>No items</p>';
}

console.log(listOfAnimals(json,0,10))   ;