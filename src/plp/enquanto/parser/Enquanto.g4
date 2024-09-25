grammar Enquanto;

programa : seqComando ';' ;     // sequência de comandos

seqComando: comando ';'(comando ';')*;

comando: ID ':=' expressao                                                                      # atribuicao
       | ID (',' ID)*? ':=' expressao (',' expressao)*?                                         # atribuicaoParalela
       | 'skip'                                                                                 # skip
       | 'se' booleano 'entao' comando ('senaose' booleano 'entao' comando)*? 'senao' comando	# se
       | 'enquanto' booleano 'faca' comando                                                     # enquanto
       | 'exiba' (TEXTO | expressao)                                                            # exiba
       | 'escreva' expressao                                                                    # escreva
       | '{' seqComando '}'                                                                     # bloco
       | 'para' ID 'de' expressao 'ate' expressao 'faca' comando                                # para
       | 'repita' expressao 'vezes' comando                                                     # repita
       | 'escolha' ID ('caso' expressao ':' comando )*? 'outro' ':' comando                     # escolha
       ;

expressao: INT                                           # inteiro
         | 'leia'                                        # leia
         | ID                                            # id
         | expressao '^' expressao                       # opBin
         | expressao '*' expressao                       # opBin
         | expressao '/' expressao                       # opBin
         | expressao ('+' | '-') expressao               # opBin
         | '(' expressao ')'                             # expPar
         ;

booleano: BOOLEANO                                       # bool
        | expressao '=' expressao                        # opRel
        | expressao '<>' expressao                       # opRel
        | expressao '<' expressao                        # opRel
        | expressao '<=' expressao                       # opRel
        | expressao '>' expressao                        # opRel
        | expressao '>=' expressao                       # opRel
        | 'nao' booleano                                 # naoLogico
        | booleano 'e' booleano                          # eLogico
        | booleano 'xou' booleano                        # xouLogico
        | booleano 'ou' booleano                         # ouLogico
        | '(' booleano ')'                               # boolPar
        ;


BOOLEANO: 'verdadeiro' | 'falso';
INT: ('0'..'9')+ ;
ID: ('a'..'z')+;
TEXTO: '"' .*? '"';

Comentario: '#' .*? '\n' -> skip;
Espaco: [ \t\n\r] -> skip;