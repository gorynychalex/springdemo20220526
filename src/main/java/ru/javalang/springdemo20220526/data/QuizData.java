package ru.javalang.springdemo20220526.data;

import ru.javalang.springdemo20220526.model.Option;
import ru.javalang.springdemo20220526.model.Question;
import ru.javalang.springdemo20220526.model.Quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для генерации данных
 */

public class QuizData {

    private static List<Quiz> quizs;

    static {
        quizs = new ArrayList<>();

        // Вопросы первого теста
        List<Question> questions = new ArrayList<>();
        List<Option> options = new ArrayList<>();

        options.add(new Option("присвоить null всем ссылкам на объект",false));
        options.add(new Option("вызвать Runtime.getRuntime().gc()",false));
        options.add(new Option("вызвать метод finalize() у объекта",false));
        options.add(new Option("этого нельзя сделать вручную",true));
        options.add(new Option("вызвать деструктор у объекта",false));
        questions.add(new Question("Как можно уничтожить объект в Java?",options));

        options = new ArrayList<>();
        options.add(new Option("возвращает экземпляр класса",false));
        options.add(new Option("является итератором объектов",false));
        options.add(new Option("вызывает функцию обратного вызова",false));
        options.add(new Option("возвращает true, если объект является экземляром класса или его предком",true));
        questions.add(new Question("Какие задачи выполняет оператор instanceof",options));

        quizs.add(new Quiz("Java",questions));

        // Вопросы второго теста
        questions = new ArrayList<>();
        options = new ArrayList<>();
        options.add(new Option("поиск view в Manifest",false));
        options.add(new Option("вывод типа View",false));
        options.add(new Option("поиск нужного View и инициализация объекта в коде Activity",true));
        questions.add(new Question("Для чего предназначен метод findViewById()",options));

        options = new ArrayList<>();
        options.add(new Option("Pause Start View",false));
        options.add(new Option("Start Activity Pause",false));
        options.add(new Option("onCreate, onStart, onResume",true));
        questions.add(new Question("Стадии жизненного цикла приложения",options));

        quizs.add(new Quiz("Android",questions));

    }

    public static List<Quiz> getQuizs(){
        return quizs;
    }

    public static List<Question> getQuestionsByQuizId(int quizId){
        return quizs.get(quizId).getQuestionList();
    }
}
