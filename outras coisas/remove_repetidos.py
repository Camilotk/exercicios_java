def remove_repetidos(data):
    matriz = []
    for a in data:
        if data.count(a)<2 and data.count(a)>0:
            matriz.append(a)
        elif a not in matriz:
            matriz.append(a)
    return sorted(matriz)

v = ([3,21,3,4,2,1,2])
print(remove_repetidos(v))
