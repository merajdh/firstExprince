package com.example.contactsnote.Model

import com.example.contactsnote.Model.DataQuestion

class Constant {
    companion object{
        fun getQuestion(): ArrayList<DataQuestion> {

            var ListQuestion = ArrayList<DataQuestion>()

            var question1 = DataQuestion(
                 1,
                "کدام کلمه با بقیه متفاوت می باشد" ,
                "Father",
                "sister",
                "mother",
                "nurse",
                4
                )

            var question2 = DataQuestion(
                2,
                "four + six =.......... " ,
                "twelve",
                "eleven",
                "ten",
                "seven",
                3
            )

            var question3 = DataQuestion(
                3,
                "A: “What’s your first name please?” B: “...................”" ,
                "a) Emami ",
                "b) Kashani ",
                "c) Kameli ",
                "d) Karim",
                4
            )


            var question4 = DataQuestion(
                4,
                "A:What’s her job? B: ………………." ,
                "a) He is a florist ",
                "b) She is a florist",
                "c) They are florists ",
                "d) I’m a florist",
                2
            )

            var question5 = DataQuestion(
                5,
                "خانم احمدی مادر دوستتان است میخواهید به او صبح بخیر بگویید از کدام عبارت استفاده میکنید؟" ,
                "a) Good morning Mr Ahmadi .",
                "b) Good afternoon Mrs Ahmadi .",
                "c) Good morning Miss Ahmadi .",
                "d) Good morning Mrs Ahmadi .",
                3
            )

            var question6 = DataQuestion(
                6,
                "شکل انگلیسی کلمه کدو ...... میشه." ,
                "rice",
                "zucchini",
                "kebab",
                "coffee",
                2
            )

            var question7 = DataQuestion(
                7,
                "کلمه ی ناهماهنگ را مشخص کنید." ,
                "a. January",
                "b. March",
                "c. May",
                "d. Saturday",
                4
            )

            var question8 = DataQuestion(
                8,
                " What is your……? I’m a nurse." ,
                "Age",
                "job",
                "birthday",
                "name",
                2
            )

            ListQuestion.add(question1)
            ListQuestion.add(question2)
            ListQuestion.add(question3)
            ListQuestion.add(question4)
            ListQuestion.add(question5)
            ListQuestion.add(question6)
            ListQuestion.add(question7)
            ListQuestion.add(question8)
            return ListQuestion

        }

    }
}