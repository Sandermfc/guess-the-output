# https://codegolf.stackexchange.com/questions/11441/ended-do-something-that-looks-like-something-else/11480#11480
a = []
for i in range(10):
	a.append(i * ++i)
for a[i] in a:
	print(a[i])
