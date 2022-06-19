patterns:
    $hello = (салют|привет|здравствуй*|здарова|добрый (день|вечер))

theme: /

    state: Hello
        q!: $hello *
        a: Здравствуйте!
        go!: /Can I Help You?

    state: Can I Help You?
        a: Я могу вам помочь?

        state: Yes
            q!: * { (*можете|*можешь) * помочь } *
            q: * [думаю] (да|*можете|*можешь|надеюсь|хотелось бы) *
            a: Что Вас интересует?

        state: No
            q: * [да] [уже] (ничем|не надо|не нужно) [спасибо] *
            a: Хорошо. Буду рад помочь вам в следующий раз!
