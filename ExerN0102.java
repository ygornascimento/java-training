/*
-- Enunciado:
Nível 1 — Exercício 2: validar código de cliente

Implemente:

static boolean codigoValido(String codigo)

Um código é considerado válido somente quando satisfaz todas estas regras:

foi informado;
possui exatamente 8 caracteres;
os 2 primeiros caracteres são letras maiúsculas;
os 6 caracteres restantes são números;
não pode conter espaços.

-- Meu raciocínio:
1. Validar se código recebido está ou não null.
2. Validar se contém espaços (prefiro fazer esse tipo de validação de campo antes de validar regras de negócio)
        pra isso, vou precisar percorrer e decompor a String que vou receber, identificar o espaço para removê-lo do array,
        criar um array novo com o conteúdo sem o espaço, adicionar esse novo array à varável a ser usada.
        Como Java identifica o espaço? Depois de aprender mais sobre, vi que não será necessário fazer isso, pois posso usar o contains().
3. Validar se os dois primeiros caracteressão letras maiúsculas.
        Aprender como o Java identifica letras maiúsculas pra checar em uma condição. Antes disso, vou precisar percorrer
        a String.
4. Validar se os 6 próximos caracteres são números.
        Aprender como Java trata String/Char pra poder discernir o que é número o que não é.

-Dependendo como for, seria melhor criar um template de código aceito e fazer a comparação com o que vier pela variável.
-
*/

public class ExerN0102 {
    public static void main (String[] args) {
        String valido = "AB123456";
        String invalido = "AB12X456";
        String invalido2 = "Ab12X456";
        String invalido3 = "aB12X456";
        String withSpace = "AB 123456";
        String emptyString = "";
        String spaceString = " ";

        System.out.print(codigoValido(valido));
    }

    static boolean codigoValido(String codigo) {

        if (codigo == null || codigo.isBlank()) {
            System.out.print("Não há conteúdo a ser analisado! ");
            return false;
        } else if (codigo.contains(" ")) {
            System.out.print("Conteúdo contém espaços! ");
            return false;
        } else if (codigo.length() != 8) {
            System.out.print("Conteúdo não contém caracteres mínimos! ");
            return false;
        } else {
            boolean isUpperFirstChar = Character.isUpperCase(codigo.charAt(0));
            boolean isUpperSecondChar =  Character.isUpperCase(codigo.charAt(1));

            if (!isUpperFirstChar || !isUpperSecondChar) {
                System.out.print("Primeiros caracteres precisam ser UpperCase! ");
                return false;
            } else {
                String lastSixChars = codigo.substring(codigo.length() - 6);
                int isDigit = 0;

                for (int i = 0; i < lastSixChars.length(); i++) {

                    if(charAt(i)) {
                        isDigit =+ 1;
                    }
                }
                if (isDigit == 5) {
                    System.out.print(" Código válido! ");
                    return true;
                }
            } 
        }

        return false;
    }
}