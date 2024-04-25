package com.example.retrofit_opendb_test;

import java.util.List;

public class Question {
    /**
     * response_code : 0
     * results : [{"type":"multiple","difficulty":"medium","category":"Mythology","question":"What is the name of the Greek god of blacksmiths?","correct_answer":"Hephaestus","incorrect_answers":["Dyntos","Vulcan","Artagatus"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"Neptune&#039;s greek name was...","correct_answer":"Poseidon","incorrect_answers":["Ares","Zeus","Apollo"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"Which of these Roman gods doesn&#039;t have a counterpart in Greek mythology?","correct_answer":"Janus","incorrect_answers":["Vulcan","Juno","Mars"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"A minotaur is half human half what?","correct_answer":"Bull","incorrect_answers":["Cow","Horse","Eagle"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"What animal did Queen Pasipahe sleep with before she gave birth to the Minotaur in Greek Mythology?","correct_answer":"Bull","incorrect_answers":["Pig","Ox","Horse"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"Which of the following Mesopotamian mythological figures was NOT a deity?","correct_answer":"Enkidu","incorrect_answers":["Enki","Enlil","Enkimdu"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"Who was the Roman god of fire?","correct_answer":"Vulcan","incorrect_answers":["Apollo","Jupiter","Mercury"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"In African mythology, Anansi is a trickster and storyteller who takes the shape of which animal?","correct_answer":"Spider","incorrect_answers":["Wild dog","Monkey","Crocodile"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"The Maori hold that which island nation was founded by Kupe, who discovered it under a long white cloud?","correct_answer":"New Zealand","incorrect_answers":["Vanuatu","Fiji","Hawaii"]},{"type":"multiple","difficulty":"medium","category":"Mythology","question":"Which of the following is not one of the Greek Fates?","correct_answer":"Narcissus","incorrect_answers":["Clotho","Atropos","Lachesis"]}]
     */

    private int response_code;
    private List<ResultsBean> results;

    public Question(List<ResultsBean> results) {
        this.results = results;
    }

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * type : multiple
         * difficulty : medium
         * category : Mythology
         * question : What is the name of the Greek god of blacksmiths?
         * correct_answer : Hephaestus
         * incorrect_answers : ["Dyntos","Vulcan","Artagatus"]
         */

        private String type;
        private String difficulty;
        private String category;
        private String question;
        private String correct_answer;
        private List<String> incorrect_answers;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getCorrect_answer() {
            return correct_answer;
        }

        public void setCorrect_answer(String correct_answer) {
            this.correct_answer = correct_answer;
        }

        public List<String> getIncorrect_answers() {
            return incorrect_answers;
        }

        public void setIncorrect_answers(List<String> incorrect_answers) {
            this.incorrect_answers = incorrect_answers;
        }
    }
}

