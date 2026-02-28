package util;

import java.security.MessageDigest;

public class SHA1Util {

    public static String gerarHash(String entrada) {
        try {
            
            MessageDigest md = MessageDigest.getInstance("SHA-1"); // Cra instância do algoritimo SHA-1

            byte[] bytes = md.digest(entrada.getBytes("UTF-8")); // Converte em bytes e gera digest

            StringBuilder sb = new StringBuilder(); // Converte byytes para hexadecimal

            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
