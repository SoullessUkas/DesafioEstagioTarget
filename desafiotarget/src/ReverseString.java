import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine(); // String original

        String reversedString = reverse(originalString); // Chama a função para inverter a string

        System.out.println("String original: " + originalString);
        System.out.println("String invertida: " + reversedString);
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray(); // Converte a string em um array de caracteres

        int left = 0; // Índice do primeiro caractere
        int right = str.length() - 1; // Índice do último caractere


        // Inverte os caracteres trocando os caracteres da posição left com os da posição right
        while (left < right) {
            // Troca os caracteres
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move os índices para os próximos caracteres
            left++;
            right--;
        }

        // Converte o array de caracteres de volta para uma string
        return new String(chars);
    }
}