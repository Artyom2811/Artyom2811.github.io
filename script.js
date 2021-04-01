{
var heightOfBackButton = document.getElementsByClassName("bodyStyle").item(0).offsetHeight
document.getElementsByClassName("backButton").item(0).style.height = heightOfBackButton  + 'px'
}

function showMessage() {
  alert( 'Всем привет!' );
}


//Пример вызова из HTML
//<a href="#" onclick="showMessage()">click me</a>