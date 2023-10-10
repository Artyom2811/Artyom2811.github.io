let arr = [];

async function newGame(pathToFile) {
    //remove old list
    let oldList = document.getElementById("list");
    if(oldList != null) {
        oldList.remove();
    }

    await getJsonByPath(pathToFile);

    //create list
    let list = document.createElement('ol');
    list.id = 'list';
    let numberItem = 1;

    arr.forEach((element) => {
    //add to list
    let li = document.createElement("li");
    let preparedLi = getLiElement(li, element, numberItem, "-");
    list.appendChild(preparedLi);
    ++numberItem;
    });

    let sect = document.querySelector("section");
    sect.appendChild(list);

}

function getLiElement(li, element, numberItem, name) {
    li.setAttribute("id", "item" + (numberItem));

    //add button markAsAnswered
    let answeredButton = document.createElement("button");
    answeredButton.innerHTML = "+";
    answeredButton.style.backgroundColor = "#4CAF50";
    answeredButton.setAttribute("onclick", "markAsAnswered(" + numberItem + ")");
    li.appendChild(answeredButton);

    //add button getHint
    let hintButton = document.createElement("button");
    hintButton.innerHTML = "Hint";
    hintButton.style.backgroundColor = "#E9967A";
    hintButton.setAttribute("onclick", "getHint(" + numberItem + ")");
    li.appendChild(hintButton);

    let movieName = document.createElement("span");
    movieName.innerHTML = name;
    movieName.setAttribute("id", "itemName" + (numberItem));
    li.appendChild(movieName);

    let movieYear = document.createElement("span");
    movieYear.innerHTML = "(" + element.year + ")";
    movieYear.setAttribute("id", "itemYear" + (numberItem));
    li.appendChild(movieYear);

    return li;
}

function markAsAnswered(id) {
    let li = document.getElementById("item" + id);
    li.style.backgroundColor = "#4CAF50";
    let movie =  arr[(id - 1) ];
    li.innerHTML = movie.name + " (" +  movie.year + ")";
}

function getHint(id) {
    let currentName = document.getElementById("itemName" + id);
    let preparedName;
    let movie =  arr[(id - 1) ];
    if(currentName.innerText === "-") {
        preparedName = hideText(movie.name);
    } else {
    let indexOfFirstHideSymbol = document.getElementById("itemName" + id).innerText.indexOf("⌷");
    firstPartOfName = movie.name.substring(0, indexOfFirstHideSymbol + 1);
    secondPartOfName = hideText(movie.name.substring(indexOfFirstHideSymbol + 1, movie.name.length));
    preparedName = firstPartOfName + secondPartOfName;
    }
    currentName.innerHTML = preparedName;
}

function hideText(text) {
    return text.replace( /[0-9А-Яа-яA-Za-zёЁ]/g, "⌷");
}

function getJsonByPath(pathToFile) {
    return fetch('https://artyom2811.github.io/WEB-INF/m_quiz/' + pathToFile)
      .then(res => res.json())
      .then((out) => arr = out);
}

//TODO Добавить результат в процентном соотношении
//TODO Добавить фото режиссеров и актеров из IMDB

//TODO Увеличить шрифт
//TODO Увеличить растояние между кнопками


