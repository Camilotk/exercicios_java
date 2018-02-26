def desenha(h,l):
    li = l*"#"
    for i in range(h):
        print(li)
            
def main():
    l = int(input("digite a largura: "))
    h = int(input("digite a altura: "))
    desenha(h,l)

main()
