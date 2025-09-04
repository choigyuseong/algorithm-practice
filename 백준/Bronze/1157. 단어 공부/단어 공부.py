Word = input().upper()
Count = []
max = -1
index = 0
more = 0
for i in range(65, 91) :
    Count.append(Word.count(f'{chr(i)}'))
    if max < Count[i - 65] :
        max = Count[i - 65]
        index = i
        more = 0
    elif max == Count[i - 65] :
        more = 1
if more != 1 :
    print(chr(index))
else :
    print("?")