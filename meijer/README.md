# py-meijer

Python module for interacting with Meijer's mPerks.



## Commandline Program ```meijer```

### Shopping List.

Clear shopping list:

    $ meijer list clear

Add items to shopping list:

    $ meijer list add
    Enter your shopping list. Complete with a blank line.
    - Foo
    - Bar
    - Ipsum
    - Lorem

Show shopping list:

    $ meijer list show
    [ ] Lorem
    [ ] Ipsum
    [ ] Bar
    [ ] Foo

Adding a pre-set list:

    $ cat list
    1% Milk
    2% Milk
    4% Milk
    8% Milk

    $ meijer list add < list


### Bash & ZSH Completion

```meijer``` uses Click, so you can generate bash completion scripts https://click.palletsprojects.com/en/7.x/bashcomplete/

Temporary:

    eval "$(_MEIJER_COMPLETE=source meijer)"

Permanent:

    _MEIJER_COMPLETE=source meijer > ~/.meijer_completion.sh
    echo ". ~/.meijer_completion.sh" >> ~/.bashrc
