def campeonato():
    rodadas  = [0,1,2]
    usuario = 0
    computador = 0
    for i in rodadas:
        print("\n**** Rodada {} ****\n".format(rodadas[i]))
        if (partida()):
            computador = computador + 1
        else:
            usuario = usuario + 1
        print("\n**** Final do campeonato! ****\n")
        print("Placar: Você {} x {} Computador".format(usuario, computador))

    
def computador_escolhe_jogada(n,m):
    if n <= m:
        return n
    else:
        if (n%(m+1))>0:
            return n%(m+1)
    return m

def usuario_escolhe_jogada(n,m):
    jogada = 0
    while jogada == 0:
        jogada = int(input("Quantas peças você vai tirar? "))
        if jogada > n or jogada < 1 or jogada > m:
            print("\nOops! Jogada inválida! Tente de novo.\n")
            jogada = 0
    return jogada

def partida():
    n = int(input("Quantas peças? "))
    m = int(input("Limite de peças por jogada? "))

    play_turn = (n%(m+1)) == 0
    vitoria = False

    while not vitoria:
        if (play_turn):
            print("\nVocê começa!")
            jogada = usuario_escolhe_jogada(n,m)
            play_turn = not play_turn
            if jogada == 1:
                print("\nVocê tirou uma peça")
            else:
                print("\nVocê tirou {} peça".format(jogada))
        else:
            print("\nComputador começa!")
            jogada = computador_escolhe_jogada(n,m)
            play_turn = not play_turn
            if jogada == 1:
                print("\nO computador tirou uma peça")
            else:
                print("\nO computador tirou {} peça".format(jogada))

        n = n-jogada
        if n == 1:
            print("Agora resta apenas uma peça no tabuleiro.\n")
        else:
            print("Agora restam {} peças no tabuleiro.\n".format(n))
            
        if (n == 0) and not play_turn:
            print("Fim do jogo! Você ganhou!")
            vitoria = True
        elif (n == 0) and play_turn:
            print("Fim do jogo! O computador ganhou!")
            vitoria = True

    if play_turn:
        return True #1
    else:
        return False #0

print("\nBem-vindo ao jogo do NIM! Escolha: \n")
print("1 - para jogar uma partida isolada")
print("2 - para jogar um campeonato")

jogo = False

while not jogo:
    opc = int(input("Digite sua opção: "))

    if opc == 1:
        print("\nVocê escolheu partida isolada")
        partida()
        break
    if opc == 2:
        print("\nVocê escolheu um campeonato")
        campeonato()
        break
    else:
        print("404!")
        jogo = False

