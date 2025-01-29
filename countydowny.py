def nuts():
    while True:
        try:
            a = int(input("Enter a number:"))
            break

        except:
            print("Not a number!!!🤬🤬")

    for x in range(a+1):
        print(a-x)

nuts()
