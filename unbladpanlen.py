def check(mt_string):
    bracket =['{}','[]','()']
    while any(x in mt_string for x in bracket):
        for br in bracket:
            my_string=my_string.replace(br,"")
    return not my_string
    string="[]{{}}["
    print(string,"-","Balanced"
          if check(string) else "unblanced")
