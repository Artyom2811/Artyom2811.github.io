let arr = [];
let counter = 0;

async function startNewGame() {
    counter = 0;
    //get list of questions
    let a = await getQuestionsByJsonPath('erotic.json');
    let b = await getQuestionsByJsonPath('controversial.json');
    let c = await getQuestionsByJsonPath('skeletons_in_closet.json');
    arr = a.concat(b, c);

    //shuffle
    arr = arr.sort(() => Math.random() - 0.5);

    //display first question
    writeNextQuestion();

    counter++;
}

function nextQuestion() {
    //display next question
    writeNextQuestion();

    counter++;
}

function writeNextQuestion() {
    let questionField = document.getElementById("question");
    questionField.innerHTML = arr[counter].type + ' - ' + arr[counter].name;
}

function getQuestionsByJsonPath(pathToFile) {
    return fetch('https://artyom2811.github.io/WEB-INF/games/truth_detector/questions/' + pathToFile)
      .then(res => res.json());
}
