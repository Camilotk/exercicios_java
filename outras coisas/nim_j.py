def computador_escolhe_jogada(n,m):
    qp = i = 1

    if n<=m:
        qp = n
    else:
        i = n%(m+1)
        if i > 0:
            qp = i
        else:
            qp = m

    # deixar sempre múltiplos de (m+1) peças ao jogador oponente.
    if qp == 1:
        print('O computador tirou uma peça')
    else:
        print('O computador tirou',qp,' peças.')

    return qp


def usuario_escolhe_jogada(n,m):
    loop = True
    while loop:
        qp = int(input('Quantas peças você vai tirar?'))

        if qp > m or qp > n or qp <= 0:
            loop = True
            print('Oops! Jogada inválida! Tente de novo.')
        else:
            break

    if qp == 1:
        print('Você tirou uma peça.')
    else:
        print('Voce tirou',qp,' peças.')

    return qp


def partida():
    loop = True
    vezhumano = False
    qp = 0

    while loop:
        n = int(input('Quantas peças? '))
        m = int(input('Limite de peças por jogada? '))

        if m != 0 or m > n:
            loop = False
            if n%(m+1) == 0:
                vezhumano = True
                print('Voce começa!')
            else:
                vezhumano = False
                print('Computador começa!')

            while n > 0:
                if vezhumano:
                    qp = usuario_escolhe_jogada(n,m)
                    vezhumano = False
                else:
                    qp = computador_escolhe_jogada(n,m)
                    vezhumano = True

                n -= qp

                if n == 1:
                    print('Agora resta apenas uma peça no tabuleiro.')
                elif n > 1:
                    print('Agora restam',n,' peças no tabuleiro.')
        else:
            loop = True
            print('Especificação invalida, por favor, defina novamente:')

    return vezhumano


def campeonato():
    vRodada = 1
    print('Voce escolheu um campeonato!')
    pv = pc = 0

    while vRodada <= 3:
        print('**** Rodada ',vRodada,' ****')

        retorno = partida()

        if retorno == True:
            print('Fim do jogo! O computador ganhou!')
            pc += 1
        else:
            print('Fim do Jogo! Você ganhou!')
            pv += 1

        vRodada+=1

    print('**** Final do campeonato! ****')
    print('Placar: Você',pv,' X',pc,' Computador')


def main():
    print('Bem-vindo ao jogo do NIM! Escolha:')
    print('1 - para jogar uma partida isolada')

    vEscolha = int(input('2 - para jogar um campeonato'))

    if vEscolha == 2:
        campeonato()
    else:
        retorno = partida()

        if retorno == True:
            print('Fim do jogo! O computador ganhou!')
        else:
            print('Fim do Jogo! Você ganhou!')


main()
