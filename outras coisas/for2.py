def desenha(h,l):
    if h>2:
        li = "#"*l
        li2 = "#"+" "*(l-2)+"#"
        print(li)
        for i in range(h-2):
            print(li2)
        print(li)
    else:
        li = l*"#"
        for i in range(h):
            print(li)
            
def main():
    l = int(input("digite a largura: "))
    h = int(input("digite a altura: "))
    desenha(h,l)

main()
