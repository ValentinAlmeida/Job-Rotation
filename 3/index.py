
import json

f = open('3/dados.json')

dados = json.load(f)

# Declarando variáveis
anterior = 0
maior = 0
menor = 0
soma = 0
media = 0


for dia in dados:

    
    if (dia['fat']) != 0:
        anterior = dia['fat']
       
        if (anterior > maior):
            maior = anterior
       
        if(menor == 0):
            menor = anterior
        elif (anterior < menor):
            menor = anterior

        
        soma += dia['fat']

print('O maior faturamento foi de: R$ ' + str(maior) + '.')
print('O menor faturamento foi de: R$ ' + str(menor) + '.')


media = soma / len(dados)

dias = ''

for select in dados:
    if (select['fat']) != 0:
        if (select['fat']) > media:
           dias += (str(select['dia']) + ' ')
        
print('Os dias que a media mensal foi menor que o faturamento: ' + dias)