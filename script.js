function setBackButtonHeight() {
//Задание высоты для BackButton в зависимости от размера контента
//Получение высоты bodyStyle
var heightOfBackButton = document.getElementsByClassName("bodyStyle").item(0).offsetHeight
//Получение высоты экрана клиента
var heightOfScreen = document.documentElement.clientHeight
if (heightOfBackButton > heightOfScreen) {
document.getElementsByClassName("backButton").item(0).style.height = heightOfBackButton  + 'px'
} else {
  document.getElementsByClassName("backButton").item(0).style.height = heightOfScreen  + 'px'
}
}

function showMessage() {
  alert( 'Всем привет!' );
}

function getBodyHeight() {
  console.log(window.getComputedStyle(document.getElementsByClassName("bodyStyle").item(0)).height);
}


//Пример вызова из HTML
//<a href="#" onclick="showMessage()">click me</a>