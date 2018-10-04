### Полезные настройки:
 Разобраться что делают команды.
 - `git config --global credential.helper store` 
 - `git config --global alias.`
 - `git config --global http.proxy http://login:pas@proxy:8080`
 - `git log --pretty=format:'%h %ad | %s%d [%an]' --graph --date=short`
 - `git log --graph --all --format=format:'%C(bold blue)%h%C(reset) — %C(bold green)(%ar)%C(reset) %C(white)%s%C(reset) %C(bold white)— %an%C(reset)%C(bold yellow)%d%C(reset)' --abbrev-commit --date=relative`
 - [еще немного полезных команд](https://tproger.ru/translations/most-common-git-screwupsquestions-and-solutions/amp/)
 - [ПРОЧИТАТЬ](https://habr.com/post/125999/)
 
## Как начать работать
 
 0. Войти на GitHub
 1. Открыть репозиторий <https://github.com/frozzen256/practice> (основной репозиторий лабораторных)
 2. Создать себе `Fork` этого репозитория
 3. Загрузить созданный форк себе на компьютер
 4. Создать к нему привязку `origin`
 5. Создать привязку `upstream` к оригинальному репозиторию 
 6. Создать новую ветку для доработок `devlp` с номером варианта задания 
 7. Произвести доработку и выполнить `commit`
 8. Отправить созданную ветку в свой репозиторий 
 9. Зайти в свой репозиторий на GitHub и выполнить запрос на внесение изменений в основной репозиторий лабораторных

#### Злые команды:

_Как удалить последний коммит_
 `git reset --soft HEAD^`
_Удалить коммит локально_
 `git reset HEAD~1 --hard`
_и на сервер_
 `git push -f`
